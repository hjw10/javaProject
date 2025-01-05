package jiawei_hu;
import java.sql.*;
import java.util.*;

public class Insert {
	public static void main(String[] args) {
		Connection conn = null;
		ResultSet rs = null;
		Scanner input;

		try {
			String url="jdbc:mysql://localhost:3306/lab2";
			String user="root";
			String pwd="030307";
			

			Class.forName("com.mysql.cj.jdbc.Driver");
			

			conn=DriverManager.getConnection(url,user,pwd);
			

			
			PreparedStatement pstmt = conn.prepareStatement("insert into gene55 values(?,?,?,?)");
			int gene_id,start,end;
			String biotype;
			input = new Scanner(System.in);
			System.out.print("Please input gene_id,start,end,biotype");
			gene_id = input.nextInt();
			start = input.nextInt();
			end = input.nextInt();
			biotype = input.next();
			pstmt.setInt(1, gene_id);
			pstmt.setInt(2, start);
			pstmt.setInt(3, end);
			pstmt.setString(4, biotype);
			
			pstmt.executeUpdate();
			
			if(rs!=null){
				rs.close();
			}
	
			
			if(conn!=null){
				conn.close();
			}
		}
		
	    catch (Exception ex) {
		System.out.println("Error:"+ ex.toString());
	    }
	}

}
