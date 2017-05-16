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
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>

<script type="text/javascript">
	$(function(){
		$("#button").click(function() {
			var name = $("#name").val();
			$.ajax({
				type : "post",
				url : "login_ajax.action",
				//url : "js/ss.json",

				// contentType: "application/json; charset=utf-8",
				async : true,
				data : {
					"name" : name
				},
				//dataType: "json",

				success : function(data) {

					//alert(data);
					//var sa=JSON.parse(data)	
					var a = data;

					//alert(a);
					document.getElementById("xinxi").innerHTML = a;
				},
				/*  error:function(){
				 alert("验证失败");
				 } */
				error : function(XMLHttpRequest, textStatus, errorThrown) {
					alert(XMLHttpRequest.status + "1");
					alert(XMLHttpRequest.readyState + "2");
					alert(textStatus + "3");
				}
			});
		});

	})
</script>
</head>

<body>
	<label>输入用户名：</label>
	<input type="text" id="name" name="name">
	<br>
	<label id="xinxi"></label>
	<br>
	<input type="button" id="button" value="join">

</body>
</html>
