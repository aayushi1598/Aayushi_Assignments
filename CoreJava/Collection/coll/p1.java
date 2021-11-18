package coll;

import java.util.HashSet;
import java.util.Set;

public class p1{

	public static void main(String[] args) {
		Set<Employee> emp=new HashSet<>();
		emp.add(new Employee(001,"Aayushi","Singer",15000));
		emp.add(new Employee(002,"Akash","Developer",50000));
		emp.add(new Employee(003,"Divyanshu","Youtuber",100000));
		
		for(Employee e : emp)
		{
			System.out.println(e);
		}
		
	}
}

class Employee{
	int id;
	String name;
	String dept;
	int salary;
	
		
	public Employee(int id, String name, String dept, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee Details [id=" + id + ", name=" + name + ", dept=" +dept +",salary=" + salary + "]";
	}

	public void displayDetails()
	{
		this.toString();
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
		System.out.println("Department: "+dept);
	}
}