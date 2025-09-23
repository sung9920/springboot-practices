package webmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MvcController {
	
	@ResponseBody
	@GetMapping("/hello")
	public String hello() {
		return "hello, world";
	}
	
	@GetMapping("/hello2")
	public String hello2() {
		return "hello";
	}
	
}
