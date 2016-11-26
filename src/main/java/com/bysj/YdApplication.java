package com.bysj;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

import javax.servlet.http.HttpServletRequest;

@SpringBootApplication
@Controller
@EnableScheduling
public class YdApplication {
		private  static  final Logger logger= LoggerFactory.getLogger(YdApplication.class);


//	@RequestMapping("/websoket")
//	public String websoket(Model model){
//		model.addAttribute("hello","HelloWold");
//		return "websoket";
//	}
	public static void main(String[] args) {
		SpringApplication.run(YdApplication.class, args);
	}

//	@Bean
//	public ServerEndpointExporter serverEndpointExporter (){
//		return new ServerEndpointExporter();
//	}
}
