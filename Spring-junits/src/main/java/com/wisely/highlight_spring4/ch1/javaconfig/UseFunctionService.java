package com.wisely.highlight_spring4.ch1.javaconfig;

import com.wisely.highlight_spring4.ch1.javaconfig.FunctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by luyongchang on 17/2/28.
 */
public class UseFunctionService {
	FunctionService functionService;

	public void setFunctionService(FunctionService functionService) {
		this.functionService = functionService;
	}

	public String SayHello(String word){
		return functionService.sayHello(word);
	}
}
