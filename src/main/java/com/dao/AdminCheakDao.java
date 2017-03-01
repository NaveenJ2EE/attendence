package com.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.model.AdminCheak;


public class AdminCheakDao {
	
	JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
   
	
	public AdminCheak getAdmin(){
		
		String sel="SELECT * FROM admin";
		AdminCheak ad =(AdminCheak)jdbcTemplate.queryForObject(sel, AdminCheak.class);
		ad.getUserid();
		ad.getPassword();
		return ad;
	}
	
	
	
	


}
