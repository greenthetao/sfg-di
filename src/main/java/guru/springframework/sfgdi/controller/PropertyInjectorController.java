package guru.springframework.sfgdi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.services.GreetingService;

@Controller
public class PropertyInjectorController
{
	@Qualifier("propertyInjectedGreetingService")
	@Autowired
	public GreetingService greetingService;

	public void setGreetingService(GreetingService greetingService)
	{
		this.greetingService = greetingService;
	}
	
	public String getGreeting()
	{
		return "PropertyInjector: " + greetingService.sayGreeting();
	}
}
