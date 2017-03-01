package com.wisely.highlight_spring4.ch3.fortest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

/**
 * Created by luyongchang on 17/3/1.
 */
public class TestConfig {
	@Bean
	@Profile("dev")
	public TestBean devTestBean(){
		return new TestBean("Fome development profile");
	}

	@Bean
	@Profile("prod")
	public TestBean prodTestBean(){
		return new TestBean("Fome production profile");
	}

}
