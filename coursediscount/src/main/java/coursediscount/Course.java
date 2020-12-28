package coursediscount;

import org.springframework.stereotype.Component;
//@Component for xml based configuration
public class Course implements Comparable<Course> {
String name,mentor;
Double fee;
public Course() {

}
public Course(String name, String mentor, Double fee) {
	super();
	this.name = name;
	this.mentor = mentor;
	this.fee = fee;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMentor() {
	return mentor;
}
public void setMentor(String mentor) {
	this.mentor = mentor;
}
public Double getFee() {
	return fee;
}
public void setFee(Double fee) {
	this.fee = fee;
}
public void display()
{
	System.out.println(name);
}
public int compareTo(Course course) {
	// TODO Auto-generated method stub
	return this.fee.compareTo(course.getFee());
}
}
