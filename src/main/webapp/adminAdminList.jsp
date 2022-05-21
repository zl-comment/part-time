<%--
  Created by IntelliJ IDEA.
  User: zhang
  Date: 2022/5/17
  Time: 13:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Layui</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="./static/layui/css/layui.css"  media="all">

</head>
<body>
<script src="./static/layui/layui.js" charset="utf-8"></script>
<script src="./static/js/jquery.min.js"></script>


<fieldset class="layui-elem-field layui-field-title" style="margin-top: 50px;">
    <legend>管理员表格</legend>
</fieldset>
<%--搜索功能--%>
<%--<div style="text-align: left" id='btn'>

    <div class="layui-inline">
        <input class="layui-input" name="cpyname" id="cpyname" autocomplete="off" placeholder="请输入企业名称">
    </div>
    <div class="layui-inline">
        <input class="layui-input" name="cpyaddress" id="cpyaddress" autocomplete="off" placeholder="请输入企业地址">
    </div>
    <button class="layui-btn" data-type="reload">搜索</button>
</div>
<table class="layui-hide" id="test"></table>--%>
<%--分割线--%>

<%--table本体--%>
<table id="admin" lay-filter="admin"></table>
<%--分割线--%>

<script>
    layui.use(['table', 'util'], function(){
        var table = layui.table
          ,util = layui.util;
        //第一个实例
        table.render({
            elem: '#admin'
            ,height: 400
            ,url: 'getAdminList' //数据接口
            ,method:'post'
            ,dataType:'json'
            ,toolbar: '#toolbarDemo' //开启头部工具栏，并为其绑定左侧模板
            ,page: 'true'
            ,request:{
                pageName:'currectpage'  //起始页改名字 默认1
            }
            ,done: function () {
                $("#admin").css("width","100%");
            }
            ,limit:3     //每页3个
            ,limits:[3,10,20,30,40]
            //以上两个参数都会请求时传过去
            ,cols: [[ //表头
                {type: 'checkbox', fixed: 'left',width: '10%'}
                ,{field: 'id', title: 'ID', width:'10%', sort: true, fixed: 'left'}
                ,{field: 'adminname', title: '账号', width:'10%', edit: 'text'}
                ,{field: 'adminpassword', title: '密码', width:'10%', edit: 'text'}
                ,{field: 'adminphone', title: '联系方式', width:'10%', edit: 'text'}
                ,{field: 'state', title: '角色', width: '10%',edit: 'text',templet: '#titleTpl'}
               // ,{fixed: 'right',   title: '操作',  width:'20%', align:'center', toolbar: '#barDemo'} //这里的toolbar值是模板元素的选择器
            ]]
            ,parseData: function(res){ //res 即为原始返回的数据
                return {
                    "code": res.code, //解析接口状态
                    "msg": res.msg, //解析提示文本
                    "count": res.count, //解析数据长度
                    "data": res.data.list //解析数据列表
                };
            }

        });


      /*  /!*搜索的具体实现*!/
        var $ = layui.$,
            active = {
                reload: function(){
                    var cpyname = $('#cpyname');
                    var cpyaddress = $('#cpyaddress');

                    //执行重载 搜索之后返回的数据 重载在company数据表格中
                    table.reload('company', {
                        url:'getCompanyByCpyNameAndCpyAddress'
                        ,method:'post'
                        ,request:{
                            pageName:'currectpage'  //起始页改名字 默认1
                        }
                        ,page: {
                            curr: 1 //重新从第 1 页开始
                        }
                        ,where: {
                            cpyName: cpyname.val(),
                            cpyAddress:cpyaddress.val()
                        }
                    });
                }
            };

        $('#btn .layui-btn').on('click', function(){
            var type = $(this).data('type');
            active[type] ? active[type].call(this) : '';
        });
*/

        //行工具的具体操作
        //行工具条事件
        table.on('tool(admin)', function(obj){ //注：tool 是工具条事件名，student 是 table容器的属性 lay-filter="对应的值"
            var data = obj.data; //获得当前行数据
            var layEvent = obj.event; //获得 lay-event 对应的值（也可以是表头的 event 参数对应的值）
            var tr = obj.tr; //获得当前行 tr 的 DOM 对象（如果有的话）
        });



        //头工具栏事件
        table.on('toolbar(admin)', function(obj){
            var checkStatus = table.checkStatus(obj.config.id);

            switch(obj.event){
                case 'add':
                    layer.open({
                        type:2,
                        title:'添加管理员',
                        area: ['60%', '60%'],
                        offset: '50px',
                        content:'addAdmin.jsp',
                    })
                    table.reload('admin',{});
                    break;
            }

        });

        //监听单元格编辑
        table.on('edit(admin)', function(obj){
            var value = obj.value //得到修改后的值
                ,data = obj.data //得到所在行所有键值
                ,field = obj.field; //得到字段
          //  layer.msg('[ID: '+ data.id +'] ' + field + ' 字段更改值为：'+ util.escape(value));
            $.ajax({
                url:'updateAdminInfo'
                ,method:'post'
                ,data:{field:field,value:value,id:data.id}
                ,success:function () {
                    layer.msg('[ID: '+ data.id +'] ' + field + ' 字段更改值为：'+ util.escape(value));
                    table.reload('admin',{});  //操作之后执行刷新操作
                },
                error:function () {
                    layer.msg("失败")
                }
            })








        });



    });

</script>
<%--//对于后端传来的企业状态显示的数字改为字--%>
<script type="text/html" id="titleTpl">
    {{#  if(d.state=='0' ){ }}
    审核未通过
    {{#  } else  if(d.state=='1' )  { }}
    超级管理员
    {{#  } else  if(d.state=='2' )  { }}
    普通管理员
    {{#  } }}
</script>


<script type="text/html" id="barDemo">     <!--行工具栏定义-->
<%--<a class="layui-btn layui-btn-xs" lay-event="detail">查看</a>
<a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>--%>
<%--<a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">封禁</a>
<a class="layui-btn layui-btn-xs" lay-event="check">审核</a>--%>
</script>

<script type="text/html" id="toolbarDemo">    <!--头部工具栏定义-->
<div class="layui-btn-container">
    <button class="layui-btn layui-btn-sm" lay-event="add" >添加</button>

</div>
</script>


</body>
</html>