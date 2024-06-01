<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>登录MYSQL</title>
</head>
<body>
<%
    String id = request.getParameter("id");
    String password =request.getParameter("password");
    if(id.equals("xiaowang") && password.equals("030307")){%>
    
    <h1 align="center">登录成功</h1>
    <h2 align="center"><%= "欢迎 " + id.toString() +" 使用" %></h2>
    <h2 align="center">您可以查询lab2数据库中的表，<a href="submitID.html">点击链接查询转录本外显子信息</a></h2>
    <%	
    }else if(id.equals("xiaomore") && password.equals("030307")){%>
    
     <h1 align="center">登录成功</h1>
    <h2 align="center"><%= "欢迎 " + id.toString() +" 使用" %></h2>
    <h2 align="center">您可以向lab2中插入数据，<a href="insertGene.html">点击链接向gene55表中插入数据</a></h2>
    	
    <%	
    }else{%>
     <h1 align="center">登录失败</h1>
     <h2 align="center"><a href="login.html">点击链接返回登录页面</a></h2>
    	
    <%}%>

</body>
</html>