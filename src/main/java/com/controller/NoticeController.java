package com.controller;


import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dao.NoticeDao;
import com.model.Notice;
import com.model.Student;

@Controller
public class NoticeController {
	
	@Autowired
	NoticeDao ndao;

	@RequestMapping("/upnotice")
	public ModelAndView show()
	{
		return new ModelAndView("uploadnotice","command",new Notice());
	}
	
	
	@RequestMapping(value="/savenotice",method=RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("notices") Notice notices)
	{
		ndao.save(notices);
		return new ModelAndView("success");
	}
	
	
	@RequestMapping("/viewnotice")
	public ModelAndView listEmployee(ModelAndView model) throws IOException
	{
		List<Notice> listNotice=ndao.list();
		model.addObject("listNotice", listNotice);
		model.setViewName("viewsnotice");
		return model;
	}
	
	
	

}
