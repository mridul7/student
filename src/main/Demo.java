package main;
import java.sql.Date;
import java.util.Calendar;

import dao.studentDaoimpl; 
import student.student;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Calendar cal = Calendar.getInstance();
//		cal.set(Calendar.MONTH, 12);
//		cal.set(Calendar.YEAR, 2016);
//		cal.set(Calendar.DAY_OF_MONTH, 03);
//		Date calDate = new Date(cal.getTimeInMillis());
		System.out.println(new Date(System.currentTimeMillis()));
     student s = new student(4,"mno",new Date(System.currentTimeMillis()));
     
     studentDaoimpl obj = new studentDaoimpl();
     obj.addStudent(s);
     
	}

}
