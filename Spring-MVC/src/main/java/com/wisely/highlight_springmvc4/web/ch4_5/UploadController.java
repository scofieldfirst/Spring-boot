package com.wisely.highlight_springmvc4.web.ch4_5;

import ch.qos.logback.core.rolling.helper.FileStoreUtil;
import ch.qos.logback.core.util.FileUtil;
import org.springframework.stereotype.Controller;
import org.apache.commons.io.FileUtils;
import org.springframework.util.FileSystemUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileInputStream;

/**
 * Created by scofield on 17/3/13.
 */
@Controller
public class UploadController {
    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    public @ResponseBody String upload(MultipartFile file ,HttpServletRequest request){
        try {
            FileUtils.writeByteArrayToFile(new File("/Users/scofield/Desktop/spring-write/" + file.getOriginalFilename()),file.getBytes());
            System.out.println("file name:" + file.getName() + "file originalName: " + file.getOriginalFilename());
            return "ok";
        }catch (Exception e){
            e.printStackTrace();
            return "wrong";
        }
    }
}
