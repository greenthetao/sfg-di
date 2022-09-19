package guru.springframework.sfgdi.controller;

import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.services.GreetingService;

@Controller
public class MyController
{
	private final GreetingService greetingService;
	
	public String sayHello()
	{
		return greetingService.sayGreeting();
	}

	public MyController(GreetingService greetingService)
	{
		super();
		this.greetingService = greetingService;
	}
}
