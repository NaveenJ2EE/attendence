package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.model.Student;

public class StudentDao {
	
	JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int save( Student std)
	{
		String sql="insert into student(studentid,name,email,city,state,cname,splan) values ('"+std.getStudentid()+"','"+std.getName()+"','"+std.getEmail()+"','"+std.getCity()+"','"+std.getState()+"','"+std.getCname()+"','"+std.getSplan()+"')";
		return jdbcTemplate.update(sql) ;
		
	}
	
	
	
	public List<Student> list()
	{
		String sel="SELECT * FROM student";
		List<Student> listStudent= jdbcTemplate.query(sel, new RowMapper<Student>(){
			public Student mapRow(ResultSet rs,int rowNum) throws SQLException{
				Student student=new Student();
				student.setId(rs.getInt("id"));
				student.setStudentid(rs.getInt("studentid"));
				student.setName(rs.getString("name"));
				student.setEmail(rs.getString("email"));
				student.setCity(rs.getString("city"));
				student.setState(rs.getString("state"));
				student.setCname(rs.getString("cname"));
				student.setSplan(rs.getString("splan"));
				return student;
			}
		});

				return listStudent;
	}
	
	
	
	
	public int delete(int id)
	{  
	    String sq="delete from student where id="+id+"";  
	    return jdbcTemplate.update(sq);  
	}  
	
	public int update(Student emp)
	{
		String up="update student set studentid='"+emp.getStudentid()+"', name='"+emp.getName()+"',email='"+emp.getEmail()+"',city='"+emp.getCity()+"',state='"+emp.getState()+"',splan='"+emp.getSplan()+"',cname='"+emp.getCname()+"'where id="+emp.getId()+"";
		return jdbcTemplate.update(up);
	}
	
	public Student getStudentById(int id)
	{
		String q="select * from student where id=?";
		return jdbcTemplate.queryForObject(q, new Object[]{id}, new BeanPropertyRowMapper<Student>(Student.class));
	}
	
	public Student getOneStd(String name)
	{
		String q="select * from student where name=?";
		return jdbcTemplate.queryForObject(q, new Object[]{name}, new BeanPropertyRowMapper<Student>(Student.class));
	}
	
	public Student getOneStdByEmail(String email)
	{
		String q="select * from student where email=?";
		return jdbcTemplate.queryForObject(q, new Object[]{email}, new BeanPropertyRowMapper<Student>(Student.class));
	}

}
