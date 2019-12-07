//@ sourceURL=js/syuser.js
// 上面的代码 后面路径写js文件的路径 保证浏览器在调试时 可以加载到该js页面
var vm = new Vue({
		el: "#syuser",
		data: {
			pageInfo:{},
			list: [],
			roles:[],
			isUpdate: false, // 标记是否是修改操作
			syuser:{},// 保存新增和修改的数据对象
			queryCondition: {}, // 保存查询条件
			type: 1, // 1不显示 2成功 3失败
			valid: [true,true,true,true],// 记录表单数据校验结果 默认都是通过的
			flag: true // 标记是否可以提交数据 默认可以
		},
		
		methods:{
			goPage: function(pageNum){
				// 查询条件中携带要查询的页码
				this.queryCondition.pageNum = pageNum;
				var params = {
						params:this.queryCondition
				}
				this.$http.get("syuser/select",params).then(
						(resp) => {
							this.pageInfo = resp.body;
							this.list = resp.body.list;
						},
						(resp) => {
							
						}
				);
			},
			selectRoles: function(){
				// 查询所有权限
				this.$http.get("role/select2").then(
						(resp) => {
							this.roles = resp.body;
						},
						(resp) => {
							
						}
				);
			},
			// 点击新增按钮
			addDiv: function(){
				this.isUpdate = false;
				this.syuser = {};// 清空表单数据
				this.valid =[true,true,true,true];
				this.flag = true;
			},
			// 点击修改按钮
			updateDiv: function(item){
				this.isUpdate = true;
				this.syuser = {};// 清空表单数据
				this.syuser = item;
				this.valid = [true,true,true,true];
				this.flag = true;
			},
			// 点击删除按钮
			deleteDiv: function(item){
				this.syuser = {};// 清空表单数据
				this.syuser = item;
				url = "syuser/delete";
				this.$http.post(url,this.syuser,{emulateJSON: true}).then(
						(resp) => {
							var r = resp.bodyText;
							if(r == "success"){
								// 刷新当前页
								this.goPage(this.pageInfo.pageNum);
								this.type = 2;
							}else{
								this.type = 3;
							}
							setTimeout('vm.type = 1',3000);
							this.syuser = {};
						},
						(resp) => {
							
						}
				);
			},
			// 点击保存按钮操作
			save: function(){
				// 数据校验
				var idOk = /^[0-9]{1,5}$/.test(this.syuser.roleId);
				var urlOk = /^[0-9a-zA-Z]{1,10}$/.test(this.syuser.loginName);
				var naOk = /^[\u4e00-\u9fa5]{1,10}$/.test(this.syuser.username);
				var descOk = /^[0-9a-zA-Z]{1,10}$/.test(this.syuser.password);
				if(urlOk && descOk && idOk && naOk){
					this.flag = true;
				}else{
					this.flag = false;
				}
				this.valid = [idOk,urlOk,naOk,descOk];
					
				if(this.flag){// 可以提交
					if(this.isUpdate){
						url = "syuser/update";
					}else{
						url = "syuser/insert";
					}
					this.$http.post(url,this.syuser,{emulateJSON: true}).then(
							(resp) => {
								var r = resp.bodyText;
								// 关闭窗口
								$("#optDiv").modal('hide');
								if(r == "success"){
									// 刷新当前 页
									
									this.goPage(this.pageInfo.pageNum);
									
									this.type = 2;
								}else{
									this.type = 3;
								}
								setTimeout('vm.type = 1',3000);
								this.syuser = {};
							},
							(resp) => {
								
							}
					);
					
				}
	
			}
		}
	});
	
	vm.goPage(1); // 显示第1页数据
	vm.selectRoles();
