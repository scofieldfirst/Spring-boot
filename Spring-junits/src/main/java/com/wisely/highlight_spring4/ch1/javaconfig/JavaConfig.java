package com.wisely.highlight_spring4.ch1.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by luyongchang on 17/2/28.
 */
@Configuration
public class JavaConfig {
	@Bean
	public FunctionService functionService(){
		return new FunctionService();
	}

	@Bean
	public UseFunctionService useFunctionService(){
		UseFunctionService useFunctionService = new UseFunctionService();
		useFunctionService.setFunctionService(functionService());
		return useFunctionService;
	}
}
