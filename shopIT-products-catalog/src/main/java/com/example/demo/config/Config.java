package com.example.demo.config;


import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

@Configuration
public class Config {
	
	@Bean
	public DataSource dataSource() {
		DataSource dataSource = (new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.H2))
				.addScript("classpath:testdb/schema.sql")
				.addScript("classpath:testdb/data.sql")
				.build();
		return dataSource;
	}
	
	

}
