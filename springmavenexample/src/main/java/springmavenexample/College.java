package springmavenexample;
import java.util.List;
public class College {
List<String> courses;
public College() {
	// TODO Auto-generated constructor stub
}

public College(List<String> courses) {
	super();
	this.courses = courses;
}

public List<String> getCourses() {
	return courses;
}
public void setCourses(List<String> courses) {
	this.courses = courses;
}


}
