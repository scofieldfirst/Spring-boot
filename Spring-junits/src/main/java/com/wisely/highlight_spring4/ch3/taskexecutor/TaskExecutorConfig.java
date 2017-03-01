package com.wisely.highlight_spring4.ch3.taskexecutor;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;
import sun.nio.ch.ThreadPool;
import org.springframework.scheduling.annotation.*;

import java.util.concurrent.Executor;
import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;

/**
 * Created by luyongchang on 17/3/1.
 */
@Configuration
@ComponentScan
@EnableAsync
public class TaskExecutorConfig implements AsyncConfigurer {

	public Executor getAsyncExecutor() {

		ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
		taskExecutor.setCorePoolSize(5);
		taskExecutor.setMaxPoolSize(10);
		taskExecutor.setQueueCapacity(25);
		taskExecutor.initialize();
		return taskExecutor;
	}


	public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler(){
		return null;
	};

}
