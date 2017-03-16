package com.wisely.ch7_6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.*;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;


import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class Ch76Application {

	public static void main(String[] args) {
		SpringApplication.run(Ch76Application.class, args);
	}

	@Component
	public static class CustomServletContainer implements EmbeddedServletContainerCustomizer{
		@Override
		public void customize(ConfigurableEmbeddedServletContainer container){
			container.setPort(8888);
			container.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND,"/404.html");
			container.setSessionTimeout(10, TimeUnit.MINUTES);
		}
	}

	@Bean
	public EmbeddedServletContainerFactory servletContainer(){
		TomcatEmbeddedServletContainerFactory factory = new TomcatEmbeddedServletContainerFactory();
		factory.setPort(8888);
		factory.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND,"/404.html"));
		factory.setSessionTimeout(10,TimeUnit.MINUTES);
		return factory;
	}
}
