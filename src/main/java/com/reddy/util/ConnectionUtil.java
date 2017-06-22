package com.reddy.util;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class ConnectionUtil {
	
public static JdbcTemplate getJdbcTemplate(){

	JdbcTemplate jdbctemplte=new JdbcTemplate();
	jdbctemplte.setDataSource(getDataSource());
	return jdbctemplte;
	}
public static DataSource getDataSource(){
	BasicDataSource datasource=new BasicDataSource();
	datasource.setDriverClassName("com.mysql.cj.jdbc.Driver");
	datasource.setUrl("jdbc:mysql://localhost:3306/madakasira?useSSL=false");
	datasource.setUsername("root");
	datasource.setPassword("chaitu");
	
	return datasource;
}
}
