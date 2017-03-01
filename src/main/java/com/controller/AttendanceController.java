package com.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dao.AttendenceDao;
import com.model.Attendence;
import com.model.Student;

@Controller
public class AttendanceController {
	
	@Autowired
	AttendenceDao adao;
	
	@RequestMapping("/attdreg")
	public ModelAndView show()
	{
		return new ModelAndView("studentattendence","command",new Attendence());
	}
	
	@RequestMapping(value="/saveatd",method=RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("atd") Attendence atd)
	{
		adao.save(atd);
		return new ModelAndView("success");
	}
	
	
	
	@RequestMapping("/viewatd")
	public ModelAndView listEmployee(ModelAndView model) throws IOException
	{
		List<Attendence> listAttendence=adao.list();
		model.addObject("listAttendence", listAttendence);
		model.setViewName("viewallattendence");
		return model;
	}

}
