package com.wisely.highlight_spring4.ch1.aop;

import java.lang.annotation.*;


/**
 * Created by luyongchang on 17/2/28.
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
	String name();
}
