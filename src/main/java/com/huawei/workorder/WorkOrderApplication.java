package com.huawei.workorder;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.huawei")
@EnableAutoConfiguration
@SpringBootApplication
public class WorkOrderApplication extends SpringBootServletInitializer {

	
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(WorkOrderApplication.class);
		app.setBannerMode(Mode.OFF);
		app.run(args);
	}
	
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(WorkOrderApplication.class);
	}
}
