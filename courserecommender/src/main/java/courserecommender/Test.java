package courserecommender;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-bean.xml");
		CourseList list=context.getBean(CourseList.class);
		ArrayList<String> entries=list.noofCourse(4000d);
		for(String string:entries)
		{
			System.out.println(string);
		}
	}

}
