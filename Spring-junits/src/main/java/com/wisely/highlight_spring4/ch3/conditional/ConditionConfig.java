package com.wisely.highlight_spring4.ch3.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * Created by luyongchang on 17/3/1.
 */
@Configuration
public class ConditionConfig {
	@Bean
	@Conditional(WindowsCondition.class)
	public ListService widowsListService(){
		return new WindowsListService();
	}

	@Bean
	@Conditional(LinuxCondition.class)
	public ListService listService(){
		return new LinuxListService();
	}


}
