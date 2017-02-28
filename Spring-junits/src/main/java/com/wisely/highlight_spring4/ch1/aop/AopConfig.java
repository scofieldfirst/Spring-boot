package com.wisely.highlight_spring4.ch1.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by luyongchang on 17/2/28.
 */
@Configuration
@ComponentScan("com.wisely.highlight_spring4.ch1.aop")
@EnableAspectJAutoProxy
public class AopConfig {

}
