package com.wisely.highlight_spring4.ch2.event;

import javafx.application.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by luyongchang on 17/3/1.
 */
@Component
public class DemoPublisher {
	@Autowired
	ApplicationContext applicationContext;

	public void publish(String msg){
		applicationContext.publishEvent(new DemoEvent(this,msg));
	}
}
