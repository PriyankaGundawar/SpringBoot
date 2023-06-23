package com.priya;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class WebController2 {
	
		@RequestMapping("home1")
		//public ModelAndView webShow(@RequestParam("name") String myname) {
		public ModelAndView mywebShow(Alien alien) {

	
		ModelAndView mv1 = new ModelAndView(); 
		//mv.addObject("name", myname);
		mv1.addObject("obj", alien);
		mv1.setViewName("home");
		return mv1;
		
	}

}
