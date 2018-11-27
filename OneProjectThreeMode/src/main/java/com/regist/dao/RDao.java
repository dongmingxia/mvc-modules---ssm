package com.regist.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import com.regist.bean.User;

@Component
public interface RDao {
    
	
	  /**
	   * 有一个疑惑，dao层使用class怎样操作
	   * 什么时候改为了interface
	   * 
	   * */
	
	  @Select("select * from user")
	  List<User> selectUser();
	
	
	
}


