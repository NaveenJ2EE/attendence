package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.model.Attendence;
import com.model.Student;

public class AttendenceDao {
	
	JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int save( Attendence  attd)
	{
		String sql="insert into stdattd(rollno,studentid,name,status,subject,attendencedate) values ('"+attd.getRollno()+"','"+attd.getStudentid()+"','"+attd.getName()+"','"+attd.getStatus()+"','"+attd.getSubject()+"','"+attd.getAttendencedate()+"')";
		return jdbcTemplate.update(sql) ;
		
	}
	
	
	
	public List<Attendence> list()
	{
		String sel="SELECT * FROM stdattd";
		List<Attendence> listAttendence= jdbcTemplate.query(sel, new RowMapper<Attendence>(){
			public Attendence mapRow(ResultSet rs,int rowNum) throws SQLException{
				Attendence attendence=new Attendence();
				attendence.setId(rs.getInt("id"));
				attendence.setRollno(rs.getInt("rollno"));;
				attendence.setStudentid(rs.getString("studentid"));
				attendence.setName(rs.getString("name"));
				attendence.setStatus(rs.getString("status"));
			    attendence.setSubject(rs.getString("subject"));
				attendence.setAttendencedate(rs.getInt("attendencedate"));
				
				return attendence;
			}
		});

				return listAttendence;
	}
		
		
		
		
		
		
	}


