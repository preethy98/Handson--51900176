package collectionexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-bean.xml");
		Employee emp=context.getBean(Employee.class);
		Address myaddress=emp.getAddress();
		emp.display();
		myaddress.display();
	}

}
