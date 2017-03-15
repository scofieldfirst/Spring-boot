package com.wisely.spring_boot_starter_hello;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by luyongchang on 17/3/15.
 */
@ConfigurationProperties(prefix = "hello")
public class HelloServceProperties {
	private static final String MSG = "world";

	private String msg = MSG;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
