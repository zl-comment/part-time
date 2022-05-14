<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<head>

    <script>
        function isHidden(oDiv){
            var vDiv = document.getElementById(oDiv);
            vDiv.style.display = (vDiv.style.display == 'none')?'block':'none';
        }
    </script>

</head>
<body>

<input id ="ocid" style="display:none" value="${ocid}"/>
<h2>报名成功!</h2>
<%--

<script type="text/javascript">
    $(function () {
      var ocid=  $("#div1").val();
        $.ajax({
            url: "getOccupationByOcid",
            method: "post",
            data: {ocid: ocid},
        })
    })

</script>

--%>

</body>

<script src="./static/layui/layui.js"></script>
<script src="./static/js/jquery.min.js"></script>
<script type="text/javascript">
    $(function () {

        var ocid=$("#ocid").val();
        $.ajax({
            url:"getOccupationByOcid",
            method:"post",
            dataType:"json",
            data:{ocid:ocid},
            success:function (data) {

            },
            error:function (data){

            }
        })
    })


</script>

</html>








