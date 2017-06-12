<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>ajax</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
	<script type="text/javascript">
$(function(){
$("#button").click(function(){
var name=$("#name").val();
$.ajax({
   type:"post",
   url:"user_cha.action",
   data:{
   "name":name
   },
   success:function(data){
   alert(data);
   var cha=data;
   document.getElementById("ha").textContent=cha;
   }

})

})
})

</script>
	<form action="user_cha.action" method="post">
		输入查询内容: <input type="text" name="name" id="name"><br> 
		<label id="ha"></label><br>
		<button id="button">join</button>
	</form>
</body>
</html>
