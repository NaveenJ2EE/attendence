package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dao.StudentDao;
import com.model.Student;

@Controller
public class SearchController 
{
	
	@Autowired
	StudentDao sdao;

	@RequestMapping("/searchstd")
	public ModelAndView show()
	{
		return new ModelAndView("studentsearch","command",new Student());
	}
	
	
	@RequestMapping("/search1")
	public ModelAndView SearchStudent(@ModelAttribute("std1") Student std1,HttpServletRequest req)
	{
		
			String sname=req.getParameter("name");
			 std1=sdao.getOneStd(sname);
			 std1.getStudentid();
			 std1.getName();
			 std1.getId();
			 std1.getState();
			 std1.getSplan();
			 std1.getEmail();
			 std1.getCity();
			
		
		
		return new ModelAndView("viewstudentsearch", "model",std1 );
	}
	
	
	
	@RequestMapping("/searchbyemail")
	public ModelAndView SearchStudentbyEmail(@ModelAttribute("std1") Student std1,HttpServletRequest req)
	{
		
			String sname=req.getParameter("email");
			 std1=sdao.getOneStdByEmail(sname);
			 std1.getStudentid();
			 std1.getName();
			 std1.getId();
			 std1.getState();
			 std1.getSplan();
			 std1.getEmail();
			 std1.getCity();
			
		
		
		return new ModelAndView("viewstudentsearch", "model",std1 );
	}

}
