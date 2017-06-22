package com.reddy.ModelDao;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.reddy.Model.ModelBook;
import com.reddy.util.ConnectionUtil;

public class ModelBookDao {

	public  void bookDetails(ModelBook modelbook){
		
		JdbcTemplate jdbctemplate = ConnectionUtil.getJdbcTemplate();
		String sql= "select author from Book where isbn = ?";
		String author =   jdbctemplate.queryForObject(sql, String.class,  modelbook.getIsbn() );
		System.out.println(author);  
	}
}
