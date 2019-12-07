//@ sourceURL=js/buy.js
// 上面的代码 后面路径写js文件的路径 保证浏览器在调试时 可以加载到该js页面
var vm = new Vue({
		el: "#buy",
		data: {
			pageInfo:{},
			pageInfo2:{},
			list: [],
			list2:[],
			order:{},// 主单
			details:[],// 明细单
			vender:[],// 供应商
			catagory:[],// 类型
			queryCondition: {}, // 保存查询条件
			type: 1, // 1不显示 2成功 3失败
			valid: [true,true,true,true],// 记录表单数据校验结果 默认都是通过的
			flag: true // 标记是否可以提交数据 默认可以
		},
		
		methods:{
			// 主单分页
			goPage: function(pageNum){
				// 查询条件中携带要查询的页码
				this.queryCondition.pageNum = pageNum;
				var params = {
						params:this.queryCondition
				}
				this.$http.get("buy/select",params).then(
						(resp) => {
							this.pageInfo = resp.body;
							this.list = resp.body.list;
							// console.log(this.pageInfo);
						},
						(resp) => {
							
						}
				);
			},
			// 明细分页
			goPage2: function(pageNum){
				// 查询条件中携带要查询的页码
				this.queryCondition.pageNum = pageNum;
				var params = {
						params:this.queryCondition
				}
				this.$http.get("buy/select3",params).then(
						(resp) => {
							this.pageInfo2 = resp.body;
							this.list2 = resp.body.list;
						},
						(resp) => {
							
						}
				);
			},
			// 遍历供应商
			selectVender: function(){
				var params = {
						params:this.queryCondition
				}
				this.$http.get("buy/select2",params).then(
						(resp) => {
							this.vender = resp.body;
						},
						(resp) => {
							
						}
				);
			},
			// 遍历车辆类别
			selectCatagory: function(){
				
				this.$http.get("buy/select4").then(
						(resp) => {
							this.catagory = resp.body;
						},
						(resp) => {
							
						}
				);
			},
			// 查看详情
			selectDiv:function(item){
				this.details = [];
				this.order= {};
				this.queryCondition.order_id = item.order_id;
				this.order = item;
				this.goPage2(1); // 显示第1页数据
				
			},
			// 点击新增
			addDiv:function(){
				dateDel();
				this.details = [];
				this.order= {};
				this.selectVender();
				this.selectCatagory();
				
				valid: [true];
			},
			
			
			// 点击保存按钮操作
			save: function(){
				date();
				// 数据校验
				var urlOk = /^[G][C][0-9]{5,}$/.test(this.order.order_code);
				var urlOk1 = /^[0-9]/.test(this.order.buy_date);
				var urlOk2 = /^[0-9]+$/.test(this.order.buy_num);
				var urlOk3 = /^[0-9]+$/.test(this.order.buy_price);
				if(urlOk&& urlOk1 && urlOk2 && urlOk3){
					this.flag = true;
				}else{
					this.flag = false;
				}
				this.valid = [urlOk,urlOk1,urlOk2,urlOk3];
				
				if(this.flag){// 可以提交
					
					this.order.details = this.details;
					
					url = "buy/insert";
					this.$http.post(url,this.order).then(
							(resp) => {
								var r = resp.bodyText;
								// 关闭窗口
								$("#addDiv").modal('hide');
								if(r == "success"){
									// 刷新当前 页
									this.goPage(this.pageInfo.pageNum);
									
									this.type = 2;
								}else{
									this.type = 3;
								}
								setTimeout('vm.type = 1',3000);
								this.order = {};
								this.details = [];
							},
							(resp) => {
								
							}
					);
					
				}
	
			}
		}
	});
	// 点击新增明细
	function add(){
		// 修改model
		var detail = {catagory_id:"",batch_no:"",price:"",remark:""};
		vm.details.push(detail);
	}
	//点击删除明细
	function del(index){
		vm.details.splice(index, 1);
	}
	//日期获取
	function date(){
		 var date=document.getElementById("date");
		 vm.order.buy_date= date.value;
	}
	//日期清除
	function dateDel(){
		 var date=document.getElementById("date");
		 date.value = "";
	}
	vm.goPage(1); // 显示第1页数据
	