package guru.springframework.sfgdi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.services.GreetingService;

@Controller
public class SetterInjectorController
{
	@Autowired
	private GreetingService greetingService;

	public void setGreetingService(GreetingService greetingService)
	{
		this.greetingService = greetingService;
	}
	
	public String getGreeting()
	{
		return "SetterInjector: " + greetingService.sayGreeting();
	}
}
