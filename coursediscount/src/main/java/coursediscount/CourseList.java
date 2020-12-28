package coursediscount;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import org.springframework.stereotype.Component;
//@Component for xml based configuration
public class CourseList {
ArrayList<Course> courseList=new ArrayList<>();
public CourseList() {
	// TODO Auto-generated constructor stub
}
public CourseList(ArrayList<Course> courseList) {
	super();
	this.courseList = courseList;
}
public ArrayList<Course> getCourseList() {
	return courseList;
}
public void setCourseList(ArrayList<Course> courseList) {
	this.courseList = courseList;
}
public void insert(Course course)
{
	courseList.add(course);
}
public void discount()
{
	Course s=Collections.max(courseList);
	Course q=Collections.min(courseList);
	courseList.stream().forEach(clist->{
		if(clist.getFee()==s.getFee())
		{
			System.out.println("discount is:"+ (clist.getFee()*10/100)+" for "+clist.getName()+"Course");
		}
		else if(clist.getFee()==q.getFee())
		{
			System.out.println("discount is:"+ (clist.getFee()*5/100)+" for "+clist.getName()+"Course");	
		}
	});
	
	
		
}


}

