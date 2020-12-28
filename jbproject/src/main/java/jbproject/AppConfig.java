package jbproject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="jbproject")  //java based config without bean tag
public class AppConfig {
/*	@Bean
public HelloWorld helloworld()
{   java based config using bean tag
	return new HelloWorld();
}*/
	
}
