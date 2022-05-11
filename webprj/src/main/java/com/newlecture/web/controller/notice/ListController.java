package com.newlecture.web.controller.notice;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.newlecture.web.entity.Notice;
import com.newlecture.web.service.NoticeService;

public class ListController implements Controller {

	//servlet-context.xml에 property생략가능
	@Autowired 
	private NoticeService noticeService;

	public void setNoticeService(NoticeService noticeService) {
		this.noticeService = noticeService;
		System.out.println("Hello");
	}


	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		/* ModelAndView mv = new ModelAndView("notice/list"); */
		/* tiles.xml위해 */
		ModelAndView mv = new ModelAndView("notice.list");
		
		//mv.addObject("data","Hello Spring MVC~");
		//mv.setViewName("/WEB-INF/view/notice/list.jsp");
		
		List<Notice> list = noticeService.getList(1, "TITLE", ""); /*int page, String field, String query (""->모든것)*/ 
		mv.addObject("list",list);
	
		return mv;
	}

}
