package com.newlecture.web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController{
	
	//url에 반응할 수 있도록 @RequestMapping
	@RequestMapping("/index") 
	public String index() {
		
	   //System.out.println("asdfe");
		
	   //tiles 생각
		return "root.index"; 
	}


	//viewResolver없이 입력하고 출력
//	@RequestMapping("/index") 
//	public void index(HttpServletResponse response) {
//		PrintWriter out;
//		try {
//			out = response.getWriter();
//			out.println("Hello Index");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//	}
//	}
	
//	@RequestMapping("/index") 
//	@ResponseBody //이걸 통해 직접 텍스트만 출력
//	public String index() {
		
//		return "Hello Index 1";
//	}

	/*
	 * public class indexController implements Controller {
	 * 
	 * @Override 
	 * public ModelAndView handleReques
	 * t(HttpServletRequest request,HttpServletResponse response) throws Exception { 
	 * 
	 * ModelAndView mv = new ModelAndView("root.index");
	 * mv.addObject("data","Hello Spring MVC~");
	 * //mv.setViewName("/WEB-INF/view/index.jsp");
	 * 
	 * return mv;
	 *  }
	 */
	
	

}
