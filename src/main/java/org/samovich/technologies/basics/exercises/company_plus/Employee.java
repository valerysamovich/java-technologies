package org.samovich.technologies.basics.exercises.company_plus;

public class Employee {
	
	private String empName;
	private int grade;
	
	// constructor
	public Employee(String empName, int grade){
		this.empName = empName;
		this.grade = grade;
	}
	
	// get method for grade
	public int getGrade(){
		return grade;
	}
	
	public String getEmpInof(){
		return empName + "(" + grade + ")";
	}
	
}
