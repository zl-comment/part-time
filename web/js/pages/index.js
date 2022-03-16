layui.config({
  base: '\\js\\modules' //你存放新模块的目录，注意，不是layui的模块目录
}).extend({
	modules_index:'md_index',
});
layui.use(['modules_index'],function(){
	var modules_index=layui.modules_index
	,element=layui.element;
	//监听左侧导航点击
  	element.on('nav(nav_left)', function(elem){
	    var url=elem.attr("src");
	    console.log(url);
	    var id=elem.attr("data-id");
	    var titlename=elem.text();
	    if(url){
	    	modules_index.addtab(url,id,titlename);

		}
  	});
  	//监听头部右侧导航点击
  	element.on('nav(nav_header_right)',function(elem){
  		if(elem.attr("data-id")==="logout"){
  			modules_index.logout();
  		}
  	});
});
