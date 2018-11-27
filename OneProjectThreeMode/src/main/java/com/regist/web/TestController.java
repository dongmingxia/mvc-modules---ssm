package com.regist.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.regist.bean.User;
import com.regist.service.impl.RServiceimpl;


@RestController
@RequestMapping("/web")
public class TestController {
     
	@Autowired
	public RServiceimpl rServiceimpl;
	
	@RequestMapping("/contro")
	public void RController() {
		
		
		List<User> selectUser = rServiceimpl.selectUser();
		
		for (User user : selectUser) {
			System.out.println(user);
		}
		
	}
	
	
}
