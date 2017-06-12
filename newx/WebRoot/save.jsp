<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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

<title>新增人员</title>

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
	<form action="login_saveuser.action" method="post"  onsubmit="return check(this)">
		用户名: <input type="text" name="name" id="name"><br> 
		<label id="name1"></label><br> 
		年 龄: <input type="text" name="age" id="age"><br> 
		<label id="age1"></label> <br> 
		<input type="submit" value="提交">
	</form>

</body>
<script type="text/javascript">
	function check(form) {
		if ((form.name.value == "") || (form.name.value.equals(""))) {
			document.getElementById("name1").innerHTML = "输入";
			form.name.focus();
			return false;
		}
		if ((form.age.value.length < 1) || (form.age.value.length > 2)) {
			//alert("111111");
			document.getElementById("age1").innerHTML = "年龄1-3";
			form.age.focus();
			return false;
		}
		return true;
	}
</script>
</html>
