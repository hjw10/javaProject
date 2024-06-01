<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>插入新基因</title>
</head>
<body>
		<%
		try{
        Connection conn = null;
        ResultSet rs = null;

	    String url="jdbc:mysql://localhost:3306/lab2";
	    String user="root";
	    String pwd="030307";
	

	    Class.forName("com.mysql.cj.jdbc.Driver");
	

	    conn=DriverManager.getConnection(url,user,pwd);
	
	    PreparedStatement pstmt = conn.prepareStatement("insert into gene55 values(?,?,?,?)");
	    int gene_id,start,end;
	    String biotype;
	    gene_id = Integer.valueOf(request.getParameter("gene_id"));
	    start = Integer.valueOf(request.getParameter("start"));
	    end = Integer.valueOf(request.getParameter("end"));
	    biotype = request.getParameter("biotype");
	    pstmt.setInt(1, gene_id);
	    pstmt.setInt(2, start);
	    pstmt.setInt(3, end);
	    pstmt.setString(4, biotype);
	
	    pstmt.executeUpdate();

	
	    if(conn!=null){
		    conn.close();
	    }
         %>
        <p>Congratulations. It works!</p>
        
        <%}
		catch (Exception ex){
		%>
		<%="Error:" + ex.toString()%>
		<%} %>
		
		
</body>
</html>