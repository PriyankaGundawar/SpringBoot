package com.priya;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class WebController {
	
	@RequestMapping("home")
	//public String webShow(HttpServletRequest req) { //no need
	
	
		//public String webShow(@RequestParam("name") String myname, HttpSession session) { (#1) //added code
		
		public ModelAndView webShow(@RequestParam("name") String myname) {
			
		//(#1)Instead of creating request and response object and send the values we can pass name, HttpSession in method parameter itself
//		HttpSession session = req.getSession();
//		String name = req.getParameter("name");
		
		// (#2) Instead of sending data and view name to session we can create ModelAndView object and pass it to it.
		//System.out.println("Hello web !!" + myname);
		//session.setAttribute("name", myname);
	
		ModelAndView mv = new ModelAndView(); //(#2)
		mv.addObject("name", myname);
		mv.setViewName("home");
		
		
		
		//return "home.jsp";
		//return "home";
		return mv;
		
	}
	
	@RequestMapping("home2")
	//public ModelAndView webShow(@RequestParam("name") String myname) {
	public ModelAndView mywebShow(Alien alien) {


	ModelAndView mv1 = new ModelAndView(); 
	//mv.addObject("name", myname);
	mv1.addObject("obj", alien);
	mv1.setViewName("home");
	return mv1;
	
}

}
