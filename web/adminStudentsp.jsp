<%--
  Created by IntelliJ IDEA.
  User: zhang
  Date: 2022/3/16
  Time: 20:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <meta charset="UTF-8">
    <script src="js/jquery.min.js"></script>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="layui/css/layui.css"  media="all">
</head>
<body>
<script src="layui/layui.js"></script>
<script src="js/jquery.min.js"></script>
<script type="text/javascript">
    $(function () {
            var studentid=$("#studentid").val();
            $.ajax({
                url:"AdminServlet?method=getStudentByIdAndOccupation",
                method:"post",
                dataType:"json",
                data:{studentid:studentid},
                success:function (data) {

                    layui.use('table', function(){
                        var table = layui.table;
                        //第一个实例
                        table.render({
                            elem: '#demo'
                            ,height: 312
                            /* ,url: 'AdminServlet?method=getStudentByIdAndOccupation' //数据接口*/
                            ,page: true //开启分页
                            //  ,data:[{"id":1,"stname":"薛华杰","staccount":"student","stpassword":"123456","stphone":"13934427526","stschool":"山西大学","stmajor":"软件工程","stsystem":4,"stdate":1647532800000,"stresume":"获得蓝桥杯省赛一等奖，国赛二等奖","ststate":1}]
                            ,data:data
                            ,cols: [[ //表头
                                {field: 'id', title: 'ID', width:80, sort: true, fixed: 'left'}
                                ,{field: 'ocname', title: '职位名称', width:100}
                                ,{field: 'salary', title: '工资', width:80, sort: true}
                                ,{field: 'requirement', title: '工作要求', width:80, sort: true}
                                ,{field: 'workplace', title: '工作地点', width:80}
                                ,{field: 'worktime', title: '工作时间', width: 177}
                            ]]
                        });

                    });
                },
                error:function (data) {



                }
            })

    })

</script>
<script>


</script>

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
    </tr>
    </thead>
    <tbody    id="student">

    </tbody>
</table>



<input id="studentid" type="hidden"  value="${studentid}">


<table id="demo" lay-filter="studenttable" ></table>

<script>

    $(function () {
        var studentid=$("#studentid").val();
        $.ajax({
            url:"AdminServlet?method=getStudentByIdAdmin",
            method:"post",
            dataType:"json",
            data:{studentid:studentid},
            success:function (data) {
                            alert(data)
                    var tt = JSON.parse(data);  //第一个data代表json,第二个data代表json里的数组或对象

                    var str1 = "";   //声明str1，防止产生undefined

                    for (var i = 0; i < tt.length; i++) {   //遍历
                        str1 = str1+ "<td>" + tt[i].id+ "</td>" +
                        "<td>" + tt[i].stname+ "</td>" +
                        "<td>" + tt[i].staccount+ "</td>" +
                        "<td>" + tt[i].stpassword+"</td>"+
                        "<td>" + tt[i].stphone+"</td>"+
                        "<td>" + tt[i].stschool+"</td>"+
                        "<td>" + tt[i].stmajor+"</td>"+
                        "<td>" + tt[i].stsystem+"</td>"+
                        "<td>" + tt[i].stdate+"</td>"+
                        "<td>" + tt[i].stresume+"</td>"+
                        "<td>" + tt[i].ststate+"</td>";
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





</body>
</html>
