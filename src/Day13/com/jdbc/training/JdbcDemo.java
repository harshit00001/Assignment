package Day13.com.jdbc.training;

import Day13.com.jdbc.training.model.Student;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;



public class JdbcDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			String url="jdbc:oracle:thin:@localhost:1521/orcl.iiht.tech";
			String username="system";
			String password="system";
			Connection con =DriverManager.getConnection(url,username,password);
			System.out.println("Connection is Successful");
		
			List<Student> ls=new ArrayList<Student>();
			Statement stmt4=con.createStatement();
			String query5="select * from Student";
			ResultSet rs2=stmt4.executeQuery(query5);
			while(rs2.next())
			{
				ls.add(new Student(rs2.getString(1),rs2.getString(2),rs2.getString(3),rs2.getString(4)));
			}
			System.out.println("\n------Sorted in the name Format-------\n");
			ls.stream().sorted((Student o1,Student o2)->o1.getStudName().compareTo(o2.getStudName())).forEach(x->System.out.println(x.toString()));
	
		
//		Statement stmt=con.createStatement();
//		String query="CREATE TABLE STUDENT("
//				+"STUD_ID VARCHAR(6) PRIMARY KEY,"
//				+"STUD_NAME VARCHAR(20) NOT NULL,"
//				+"ADDRESS VARCHAR(30) NOT NULL,"
//				+"BRANCH VARCHAR(10) NOT NULL)";
//		stmt.execute(query);
//		System.out.println("Table Created..");
//		String query2="INSERT INTO STUDENT VALUES('ST101','JOHN','BRAZIL','CS')";
//		stmt.execute(query2);
//		System.out.println("Values inserted..");
		
//		PreparedStatement stmt2=con.prepareStatement("Insert into Student values(?,?,?,?)");
//		stmt2.setString(1, "ST104");
//		stmt2.setString(2, "Harshit");
//		stmt2.setString(3, "Parasnath");
//		stmt2.setString(4, "CS");
//		int count=stmt2.executeUpdate();
//		System.out.println(count+" rows inserted..");

//		PreparedStatement stmt3=con.prepareStatement("Select * from student where stud_id=?");
//		stmt3.setString(1, "ST104");
//		ResultSet rs=stmt3.executeQuery();
//		Student stud=new Student();
//		while(rs.next())
//		{
//			System.out.println("Student: "+rs.getString(2));
//			stud.setStudName(rs.getString(2));
//		}
//		System.out.println(stud.getStudName());
		
			
//			String query2="{call Add_Student(?,?,?,?)}";
//			CallableStatement cs2=con.prepareCall(query2);
//			cs2.setString(1, "ST105");
//			cs2.setString(2, "Nitesh");
//			cs2.setString(3, "Dhanbad");
//			cs2.setString(4, "ECE");
//			cs2.execute();
//			System.out.println("Inserted through Prepared Statement");
			
//		String query="{? = call STUD_DETAIL(?)}";
//		CallableStatement cs=con.prepareCall(query);
//		cs.registerOutParameter(1, Types.VARCHAR);
//		cs.setString(2, "ST104");
//		cs.execute();
//		System.out.println("Student Name: "+ cs.getString(1));
			

	
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}

}
