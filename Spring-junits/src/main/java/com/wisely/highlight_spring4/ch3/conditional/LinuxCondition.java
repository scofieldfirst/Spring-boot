package com.wisely.highlight_spring4.ch3.conditional;


import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Created by luyongchang on 17/3/1.
 */
public class LinuxCondition implements Condition {

	public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {

		return conditionContext.getEnvironment().getProperty("os.name").contains("Mac");// linux
	}
}
