package com.wisely.ch7_6.domain;

/**
 * Created by luyongchang on 17/3/21.
 */
public class WiselyResponse {
	private String responseMessage;
	public WiselyResponse(String responseMessage){
		this.responseMessage = responseMessage;
	}

	public String getResponseMessage() {
		return responseMessage;
	}
}
