package com.wisely.highlight_spring4.ch1.javaconfig;

import com.wisely.highlight_spring4.ch1.javaconfig.UseFunctionService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.wisely.highlight_spring4.ch1.javaconfig.JavaConfig;
/**
 * Created by luyongchang on 17/2/28.
 */

public class Main {
	public static void main(String[] args){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
		System.out.print(useFunctionService.SayHello("java config"));
		context.close();
	}
}
