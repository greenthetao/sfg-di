package guru.springframework.sfgdi.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgdi.services.GreetingServiceImpl;

class ConstructorInjectorControllerTest
{
	ConstructorInjectorController controller;

	@BeforeEach
	void setUp()
	{
		controller = new ConstructorInjectorController(new GreetingServiceImpl());
	}
	
//	@Test
//	void testGetGreeting()
//	{
//		fail("Not yet implemented");
//	}

	@Test
	void getGreeting()
	{
		System.out.println(controller.getGreeting());
	}
}
