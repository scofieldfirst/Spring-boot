package com.wisely.highlight_spring4.ch2.event;

import com.wisely.highlight_spring4.ch2.profile.DemoBean;
import javafx.application.Application;
import org.springframework.context.ApplicationEvent;

/**
 * Created by luyongchang on 17/3/1.
 */

public class DemoEvent extends ApplicationEvent {

	private static final long serialVersionUID = 1L;
	private String msg;

	public DemoEvent(Object source,String msg){
		super(source);
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
