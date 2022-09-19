package guru.springframework.sfgdi.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgdi.services.ConstructorGreetingServiceImpl;

class PropertyInjectorControllerTest
{

	PropertyInjectorController controller;
	
	@BeforeEach
	void setUp()
	{
		controller = new PropertyInjectorController();
		controller.greetingService = new ConstructorGreetingServiceImpl();
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
	}

}
