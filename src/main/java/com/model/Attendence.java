package com.model;


public class Attendence {
	
	private int id;
	private int rollno;
	
	private String studentid;
	private String name;
	private String status;
	private String subject;
	private int attendencedate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getStudentid() {
		return studentid;
	}
	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getAttendencedate() {
		return attendencedate;
	}
	public void setAttendencedate(int attendencedate) {
		this.attendencedate = attendencedate;
	}
	
	
	
}
