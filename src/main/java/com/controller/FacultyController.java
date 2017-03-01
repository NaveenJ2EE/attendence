package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dao.FacultyDao;
import com.model.Faculty;

@Controller
public class FacultyController {
	
	@Autowired
	FacultyDao fdao;

	@RequestMapping("/freg")
	public ModelAndView show()
	{
		return new ModelAndView("addfaculty","command",new Faculty());
	}
	
	@RequestMapping(value="/savefct",method=RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("fct") Faculty fct)
	{
		fdao.save(fct);
		return new ModelAndView("Home");
	}


}
