package demo.rest.math.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author Irfin
 */
@RestController
public class HelloController 
{
	@GetMapping("/hello")
	public String sayHello()
	{
		return "Selamat sore";
	}
}
