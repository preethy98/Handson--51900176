package courserecommender;

import java.util.ArrayList;

public class CourseList {
ArrayList<Course> courseList;
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
public ArrayList<String> noofCourse(Double budget)
{
	ArrayList<String> clist=new ArrayList<>();
	courseList.stream().forEach(list->{
		if(list.getFee()<budget)
		{
			int count=1;
			clist.add(list.getName()+"-"+count);
			count++;
		}
		
	});
	return clist;
	
	//while(budget<courseList.getFee()) {
		//courseList.add(new Course(course.getName(),course.getMentor(),course.getFee()));}
		//return courselist;
	
}
}
