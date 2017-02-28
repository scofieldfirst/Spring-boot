package com.wisely.highlight_spring4.ch2.prepost;


import com.wisely.highlight_spring4.ch2.prepost.PrePostConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by luyongchang on 17/2/28.
 */

public class Main {
	public static void main(String[] args){

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrePostConfig.class);
		BeanWayService beanWayService = context.getBean(BeanWayService.class);
		JSP250WayService jsp250WayService = context.getBean(JSP250WayService.class);

		context.close();
	}
}
