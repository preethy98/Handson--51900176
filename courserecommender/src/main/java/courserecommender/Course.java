package courserecommender;

public class Course {
	String name,mentor;
	Double fee;
	public Course() {
		// TODO Auto-generated constructor stub
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
		System.out.println("name="+name+"\n"+"mentor="+mentor+"\n"+"fee="+fee);
	}

}
