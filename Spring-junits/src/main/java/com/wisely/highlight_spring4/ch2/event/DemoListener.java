package com.wisely.highlight_spring4.ch2.event;

import javafx.application.Application;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by luyongchang on 17/3/1.
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {
	@Override
	public void onApplicationEvent(DemoEvent event) {
		String msg = event.getMsg();
		System.out.println("我(benan-demoListener)接收到了bean-demoPublisher发布的消息:"+msg);
	}
}
