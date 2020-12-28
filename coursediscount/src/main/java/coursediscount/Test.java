package coursediscount;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*ApplicationContext context=new ClassPathXmlApplicationContext("spring-bean.xml");
CourseList list=context.getBean(CourseList.class);
list.discount();   //for xml based configuration*/
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		CourseList list=context.getBean("courses",CourseList.class);
		Course c1=context.getBean("course1",Course.class);
		Course c2=context.getBean("course2",Course.class);
		Course c3=context.getBean("course3",Course.class);
		list.insert(c1);
		list.insert(c2);
		list.insert(c3);//java based configuration
		list.discount();

				
	}

}
