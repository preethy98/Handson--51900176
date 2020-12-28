package coursediscount;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
@Bean
public Course course1()
{
	return new Course("java","hari",1000d);
}
@Bean
public Course course2()
{
	return new Course("selenium","hari",2000d);
}
@Bean
public Course course3()
{
	return new Course("python","sankar",500d);
}
	
@Bean
public CourseList courses()
{
return new CourseList();
}
	
}
