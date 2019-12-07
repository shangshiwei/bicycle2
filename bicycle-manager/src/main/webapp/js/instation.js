//@ sourceURL=js/instation.js
// 上面的代码 后面路径写js文件的路径 保证浏览器在调试时 可以加载到该js页面
var vm = new Vue({
		el: "#instation",
		data: {
			pageInfo:{},
			pageInfo2:{},
			pileId:[],// 车桩
			bickId:[],// 车辆
			bicycles: [],// 车辆数组
			station:{},// 车点对象
			stations:[],// 车点数组
			piles:[],// 车桩数组
			bicycle_info:[],
			queryCondition: {}, // 保存查询条件
			type: 1, // 1不显示 2成功 3失败
			term:true,
			flag: true // 标记是否可以提交数据 默认可以
		},
		
		methods:{
			// 车辆分页
			goPage: function(pageNum){
				// 查询条件中携带要查询的页码
				this.queryCondition.pageNum = pageNum;
				var params = {
						params:this.queryCondition
				}
				this.$http.get("instation/select1",params).then(
						(resp) => {
							this.pageInfo = resp.body;
							this.bicycles = resp.body.list;
							// console.log(this.pageInfo);
						},
						(resp) => {
							
						}
				);
			},
			// 车点分页
			goPage2: function(pageNum){
				// 查询条件中携带要查询的页码
				this.queryCondition.pageNum = pageNum;
				var params = {
						params:this.queryCondition
				}
				this.$http.get("instation/select2",params).then(
						(resp) => {
							this.pageInfo2 = resp.body;
							this.stations = resp.body.list;
						},
						(resp) => {
							
						}
				);
			},
			// 根据车点查询车桩
			selectDiv: function(item){
				this.station = item;
				this.$http.post("instation/select3",item,{emulateJSON: true}).then(
					(resp) => {
						this.piles = resp.body;
					},
					(resp) => {
							
					}
				);
			},
			// 选择车点
			seDiv:function(item){
				// 车点分页
				this.goPage2(1); // 显示第1页数据
				
			},
			save:function(){
				// 关闭窗口
				$("#selectDiv").modal('hide');
			},
			// 点击确定入桩
			ok:function(){
				var bickId = this.bickId;
				var pileId = this.pileId;
				
				if(bickId.length == pileId.length){
					for(var i=0;i<bickId.length;i++){
						var info = {};
						info.bicycle_id = bickId[i];
						info.pile_id = pileId[i];
						this.bicycle_info.push(info);
					}
					this.flag=true;
				}else{
					this.term=false;
					this.flag=false;
				}
				setTimeout('vm.term = true',2000);
				if(this.flag){
					url = "instation/bicycleToPile";
					this.$http.post(url,this.bicycle_info).then(
							(resp) => {
								var r = resp.bodyText;
								// 关闭窗口
								$("#seDiv").modal('hide');
								if(r == "success"){
									// 刷新当前 页
									this.goPage(this.pageInfo.pageNum);
									
									this.type = 2;
								}else{
									this.type = 3;
								}
								setTimeout('vm.type = 1',3000);
								vm.bickId=[];
								vm.pileId=[];
								vm.bicycle_info=[];
							},
							(resp) => {
								
							}
					);
				}
			},
			
		}	
	});
	
	vm.goPage(1); // 显示第1页数据
	