

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
<table class="layui-hide" id="demo"></table>
<script src="./static/layui/layui.js" charset="utf-8"></script>
<script src="./static/js/jquery.min.js"></script>


<fieldset class="layui-elem-field layui-field-title" style="margin-top: 50px;">
    <legend>学生用户表格</legend>
</fieldset>



<table id="student" lay-filter="student"></table>


<script>
    layui.use('table', function(){
        var table = layui.table;
        //第一个实例
        table.render({
            elem: '#student'
            ,height: 400
            ,url: 'getStudentByPage' //数据接口
            ,method:'post'
            ,dataType:'json'
            ,toolbar: '#toolbarDemo' //开启头部工具栏，并为其绑定左侧模板
            ,page: 'true'
            ,request:{
                pageName:'currectpage'  //起始页改名字 默认1
            }
            ,done: function () {
                $("#student").css("width","100%");
            }
            ,limit:3     //每页3个
            ,limits:[3,10,20,30,40]
            //以上两个参数都会请求时传过去
            ,cols: [[ //表头
                {type: 'checkbox', fixed: 'left' ,width: '10%'}
                ,{field: 'id', title: 'ID', width:'10%', sort: true, fixed: 'left'}
                ,{field: 'stname', title: '姓名', width:'10%'}
                ,{field: 'staccount', title: '账号', width:'10%'}
                ,{field: 'stphone', title: '联系方式', width:'10%'}
                ,{field: 'stschool', title: '学校', width: '10%'}
                ,{field: 'stmajor', title: '主修', width: '10%' }
                ,{field: 'stsystem', title: '学制', width: '10%', sort: true}
                ,{fixed: 'right',   title: '操作',  width:'20%', align:'center', toolbar: '#barDemo'} //这里的toolbar值是模板元素的选择器
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

        //行工具的具体操作
        //行工具条事件
        table.on('tool(student)', function(obj){ //注：tool 是工具条事件名，student 是 table容器的属性 lay-filter="对应的值"
            var data = obj.data; //获得当前行数据
            var layEvent = obj.event; //获得 lay-event 对应的值（也可以是表头的 event 参数对应的值）
        //    var tr = obj.tr; //获得当前行 tr 的 DOM 对象（如果有的话）

            if(layEvent === 'detail'){ //查看
                layer.msg("查看");
                //do somehing
                var url='';

                url+="toGoAdminStudentSp?studentId="+data.id;
                //window.location.href=url;
                layer.open({       //小窗口
                    type:2,
                    title:'详细信息',
                    area: ['60%', '60%'],
                    offset: '50px',
                    content:url,
                })


            } else if(layEvent === 'del'){ //删除
                layer.confirm('真的删除行么', function(index){
                    obj.del(); //删除对应行（tr）的DOM结构，并更新缓存
                    layer.close(index);
                    //向服务端发送删除指令


                });
            } else if(layEvent === 'edit'){ //编辑
                //do something
                //同步更新缓存对应的值
                obj.update({
                    username: '123'
                    ,title: 'xxx'
                });
            } else if(layEvent === 'LAYTABLE_TIPS'){
                layer.alert('Hi，头部工具栏扩展的右侧图标。');
            }
        });



        //头工具栏事件
        table.on('toolbar(student)', function(obj){
            var checkStatus = table.checkStatus(obj.config.id);
            switch(obj.event){
                case 'getCheckData':
                    var data = checkStatus.data;
                    layer.alert(JSON.stringify(data));
                    //layer.alert(data);
                    break;
                case 'getCheckLength':
                    var data = checkStatus.data;
                    layer.msg('选中了：'+ data.length + ' 个');
                    break;
                case 'isAll':
                    layer.msg(checkStatus.isAll ? '全选': '未全选');
                    break;

                //自定义头工具栏右侧图标 - 提示
                case 'LAYTABLE_TIPS':
                    layer.alert('这是工具栏右侧自定义的一个图标按钮');
                    break;
            }
        });


    });







</script>


<script type="text/html" id="barDemo">     <!--行工具栏定义-->
<a class="layui-btn layui-btn-xs" lay-event="detail">查看</a>
<a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
<a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
<a class="layui-btn layui-btn-xs" lay-event="check">审核</a>
</script>

<script type="text/html" id="toolbarDemo">    <!--头部工具栏定义-->
<div class="layui-btn-container">
    <button class="layui-btn layui-btn-sm" lay-event="getCheckData">获取选中行数据</button>
    <button class="layui-btn layui-btn-sm" lay-event="getCheckLength">获取选中数目</button>
    <button class="layui-btn layui-btn-sm" lay-event="isAll">验证是否全选</button>
</div>
</script>


</body>
</html>