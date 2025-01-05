package jiawei_hu;

import java.sql.*;
import java.util.*;

public class ProcType {
	public static void main(String[] args) {
		Connection conn = null;
		Scanner input;

		try {
			String url="jdbc:mysql://localhost:3306/lab2";
			String user="root";
			String pwd="030307";
			

			Class.forName("com.mysql.cj.jdbc.Driver");
			

			conn=DriverManager.getConnection(url,user,pwd);
			
			input = new Scanner(System.in);
			System.out.print("Please input a transcript_id");
			int id = input.nextInt(); 
			
			CallableStatement cstmt = conn.prepareCall("call procType(?,?)");
			cstmt.setInt(1,id);
			cstmt.registerOutParameter(2,java.sql.Types.VARCHAR);
			cstmt.executeQuery();
            
			String out = cstmt.getString(2);
			System.out.println("Type of transcript: "+out);
			
			
			if(conn!=null){
				conn.close();
			}
		}
		
	    catch (Exception ex) {
		System.out.println("Error:"+ ex.toString());
	    }
	}


}
