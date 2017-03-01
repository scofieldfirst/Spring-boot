package com.wisely.highlight_spring4.ch2.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by scofield on 17/2/28.
 *
 */
@Configuration
public class ProfileConfig {

	@Bean
	//@Profile("dev")
	public DemoBean devDemoBean(){
		return new DemoBean("From development profile");
	}

	@Bean
	//@Profile("prod")
	public DemoBean prodDemoBean(){
		return new DemoBean("From production profile");
	}
}
