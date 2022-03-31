layui.config({
    base: './js/modules/' //你存放新模块的目录，注意，不是layui的模块目录
}).extend({
    modules_index:'md_index',
});
$(function(){
    var mychart_count=echarts.init(document.getElementById("echarts-count"));
    var option_count={
    	title:{text:"销售概况统计图"},
    	tooltip:{},
    	legend:{data:["成交量","销量","退货"]},
    	xAxis:{data:["手机","电脑","平板","耳机","电池","鼠标"]},
    	yAxis:{},
    	series:[
    	{name:"成交量",type:"bar",data:[5,10,15,20,25,30]},
    	{name:"销量",type:"bar",data:[10,20,30,40,50,60]},
    	{name:"退货",type:"bar",data:[5,10,15,20,25,30]}
    	]
    };
    mychart_count.setOption(option_count);
    var mychart_task=echarts.init(document.getElementById("echarts-task"));
    var option_task={
    	title:{text:"今日任务概况"},
    	series:[
    	{name:"任务概况",type:"pie",radius:"55%",data:[
    	{value:235,name:"待处理订单"},
    	{value:68,name:"待发货订单"},
    	{value:28,name:"待退货审核"},
    	]}
    	]
    };
    mychart_task.setOption(option_task);

    $("#task-link>ul>li").hover(function() {
        $(this).addClass('layui-anim layui-anim-scale');
    }, function() {
        $(this).removeClass('layui-anim layui-anim-scale');
    });
});