package com.ygdxd.druid.config;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration  
public class DruidConfiguration {
	@Bean
	public DruidDataSource getDataSource(
			@Value("${spring.datasource.driver-class-name}") String driver,  
            @Value("${spring.datasource.url}") String url,  
            @Value("${spring.datasource.username}") String username,  
            @Value("${spring.datasource.password}") String password,  
            @Value("${spring.datasource.minIdle}") int minIdle,  
            @Value("${spring.datasource.maxActive}") int maxActive,  
            @Value("${spring.datasource.initialSize}") int initialSize,  
            @Value("${spring.datasource.timeBetweenEvictionRunsMillis}") long timeBetweenEvictionRunsMillis,  
            @Value("${spring.datasource.minEvictableIdleTimeMillis}") long minEvictableIdleTimeMillis,
            @Value("${spring.datasource.validationQuery}") String validationQuery,  
            @Value("${spring.datasource.testWhileIdle}") boolean testWhileIdle,  
            @Value("${spring.datasource.testOnBorrow}") boolean testOnBorrow,  
            @Value("${spring.datasource.testOnReturn}") boolean testOnReturn){
		DruidDataSource druidDataSource=new DruidDataSource();
		 druidDataSource.setDriverClassName(driver);  
	        druidDataSource.setUrl(url);  
	        druidDataSource.setUsername(username);  
	        druidDataSource.setPassword(password);  
	        druidDataSource.setMinIdle(minIdle);  
	        druidDataSource.setMaxActive(maxActive);  
	        druidDataSource.setInitialSize(initialSize);  
	        druidDataSource  
	                .setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);  
	        druidDataSource  
	                .setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);  
	        druidDataSource.setValidationQuery(validationQuery);  
	        druidDataSource.setTestWhileIdle(testWhileIdle);  
	        druidDataSource.setTestOnBorrow(testOnBorrow);  
	        druidDataSource.setTestOnReturn(testOnReturn);  
		
		return druidDataSource;
	}

}
