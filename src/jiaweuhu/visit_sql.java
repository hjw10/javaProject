package jiawei_hu;
import java.sql.*;
import java.util.Scanner;

public class visit_sql {
	public static void main(String[] args) throws Exception {  
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		Scanner sc;
		
		try {
			String url="jdbc:mysql://localhost:3306/teaching";
			String user="root";
			String pwd="030307";
			

			Class.forName("com.mysql.cj.jdbc.Driver");
			

			conn=DriverManager.getConnection(url,user,pwd);
			

			stmt = conn.createStatement();
			

			sc = new Scanner(System.in);
			System.out.print("Please input a student ID: ");
			int stuid = sc.nextInt();			
			

			String sql = "select student.ID, name, dept_name, course_id, grade "
					+ "from student join takes using (ID) "
					+ "where student.ID =" 
					+ stuid;
			rs = stmt.executeQuery(sql);


			if (!rs.isBeforeFirst()){
				System.out.println("There are no records for this ID!!");
			}			
			else {
				System.out.println("student.ID\t" + "name\t" + "dept_name\t" + "course_id\t" + "grade");
				String studentid, name, deptname, courseid, grade;				
				while (rs.next()){
					studentid = rs.getString("student.ID");
					name  =rs.getString("name");
					deptname = rs.getString("dept_name");
					courseid = rs.getString("course_id");
					grade = rs.getString("grade");
					System.out.println(studentid + "\t" + name + "\t" + deptname + "\t" + courseid + "\t" + grade);
				}
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

