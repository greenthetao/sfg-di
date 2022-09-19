package guru.springframework.sfgdi.controller;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import guru.springframework.sfgdi.services.GreetingService;

@Controller
public class ConstructorInjectorController
{
//	@Autowired -- -- not needed since Spring 4.2 -- --
	private final GreetingService greetingService;

	public ConstructorInjectorController(GreetingService greetingService)
	{
		super();
		this.greetingService = greetingService;
	}
	
	public String getGreeting()
	{
		return "ConstructorInjector: " + greetingService.sayGreeting();
	}
}
