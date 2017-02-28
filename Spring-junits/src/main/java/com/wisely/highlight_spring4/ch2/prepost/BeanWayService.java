package com.wisely.highlight_spring4.ch2.prepost;

import com.sun.org.apache.xml.internal.security.Init;

/**
 * Created by luyongchang on 17/2/28.
 */
public class BeanWayService {
	public void initq(){
		System.out.println("@Bean-init-method");
	}

	public BeanWayService(){
		super();
		System.out.println("初始化构造函数-BeanWayService");
	}

	public void destroy(){
		System.out.println("@Bean-destroy-method");
	}
}
