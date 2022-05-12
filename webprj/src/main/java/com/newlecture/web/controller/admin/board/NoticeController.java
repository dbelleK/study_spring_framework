package com.newlecture.web.controller.admin.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//VIEW->reg1.html

@Controller("adminNoticeController")
@RequestMapping("/admin/board/notice/")
public class NoticeController { 
	//<bean name="noticeController" �̸��� �����Ƿ� adminNoticeController�� �����ؼ� �ٲ��ش�.
	//<bean name="adminNoticeController" class="com.newlecture.web.controller.admin.board.NoticeController"
	
	@RequestMapping("list")
	public String list() {
		
		return "";
	}
	
	//http://localhost:8081/webprj/admin/board/notice/reg1.html
	@RequestMapping("reg")
	@ResponseBody
	public String reg(String title, String content, String category ) {
		
		return String.format("title:%s<br>content:%s<br>category:%s", title, content, category);
	}
	
	@RequestMapping("edit")
	public String edit() {
		
		return "";
	}
	
	@RequestMapping("del")
	public String del() {
		
		return "";
	}

}
