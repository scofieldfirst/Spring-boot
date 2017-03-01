package com.wisely.highlight_spring4.ch2.profile;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by luyongchang on 17/2/28.
 */
// 未起效---再观察一下
public class Main {
	public static void main(String[] args){

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.getEnvironment().setActiveProfiles("prod");
		context.register(ProfileConfig.class);
		context.refresh();

		DemoBean demoBean = context.getBean(DemoBean.class);
		System.out.println(demoBean.getContent());

		context.close();
	}
}
