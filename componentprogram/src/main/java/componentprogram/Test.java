package componentprogram;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
ApplicationContext context =new AnnotationConfigApplicationContext(MyConfiguration.class);
Owner owner= context.getBean("owner", Owner.class);
System.out.println("Enter the name,password,mobile number of user");
owner.setName(sc.nextLine());
owner.setPassword(sc.nextLine());
owner.setMobileNumber(sc.nextLine());
System.out.println("Name :"+owner.getName()+"\n"+"MobileNumber :"+owner.getPassword());
	}

}
