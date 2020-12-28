package collectionexample;

import java.util.ArrayList;
import java.util.Iterator;

public class Employee {
	String employeeName;
	ArrayList<String> employeemobileNumber;
	Long employeesalary;
	String Email;
	Address address;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(String employeeName, ArrayList<String> employeemobileNumber, Long employeesalary, String email,
			Address address) {
		super();
		this.employeeName = employeeName;
		this.employeemobileNumber = employeemobileNumber;
		this.employeesalary = employeesalary;
		Email = email;
		this.address = address;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public ArrayList<String> getEmployeemobileNumber() {
		return employeemobileNumber;
	}
	public void setEmployeemobileNumber(ArrayList<String> employeemobileNumber) {
		this.employeemobileNumber = employeemobileNumber;
	}
	public Long getEmployeesalary() {
		return employeesalary;
	}
	public void setEmployeesalary(Long employeesalary) {
		this.employeesalary = employeesalary;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void display()
	{
		System.out.println("Name :"+employeeName);
		System.out.println("The contact numbers are :");
		Iterator<String> number=employeemobileNumber.iterator();
		while(number.hasNext())
		{
			System.out.println(number.next()+"\n");
			
		}
		System.out.println("Salary :"+employeesalary+"\n"+"Email"+Email+"\n"+"Address"+address);
	}

}
