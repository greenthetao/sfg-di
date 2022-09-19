package guru.springframework.sfgdi.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import guru.springframework.sfgdi.services.GreetingService;

@Controller
public class ConstructorInjectorController
{
	private final GreetingService greetingService;

	public ConstructorInjectorController(@Qualifier("constructorGreetingServiceImpl") GreetingService greetingService)
	{
		super();
		this.greetingService = greetingService;
	}
	
	public String getGreeting()
	{
		return "ConstructorInjector: " + greetingService.sayGreeting();
	}
}
