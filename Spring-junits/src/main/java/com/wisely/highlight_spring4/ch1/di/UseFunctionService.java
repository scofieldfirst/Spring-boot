package com.wisely.highlight_spring4.ch1.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by luyongchang on 17/2/28.
 */
@Service
public class UseFunctionService {
	@Autowired
	FunctionService functionService;

	public String SayHello(String word){
		return functionService.sayHello(word);
	}
}
