package guru.springframework.sfgdi.controller;

import guru.springframework.sfgdi.services.GreetingService;

public class PropertyInjectorController
{
	public GreetingService greetingService;

	public String getGreeting()
	{
		return greetingService.sayGreeting();
	}
	public GreetingService getGreetingService()
	{
		return greetingService;
	}

}
