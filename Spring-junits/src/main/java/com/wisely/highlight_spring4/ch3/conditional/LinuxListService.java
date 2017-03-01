package com.wisely.highlight_spring4.ch3.conditional;

/**
 * Created by luyongchang on 17/3/1.
 */
public class LinuxListService implements ListService{
	public String showListCmd() {
		return "ls";
	}
}
