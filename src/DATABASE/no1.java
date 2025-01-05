package DATABASE;

import java.sql.*;
import java.util.*;

public class no1 {
	public static void main(String[] args) 
	throws ClassNotFoundException,SQLException{
		String url = "jdbc:mysql://localhost:3306/lab2";
		String username = "root";
		String password = "030307";
		Scanner input;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection(url,username,password);
		
		Statement stat = conn.createStatement();
		
		input = new Scanner(System.in);
		System.out.print("Please input a transcript_id");
		int id = input.nextInt(); 
		String sql = "select transcript_id,start,end,ranks from "+
		"exon55 natural join exon_transcript55 " +
		"where transcript_id="+
		 id;
		ResultSet resultSet = stat.executeQuery(sql);
		
		if (!resultSet.isBeforeFirst()){
			System.out.println("There are no records for this ID!!");
		}
		else {
			System.out.println("transcript_id\t" + "start\t" + "end\t" + "ranks");
			String transcript_id,start,end,ranks;
			while(resultSet.next()) {
				transcript_id = resultSet.getString("transcript_id");
				start = resultSet.getString("start");
				end = resultSet.getString("end");
				ranks = resultSet.getString("ranks");
				System.out.println(transcript_id +"\t"+start+"\t"+end+"\t"+ranks);
			}
			
			
		}
		if(resultSet!=null) {
			resultSet.close();
		}
		if(stat !=null) {
			stat.close();
		}
		if(conn != null) {
			conn.close();
		}

	}
	

}
