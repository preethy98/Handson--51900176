package springmavenexample;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
ApplicationContext context=new ClassPathXmlApplicationContext("spring-bean.xml");
	College colleges=(College) context.getBean("college");
	List<String> dept=colleges.getCourses();
	System.out.println(dept);
	}

}
