package com.example.JDBC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class JdbcApplication implements ApplicationRunner {
    @Autowired
    JdbcTemplate jdbctemp;
	public static void main(String[] args) {
		SpringApplication.run(JdbcApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
//		String sql="insert into user(id,user_name,user_phone) values(10,'Raj',1234)";
//		jdbctemp.execute(sql);
		String sql="update user set id=4 where id=10";
		jdbctemp.update(sql);
	}

}
