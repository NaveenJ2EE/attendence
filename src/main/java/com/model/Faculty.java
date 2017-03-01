package com.model;

public class Faculty {
	
	private int id;
	private long facultyid;
	private String name;
	private String email;
	private String city;
	private String state;
	private String sname;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getFacultyid() {
		return facultyid;
	}
	public void setFacultyid(long facultyid) {
		this.facultyid = facultyid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSplan() {
		return splan;
	}
	public void setSplan(String splan) {
		this.splan = splan;
	}
	private String splan;
	

}
