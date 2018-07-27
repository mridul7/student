package dao;
import connection.DbConnection;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import student.student;


public class studentDaoimpl implements daoInterface{

	Map<Integer,student> mapStudent = new HashMap<>();
	public studentDaoimpl()
	{
		try 
		{
			Connection connection = DbConnection.getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("select * from student");
			while(rs.next())
			{
				int rno = rs.getInt(1);
				String name = rs.getString(2);
				Date date = rs.getDate(3);
				student s = new student(rno,name,date);
				mapStudent.put(rno, s);
			}
			rs.close();
			stmt.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	@Override
	public void addStudent(student s) {
		// TODO Auto-generated method stub
		try
		{
			//java.util.Date d=new java.util.Date();
			System.out.println(s.getName());
			System.out.println(s.getDate());
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		    String b = sdf.format(s.getDate() );
			java.util.Date a = sdf.parse(b);
			System.out.println(a);
//		    String 	b = sdf.format(a );
//		    System.out.println(b);
//		DateFormat formatter = new SimpleDateFormat("E MMM dd HH:mm:ss Z yyyy");
//		Date date = (Date)formatter.parse(b);
//		System.out.println(date);        

			
			//java.util.Date yourDate = sdf.parse(s.getDate());
			Connection connection = DbConnection.getConnection();
			Statement stmt = connection.createStatement();
//			int a = stmt.executeUpdate("insert into student values("+s.getRno()+",'"+s.getName()+"',"+yourDate+")");
//			if(a!=1)
//			{
//			System.out.println("not inserted");
//			}
//			else
//			{ 
//				mapStudent.put(s.getRno(), s);
//				System.out.println("inserted");
//			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
     }

	@Override
	public void deleteStudent(int rno) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Map<Integer, student> getAllStudent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public student getStudentByRno(int rno) {
		// TODO Auto-generated method stub
		return null;
	}

}
