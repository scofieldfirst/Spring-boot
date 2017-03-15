package com.wisely.spring_boot_starter_hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by luyongchang on 17/3/15.
 */
@Configuration
@EnableConfigurationProperties(HelloServceProperties.class)
@ConditionalOnClass(HelloService.class)
@ConditionalOnProperty(prefix = "hello",value = "enabled",matchIfMissing = true)
public class HelloServiceAutoConfiguration {

	@Autowired
	private HelloServceProperties helloServceProperties;

	@Bean
	@ConditionalOnMissingBean(HelloService.class)
	public HelloService helloService(){
		HelloService helloService = new HelloService();
		helloService.setMsg(helloServceProperties.getMsg());
		return helloService;
	}
}
