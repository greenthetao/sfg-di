package guru.springframework.sfgdi.controller;

import guru.springframework.sfgdi.services.GreetingService;

public class ConstructorInjectorController
{
	private final GreetingService greetingService;

	public ConstructorInjectorController(GreetingService greetingService)
	{
		super();
		this.greetingService = greetingService;
	}
	
	public String getGreeting()
	{
		return greetingService.sayGreeting();
	}
}
