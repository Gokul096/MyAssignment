package org.college;

public class College {
public void collegeName()
{
	System.out.println("Kumarasamy College of Engineering");
}
public void collegeCode()
{
	System.out.println("656432");
}
public void collegeRank() 
{
	System.out.println("Grade 'A'");
}
public static void main(String[] args) 
{
	College obj=new College();
	obj.collegeName();
	obj.collegeCode();
	obj.collegeRank();
}

}


