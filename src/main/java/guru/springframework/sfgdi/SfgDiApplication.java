package guru.springframework.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframework.sfgdi.controller.ConstructorInjectorController;
import guru.springframework.sfgdi.controller.MyController;
import guru.springframework.sfgdi.controller.PropertyInjectorController;
import guru.springframework.sfgdi.controller.SetterInjectorController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		MyController myController = (MyController) ctx.getBean("myController");
		System.out.println("----- Primary Bean -----");
		System.out.println(myController.sayHello());
		
		System.out.println("----- Property -----");
		PropertyInjectorController propertyInjectorController = (PropertyInjectorController) ctx.getBean(PropertyInjectorController.class);
		System.out.println(propertyInjectorController.getGreeting());
		
		SetterInjectorController setterInjectorController = (SetterInjectorController) ctx.getBean(SetterInjectorController.class);
		System.out.println(setterInjectorController.getGreeting());
		
		ConstructorInjectorController constructorInjectorController = (ConstructorInjectorController) ctx.getBean(ConstructorInjectorController.class);
        System.out.println(constructorInjectorController.getGreeting());
	}

}
