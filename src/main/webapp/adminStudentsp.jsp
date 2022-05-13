<%--
  Created by IntelliJ IDEA.
  User: zhang
  Date: 2022/3/16
  Time: 20:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <meta charset="UTF-8">
    <script src="./static/js/jquery.min.js"></script>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="./static/layui/css/layui.css"  media="all">
</head>
<body>
<script src="./static/layui/layui.js"></script>
<script src="./static/js/jquery.min.js"></script>
<script type="text/javascript">
    $(function () {
            var studentid=$("#studentid").val();
            $.ajax({
                url:"getStudentByIdAndOccupation",
                method:"post",
                dataType:"json",
                data:{studentId:studentid},
                success:function (data) {
                    layui.use('table', function(){
                        var table = layui.table;
                        //第一个实例
                        table.render({
                            elem: '#demo'
                            ,height: 300
                            ,toolbar: '#toolbarDemo'
                          //  ,width:973
                            /* ,url: 'AdminServlet?method=getStudentByIdAndOccupation' //数据接口*/
                            ,page: true //开启分页
                            //  ,data:[{"id":1,"stname":"薛华杰","staccount":"student","stpassword":"123456","stphone":"13934427526","stschool":"山西大学","stmajor":"软件工程","stsystem":4,"stdate":1647532800000,"stresume":"获得蓝桥杯省赛一等奖，国赛二等奖","ststate":1}]
                            ,data:data
                            ,cols: [[ //表头
                                {field: 'id', title: 'ID', width:80, sort: true, fixed: 'left'}
                                ,{field: 'ocname', title: '职位名称', width:177}
                                ,{field: 'salary', title: '工资', width:177, sort: true}
                                ,{field: 'requirement', title: '工作要求', width:177, sort: true}
                                ,{field: 'workplace', title: '工作地点', width:177}
                                ,{field: 'worktime', title: '工作时间', width: 177}
                            ]]
                        });

                        table.on('toolbar(studenttable)', function(obj){
                            var checkStatus = table.checkStatus(obj.config.id);
                            switch(obj.event){
                                case 'add':
                                    layer.msg('添加');
                                    break;
                                case 'delete':
                                    layer.msg('删除');
                                    break;
                                case 'update':
                                    layer.msg('编辑');
                                    break;
                            }
                        });



                    });
                },
                error:function (data) {



                }
            })

    })

</script>

<fieldset class="layui-elem-field layui-field-title" style="margin-top: 50px;">
    <legend>学生详细信息</legend>
</fieldset>
<table class="layui-table">
    <colgroup>
        <col width="150">
        <col width="200">
        <col>
    </colgroup>
    <thead>
    <tr>
        <th>姓名</th>
        <th>账号</th>
        <th>密码</th>
        <th>手机</th>
        <th>学校</th>
        <th>专业</th>
        <th>学制</th>
        <th>入学日期</th>
        <th>简历</th>
        <th>录取状态</th>
        <th>简历</th>
    </tr>
    </thead>
    <tbody   id="student">

    </tbody>
</table>



<input id="studentid" type="hidden"  value="${studentid}">


<fieldset class="layui-elem-field layui-field-title" style="margin-top: 50px;">
    <legend>学生所报职位</legend>
</fieldset>
<table id="demo" lay-filter="studenttable" ></table>


<script>
    $(function () {
        var studentid=$("#studentid").val();
        $.ajax({
            url:"getStudentByIdAdmin",
            method:"post",
            dataType:"json",
            data:{studentId:studentid},
            success:function (data) {
               // var tt = eval(data);    //不用let时就用这个eval转换
                let tt=data;
                //var tt = JSON.parse(data);  //错误
                var str1 = "";   //声明str1，防止产生undefined
                  //遍历
                    str1 += "<td>" + tt.stname+ "</td>" +
                        "<td>" + tt.staccount+ "</td>" +
                        "<td>" + tt.stpassword+"</td>"+
                        "<td>" + tt.stphone+"</td>"+
                        "<td>" + tt.stschool+"</td>"+
                        "<td>" + tt.stmajor+"</td>"+
                        "<td>" + tt.stsystem+"</td>"+
                        "<td>" + tt.stdate+"</td>"+
                        "<td>" + tt.stresume+"</td>";
                    if(tt.ststate=="1"){
                        str1+="<td>录取</td>";
                    }else{
                        str1+="<td>未录取</td>";
                    }
                    if(tt.stresumeid!=""){
                        var a=tt.stresumeid;
                        str1+="<td><a href='AdminGetResumeByResumeId?resumeId="+a+"'>查看</td>"
                    }else{
                        str1+="<td>无</td>";
                    }

                $("#student").append(str1);
            },
            error : function (arg1) {
                alert("加载数据失败");
                console.log(arg1);
            }

        })

    })

</script>
//工具栏
<script type="text/html" id="toolbarDemo">
    <div class="layui-btn-container">
        <button class="layui-btn layui-btn-sm" lay-event="add">添加</button>
        <button class="layui-btn layui-btn-sm" lay-event="delete">删除</button>
        <button class="layui-btn layui-btn-sm" lay-event="update">编辑</button>
    </div>
</script>

</body>
</html>
