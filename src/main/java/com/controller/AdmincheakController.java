package com.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dao.AdminCheakDao;
import com.model.AdminCheak;

@Controller
public class AdmincheakController {

	@Autowired
	AdminCheakDao acdao;

	@RequestMapping("/adminpage")
	public ModelAndView show()
	{
		return new ModelAndView("adminlogin","command",new AdminCheak());
	}
	
	
	
	@RequestMapping("/validamincheak")
	public ModelAndView cheakadmin(HttpServletRequest req ,AdminCheak adminchk,HttpSession session)
	{
		 
		
			String uid=req.getParameter("id");
			String upass=req.getParameter("password");
			
			
			
			
			if (uid.equals("naveen")&&upass.equals("1111")) 
			{
				return new ModelAndView("admin");
			}
			session.setAttribute("uid", uid);
			return new ModelAndView("adminerror");
	}
	
	
	
	
	@RequestMapping("/logoutadmin")
	public ModelAndView logouAdmin()
	{
			
		return new ModelAndView("index");
	}
}
