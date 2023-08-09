package org.student;

import org.department.Department;

public class Student extends Department 
{
	public void studentName() 
	{
		System.out.println("Gokul");
	}
	public void studentDept() 
	{
		System.out.println("B.Tech(IT)");
	}
	public void studentId() 
	{
		System.out.println("19BIT4023");
	}
	public static void main(String[] args) 
	{
		Student obj=new Student();
		obj.collegeName();
		obj.collegeCode();
		obj.collegeRank();
		obj.deptName();
		obj.studentName();
		obj.studentDept();
		obj.studentId();
	}

}

