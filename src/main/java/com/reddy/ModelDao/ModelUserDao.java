package com.reddy.ModelDao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.reddy.Model.ModelUser;
import com.reddy.util.ConnectionUtil;

public class ModelUserDao {


public void  upDateuser( ModelUser modeluser){
	 JdbcTemplate jdbcTemplate =ConnectionUtil.getJdbcTemplate();
	 
	String sql="update user set passward=? WHERE username=?";
	Object[] params={modeluser.getPassward(),modeluser.getUsername()};
	System.out.println(params[0] +"-" + params[1] +"- " + sql);
	int row=jdbcTemplate.update(sql,params);
		
	System.out.println("no of row"+ row);
}
}
