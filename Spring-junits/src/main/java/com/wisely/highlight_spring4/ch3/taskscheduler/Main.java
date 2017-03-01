package com.wisely.highlight_spring4.ch3.taskscheduler;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by luyongchang on 17/2/28.
 */

public class Main {
	public static void main(String[] args){

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskSchedulerConfig.class);
	}
}
