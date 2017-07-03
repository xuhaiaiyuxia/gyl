package cn.project.gyl.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

import com.alibaba.druid.pool.DruidDataSource;

@SpringBootConfiguration
public class DBConfig {
	
//	db.datasource.url=jdbc:mysql://localhost:3306/gyl?characterEncoding=UTF-8
//		db.datasource.username=root
//		db.datasource.password=root
//		db.datasource.driverClassName=com.mysql.jdbc.Driver
	
	@Value("${db.datasource.url}")
	private String url;
	@Value("${db.datasource.username}")
	private String username;
	@Value("${db.datasource.password}")
	private String password;
	@Value("${db.datasource.driverClassName}")
	private String driverClassName;

	@Bean
	public DataSource dataSource(){
		DruidDataSource druidDataSource = new DruidDataSource();
		druidDataSource.setUrl(url);
		druidDataSource.setUsername(username);
		druidDataSource.setPassword(password);
		druidDataSource.setDriverClassName(driverClassName);
		return druidDataSource;
	}
}
