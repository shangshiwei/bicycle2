//@ sourceURL=js/map.js
// 上面的代码 后面路径写js文件的路径 保证浏览器在调试时 可以加载到该js页面
	
var vue = new Vue({
	el: "#container",
	data: {
		mks:[],
		pile:[]
	},
	//查询车站信息
	methods:{
		selectMap:function(){
			this.$http.post("selectMap").then(
				(resp) => {
					var mapPoints = resp.body;
					var i = 0;
					map.addOverlay(marker);
					map.enableScrollWheelZoom(true);
					for (; i < mapPoints.length; i++) {
						var points = new BMap.Point(mapPoints[i].longitude, mapPoints[i].latitude);//创建坐标点
						var opts = {
							width : 250,
							height : 150,
							title :"车点："+mapPoints[i].station_name,
							enableMessage:true//设置允许信息窗发送短息
						};
						
						var infoWindows = new BMap.InfoWindow("车点编号"+mapPoints[i].station_code+"</br>车桩数量："+mapPoints[i].bicycle_pile_num+"</br>现在有："+mapPoints[i].bicycle_num+"辆车</br>地址："+mapPoints[i].address+
						"</br><input type='button' value='车桩详情' onclick='selectPile(\""+mapPoints[i].station_id+"\")'>", opts);
						markerFun(points, infoWindows);
					}
				},
				(resp) => {
					
				}
			);
		},
	}
});
function selectPile(id){
	document.getElementById("container").style.display="none";
	document.getElementById("selectPileDiv").style.display="block";
	$.ajax({
		url: "selectPileMap",// 必须属性 请求路径
		type: "post", //设置请求方法 默认是get
		data: {"stationId":id}, // 请求参数
		dataType: "json", //设置相应回来的数据转换后的数据格式
		//请求成功之后的回调函数 data就是响应数据
		success: function(dataList){
			$("#users").html("");
			for (var i = 0; i < dataList.length; i++) {
				var tr = $("#users").get(0).insertRow(-1);
				tr.insertCell(0).innerHTML = dataList[i].pile_id;
				tr.insertCell(1).innerHTML = dataList[i].pile_code;
				tr.insertCell(2).innerHTML = dataList[i].status ==1? "有车": "无车";
				tr.insertCell(3).innerHTML = dataList[i].bicycle_id;
				
			}
		},
		//请求错误 之后的回调函数 
		error: function(http, textStatus){
			
		}
	});	
}
function exit(){
	document.getElementById("container").style.display="block";
	document.getElementById("selectPileDiv").style.display="none";
}
vue.selectMap();
