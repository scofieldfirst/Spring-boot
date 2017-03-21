package com.wisely.ch7_6.web;

import com.wisely.ch7_6.domain.WiselyMessage;
import com.wisely.ch7_6.domain.WiselyResponse;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 * Created by luyongchang on 17/3/21.
 */
@Controller
public class WsController {
	@MessageMapping("/welcome")
	@SendTo("/topic/getResponse")
	public WiselyResponse say(WiselyMessage message) throws Exception {
		Thread(3000);
		return new WiselyResponse("Welcome, " + message.getName() + "!");
	}
}
