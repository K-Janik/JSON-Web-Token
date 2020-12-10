package com.karoljanik.SpringSecurityWebToken;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import java.util.Collections;

@SpringBootApplication
public class SpringSecurityWebTokenApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityWebTokenApplication.class, args);
	}

	@Bean
	public FilterRegistrationBean filterRegistrationBean() {
		FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
		filterRegistrationBean.setFilter(new JwtFilter());
		filterRegistrationBean.setUrlPatterns(Collections.singleton("/api/hello/*"));
		return filterRegistrationBean;
	}
}
