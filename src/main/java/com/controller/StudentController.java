package com.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dao.StudentDao;
import com.model.Student;
@Controller
public class StudentController 
{
	@Autowired
	StudentDao sdao;

	@RequestMapping("/stdreg")
	public ModelAndView show()
	{
		return new ModelAndView("addstudent","command",new Student());
	}
	
	@RequestMapping(value="/savestd",method=RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("std") Student std)
	{
		sdao.save(std);
		return new ModelAndView("success");
	}
	
	
	@RequestMapping("/viewstd")
	public ModelAndView listEmployee(ModelAndView model) throws IOException
	{
		List<Student> listStudent=sdao.list();
		model.addObject("listStudent", listStudent);
		model.setViewName("viewstudent");
		return model;
	}
	
	
	@RequestMapping(value="/deletestd/{id}",method = RequestMethod.GET)  
    public ModelAndView delete(@PathVariable int id){  
        sdao.delete(id);  
        return new ModelAndView("redirect:/viewstd");  
    }  
	
	
	
	@RequestMapping(value="/editstd/{id}")
	public ModelAndView edit(@PathVariable int id)
	{
		Student std=sdao.getStudentById(id);
		return new ModelAndView("editstudentform","command",std);
	}
	
	@RequestMapping(value="/editsavestd",method=RequestMethod.POST)
	public ModelAndView editsave(@ModelAttribute("std") Student std)
	{
		sdao.update(std);
		return new ModelAndView("redirect:/viewstd");
	}
	
	

}
