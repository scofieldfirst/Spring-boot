package com.wisely.highlight_spring4.ch1.aop;

import org.springframework.stereotype.Service;

/**
 * Created by luyongchang on 17/2/28.
 */
@Service
public class DemoAnnotationService {
	@Action(name = "注解式的add操作")
	public void add(){}
}
