package com.wisely.highlight_springmvc4.web.che4_6;

import com.wisely.highlight_springmvc4.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by scofield on 17/3/14.
 */
@RestController
public class MyRestController {
    @Autowired
    DemoService demoService;

    @RequestMapping(value = "/testRest",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String testRest(){
        return demoService.saySomething();
    }
}
