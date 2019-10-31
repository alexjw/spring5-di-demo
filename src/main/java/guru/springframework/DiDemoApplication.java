package guru.springframework;

import guru.springframework.controllers.ConstructorInjectedController;
import guru.springframework.controllers.MyController;
import guru.springframework.controllers.PropertyInjectedController;
import guru.springframework.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext run = SpringApplication.run(DiDemoApplication.class, args);

		MyController controller = (MyController) run.getBean("myController");

		controller.hello();

		System.out.println(run.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(run.getBean(SetterInjectedController.class).sayHello());
		System.out.println(run.getBean(ConstructorInjectedController.class).sayHello());
	}
}
