package com.wisely.highlight_spring4.ch3.conditional;


import com.wisely.highlight_spring4.ch3.taskexecutor.AsyncTaskService;
import com.wisely.highlight_spring4.ch3.taskexecutor.TaskExecutorConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by luyongchang on 17/2/28.
 */

public class Main {
	public static void main(String[] args){

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);
		ListService listService = context.getBean(ListService.class);
		System.out.println(context.getEnvironment().getProperty("os.name"));
		System.out.println(context.getEnvironment().getProperty("os.name") + "系统下的列表命令为:" + listService.showListCmd());

		context.close();

	}
}
