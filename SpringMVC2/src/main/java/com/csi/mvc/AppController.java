package com.csi.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/api")
public class AppController {
	
	@RequestMapping("/hello")
    public String hello()
    {
	   return "Hello Universe";
    }
}
