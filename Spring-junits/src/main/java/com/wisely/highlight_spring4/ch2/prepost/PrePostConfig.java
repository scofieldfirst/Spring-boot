package com.wisely.highlight_spring4.ch2.prepost;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by luyongchang on 17/2/28.
 */
@Configurable
@ComponentScan("com.wisely.highlight_spring4.ch2.prepost")
public class PrePostConfig {

	@Bean(initMethod = "initq",destroyMethod = "destroy")
	BeanWayService beanWayService(){
		return new BeanWayService();
	}

	@Bean
	JSP250WayService jsp250WayService(){
		return new JSP250WayService();
	}
}
