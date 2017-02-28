package com.wisely.highlight_spring4.ch2.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by luyongchang on 17/2/28.
 */
public class JSP250WayService {
	@PostConstruct
	public void init(){
		System.out.println("jsr250-init-method");
	}
	public JSP250WayService(){
		super();
		System.out.println("初始化构造函数-JSP250WayService");
	}

	@PreDestroy
	public void destroy(){
		System.out.println("JSP250-destroy-method");
	}
}
