package com.wisely.highlight_springmvc4.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.async.DeferredResult;

/**
 * Created by luyongchang on 17/3/14.
 */
@Service
public class PushService {
	private DeferredResult<String> deferredResult;
	public DeferredResult<String> getAsyncUpdate(){
		deferredResult = new DeferredResult<String>();
		return deferredResult;
	}

	@Scheduled(fixedDelay = 5000)
	public void refresh(){
		if (deferredResult != null){
			deferredResult.setResult(new Long(System.currentTimeMillis()).toString());
		}
	}
}
