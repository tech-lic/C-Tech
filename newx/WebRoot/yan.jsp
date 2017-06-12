<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'yan.jsp' starting page</title>
    
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

<form action="login.do?act=login" method="post">
用户帐号
  <input type=text name="userId" size="18" value="" >
<br>
 登录密码      
<input type="password" name="password" size="19" value=""/>      
 <input type=submit name="submit1" value="登陆" onclick="return check(this.form)"> 
</form>
<script type="text/javascript">
         function check(form) {

          if(form.userId.value=='') {
                alert("请输入用户帐号!");
                form.userId.focus();
                return false;
           }
       if(form.password.value==''){
                alert("请输入登录密码!");
                form.password.focus();
                return false;
         }
         return true;
         }
</script>     
</body>
</html>
