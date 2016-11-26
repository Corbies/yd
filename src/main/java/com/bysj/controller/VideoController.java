package com.bysj.controller;

import com.bysj.YdApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by cxj on 2016/11/24.
 */
@Controller
public class VideoController {
    private  static  final Logger logger= LoggerFactory.getLogger(VideoController.class);

    @RequestMapping("/video")
    public String index(Model model){
        logger.info("kao");
        return "video";

    }
}
