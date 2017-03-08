package com.wisely.highlight_springmvc4.web.ch4_3;

import com.wisely.highlight_springmvc4.domain.DemoObj;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by luyongchang on 17/3/7.
 */
@RestController
@RequestMapping("/rest")
public class DemoRestController {

	@RequestMapping(value = "/getjson",produces = {"application/json;charset=UTF-8"})
	public DemoObj getJson(DemoObj obj){
		return new DemoObj(obj.getId() + 1 ,obj.getName() + "yy");
	}

	@RequestMapping(value = "/getxml",produces = {"application/xml;charset=UTF-8"})
	public DemoObj getXml(DemoObj obj){
		return new DemoObj(obj.getId() + 1,obj.getName() + "yy");
	}
}

