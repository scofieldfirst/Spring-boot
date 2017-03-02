package com.wisely.highlight_springmvc4.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by luyongchang on 17/3/2.
 */
@Controller
public class HelloController {
	@RequestMapping("/index")
	public String hello(){
		return "index";
	}
}
