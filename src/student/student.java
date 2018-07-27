package student;

import java.sql.Date;

public class student {
	int rno;
	String name;
	Date date;
	public int getRno() {
		return rno;
	} 
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public student(int rno, String name, Date date) {
		
		super();
		
		this.rno = rno;
		this.name = name;
		this.date = date;
		System.out.println("in constructor");
	}
	@Override
	public String toString() {
		return "student [rno=" + rno + ", name=" + name + ", date=" + date + "]";
	}
	

}
