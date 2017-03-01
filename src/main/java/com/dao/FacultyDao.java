package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.model.Faculty;
import com.model.Student;

public class FacultyDao {
	
	JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int save( Faculty std)
	{
		String sql="insert into faculty(facultyid,name,email,city,state,sname) values ('"+std.getFacultyid()+"','"+std.getName()+"','"+std.getEmail()+"','"+std.getCity()+"','"+std.getState()+"','"+std.getSname()+"')";
		return jdbcTemplate.update(sql) ;
		
	}
	
	
	
	public List<Faculty> list()
	{
		String sel="SELECT * FROM faculty";
		List<Faculty> listFaculty= jdbcTemplate.query(sel, new RowMapper<Faculty>(){
			public Faculty mapRow(ResultSet rs,int rowNum) throws SQLException{
				Faculty faculty=new Faculty();
				faculty.setId(rs.getInt("id"));
				faculty.setFacultyid(rs.getInt("facultyid"));
				faculty.setName(rs.getString("name"));
				faculty.setEmail(rs.getString("email"));
				faculty.setCity(rs.getString("city"));
				faculty.setState(rs.getString("state"));
				faculty.setSname(rs.getString("sname"));
				return faculty;
			}
		});

				return listFaculty;
	}
	
	
	
	
	public int delete(int id)
	{  
	    String sq="delete from faculty where id="+id+"";  
	    return jdbcTemplate.update(sq);  
	}  
	
	public int update(Faculty fct)
	{
		String up="update student set studentid='"+fct.getFacultyid()+"', name='"+fct.getName()+"',email='"+fct.getEmail()+"',city='"+fct.getCity()+"',state='"+fct.getState()+"',sname='"+fct.getSname()+"'where id="+fct.getId()+"";
		return jdbcTemplate.update(up);
	}
	
	public Faculty getFacultyById(int id)
	{
		String q="select * from fuclty where id=?";
		return jdbcTemplate.queryForObject(q, new Object[]{id}, new BeanPropertyRowMapper<Faculty>(Faculty.class));
	}

}
