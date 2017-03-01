package com.wisely.highlight_spring4.ch3.taskscheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import sun.java2d.pipe.SpanShapeRenderer;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * Created by luyongchang on 17/3/1.
 */
@Service
public class ScheduledTaskService {
	private static final SimpleDateFormat dataformat = new SimpleDateFormat("HH:mm:ss");

	@Scheduled(fixedRate = 5000)
	public void reportCurrentTime(){
		System.out.println("每隔五秒执行一次 "+dataformat.format(new Date()));
	}

	@Scheduled(cron = "0 11 15 ? * *")
	public void fixTimeExcution(){
		System.out.println("在指定时间 " + dataformat.format(new Date()) + "执行");
	}
}
