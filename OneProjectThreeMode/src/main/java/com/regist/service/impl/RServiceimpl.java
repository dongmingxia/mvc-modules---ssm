package com.regist.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.regist.bean.User;
import com.regist.dao.RDao;
import com.regist.service.RService;

@Service
public class RServiceimpl implements RService{
       
	  @Autowired
	  private RDao rDao;
	 
	
	public List<User> selectUser() {

		
		return rDao.selectUser();
	}

}
