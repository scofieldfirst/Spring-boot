package com.wisely.spring_boot_starter_hello;

/**
 * Created by luyongchang on 17/3/15.
 */
public class HelloService {
	private String msg;

	public String sayHello(){
		return "Hello" + msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
