package com.wisely.highlight_spring4.ch1.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.AnnotatedArrayType;

/**
 * Created by luyongchang on 17/2/28.
 */

public class Main {
	public static void main(String[] args){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
		UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
		System.out.print(useFunctionService.SayHello("di"));
		context.close();
	}
}
