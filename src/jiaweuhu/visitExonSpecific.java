package jiawei_hu;

import java.sql.*;
import java.util.Scanner;

public class visitExonSpecific {
	public static void main(String[] args) throws Exception {  //抛出异常
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		Scanner sc;
		
		try {
			String url="jdbc:mysql://localhost:3306/lab2";
			String user="root";
			String pwd="030307";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection(url,user,pwd);
			stmt = conn.createStatement();
			String sql = "select transcript_id,exon_id,start,end,ranks "
					+ "from exon55 join exon_transcript55 using (exon_id) "
					+ "where transcript_id =11145020";
			rs = stmt.executeQuery(sql);

			System.out.println("transcript_id为11145020的转录本所对应的外显子为：");
			System.out.println("transcript_id\t" + "start\t" + "end\t" + "ranks");
			String id,start,end,ranks;				
			while (rs.next()){
				id = rs.getString("transcript_id");
				start  =rs.getString("start");
				end = rs.getString("end");
				ranks = rs.getString("ranks");
				System.out.println(id + "\t" + start + "\t" + end + "\t" + ranks);
			}
			
			if(rs!=null){
				rs.close();
			}
			if(stmt!=null){
				stmt.close();
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
