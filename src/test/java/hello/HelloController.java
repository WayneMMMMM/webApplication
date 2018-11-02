package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	private static final String template = "Hello!";
	
	@RequestMapping("/hello")
	public String hello() {
		return template;
	}
}
