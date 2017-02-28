package com.wisely.highlight_spring4.ch1.di;

import org.springframework.stereotype.Service;

/**
 * Created by luyongchang on 17/2/28.
 */
@Service
public class FunctionService {
	public String sayHello(String word){
		return "Hello " + word+ " !";
	}
}
