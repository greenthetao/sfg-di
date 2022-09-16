package guru.springframework.sfgdi.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgdi.services.GreetingServiceImpl;

class SetterInjectorControllerTest
{
	SetterInjectorController controller;
	
	@BeforeEach
	void setUp()
	{
		controller = new SetterInjectorController();
//		controller.greetingService = new GreetingServiceImpl();
		controller.setGreetingService(new GreetingServiceImpl());
	}
//	@Test
//	void test()
//	{
//		fail("Not yet implemented");
//	}
	
	@Test
	void getGreeting()
	{
		System.out.println(controller.getGreeting());
//		controller.getGreeting();
	}

}
