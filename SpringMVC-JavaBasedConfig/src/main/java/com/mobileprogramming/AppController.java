package com.mobileprogramming;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("/api")
public class AppController {

	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("t1") int x,
			                @RequestParam("t2") int y)
	{
		ModelAndView mv=new ModelAndView();
		int k=x+y;
		mv.addObject("result",k);
		mv.setViewName("result.jsp");
		return mv;
		
	}
}
