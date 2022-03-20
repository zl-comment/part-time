<%--
  Created by IntelliJ IDEA.
  User: xuehuajie
  Date: 2022/3/16
  Time: 11:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>无标题文档</title>
    <link href="css/style.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript" src="js/jquery.js"></script>

    <script type="text/javascript">
        $(document).ready(function(){
            $(".click").click(function(){
                $(".tip").fadeIn(200);
            });

            $(".tiptop a").click(function(){
                $(".tip").fadeOut(200);
            });

            $(".sure").click(function(){
                $(".tip").fadeOut(100);
            });

            $(".cancel").click(function(){
                $(".tip").fadeOut(100);
            });

        });
    </script>


</head>


<body>



<div class="rightinfo">

    <div class="tools">

        <ul class="toolbar">
            <li class="click"><span><img src="images/t01.png" /></span>添加</li>
            <li class="click"><span><img src="images/t02.png" /></span>修改</li>
            <li><span><img src="images/t03.png" /></span>删除</li>
            <li><span><img src="images/t04.png" /></span>统计</li>
        </ul>


        <ul class="toolbar1">
            <li><span><img src="images/t05.png" /></span>设置</li>
        </ul>

    </div>

    <table class="tablelist">
        <thead>
        <tr>
            <th><input name="" type="checkbox" value="" checked="checked"/></th>
            <th>编号</th>
            <th>职位名称</th>
            <th>工资</th>
            <th>工作地点</th>
            <th>工作时间</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <%--
            varStatus     统计循环次数
        --%>
        <c:forEach items="${occupations}" var="occupation"  varStatus="num">
            <tr>
                <td><input name="" type="checkbox"/></td>
                <td>${num.index+1}</td>
                <td>${occupation.ocname}</td>
                <td>${occupation.salary}</td>
                <td>${occupation.workplace}</td>
                <td>${occupation.worktime}</td>
                <td><a href="#" class="tablelink">查看</a>
                <a href="StudentServlet?method=deleteOccupationsByIdStudent&stuandocid=${occupation.stuandocid}&studentid=${studentid}" class="tablelink"> 删除</a></td>
            </tr>
        </c:forEach>



        </tbody>
    </table>


    <div class="pagin">
        <div class="message">共<i class="blue">${page.dataCount}</i>条记录，共<i class="blue">${page.pageCount}</i>页，当前显示第&nbsp;<i class="blue">${page.currentPage}&nbsp;</i>页</div>
        <ul class="paginList">
            <c:if test="${page.currentPage>1}">
<%--                &name=${name}&state=${state}&booktypeid=${booktypeid}--%>
                <li class="paginItem"><a href="StudentServlet?method=getOccupations&currentPage=${page.currentPage-1}"><span class="pagepre"></span> </a> </li>
            </c:if>
            <c:forEach var="num" begin="1" end="${page.pageCount}">
                <c:set var="flag" value="false"></c:set>
                <c:if test="${num == page.currentPage}">
                    <c:set var="flag" value="true"></c:set>
                    <li class="paginItem current"><a>${num}</a></li>
                </c:if>
                <c:if test="${flag == false}">
                    <li class="paginItem"><a href="StudentServlet?method=getOccupations&currentPage=${num}">${num}</a></li>
                </c:if>
            </c:forEach>
            <c:if test="${page.currentPage<page.pageCount}">
<%--                &name=${name}&state=${state}&booktypeid=${booktypeid}--%>
                <li class="paginItem"><a href="StudentServlet?method=getOccupations&currentPage=${page.currentPage+1}"><span class="pagenxt"></span> </a> </li>
            </c:if>
        </ul>
    </div>


    <div class="tip">
        <div class="tiptop"><span>提示信息</span><a></a></div>

        <div class="tipinfo">
            <span><img src="images/ticon.png" /></span>
            <div class="tipright">
                <p>是否确认对信息的修改 ？</p>
                <cite>如果是请点击确定按钮 ，否则请点取消。</cite>
            </div>
        </div>

        <div class="tipbtn">
            <input name="" type="button"  class="sure" value="确定" />&nbsp;
            <input name="" type="button"  class="cancel" value="取消" />
        </div>

    </div>

</div>

<script type="text/javascript">
    $('.tablelist tbody tr:odd').addClass('odd');
</script>

</body>

</html>