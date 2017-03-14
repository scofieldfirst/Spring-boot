package com.wisely.ch6_2_3;

import com.wisely.ch6_2_3.config.AuthorSetting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class Ch623Application {

	@Autowired
	private AuthorSetting authorSetting;

	@RequestMapping("/hello")
	public String index(){
		return "author name is " + authorSetting.getName()+" and author age is "+authorSetting.getAge();
	}

	public static void main(String[] args) {
		SpringApplication.run(Ch623Application.class, args);
	}
}
