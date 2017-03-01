package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.model.Notice;
import com.model.Student;

public class NoticeDao {
	
	JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int save( Notice notice)
	{
		String sql="insert into noticet(title,notice) values ('"+notice.getTitle()+"','"+notice.getNotice()+"')";
		return jdbcTemplate.update(sql) ;
		
	}
	
	
	
	public List<Notice> list()
	{
		String sel="SELECT * FROM noticet";
		List<Notice> listNotice= jdbcTemplate.query(sel, new RowMapper<Notice>(){
			public Notice mapRow(ResultSet rs,int rowNum) throws SQLException{
				Notice notice=new Notice();
				notice.setId(rs.getInt("id"));
				notice.setTitle(rs.getString("title"));
				notice.setNotice(rs.getString("notice"));
				
				return notice;
			}
		});

				return listNotice;
	}
	
	

}
