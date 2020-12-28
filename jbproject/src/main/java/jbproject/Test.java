package jbproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {
	public static void main(String[] args) {
	/*ApplicationContext context=new ClassPathXmlApplicationContext("spring-bean.xml");
	HelloWorld world=context.getBean("helloWorld",HelloWorld.class);// xml basedconfiguration
	world.setMessage("welcome");
	System.out.println(world.getMessage());*/
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		HelloWorld world=context.getBean(HelloWorld.class);
		world.setMessage("hello");
		System.out.println(world.getMessage());
	}
}
