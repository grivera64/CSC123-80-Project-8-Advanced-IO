package project8.gpa;

/*
 * 
 * Name: Student.java
 * Purpose: Represents a student profile at a school
 * Author: grivera64
 * Date: 04/21/2021
 * 
 */

/* Imports */
import java.io.Serializable;


public class Student implements Serializable
{

	/* Private Fields */
	private String name;
	private int id;
	private int[] grades;
	
	/* Constructor */
	public Student(String name, int id, int[] grades)
	{
		
		this.setName(name);
		this.setId(id);
		this.setGrades(grades);
		
	}
	
	/* Mutators/Accessors */
	public void setName(String name)
	{
		
		this.name = name;
		
	}
	
	public String getName()
	{
		
		return this.name;
		
	}
	
	public void setId(int id)
	{
		
		this.id = id;
		
	}
	
	public int getId()
	{
		
		return this.id;
		
	}
	
	public void setGrades(int[] grades)
	{
		
		this.grades = grades;
		
	}
	
	public int[] getGrades()
	{
		
		return this.grades;
	
	}
	
	/* Calculates and returns the student's GPA */
	public double getGPA()
	{
		
		int sum = 0;
		
		for (int num : this.getGrades())
		{
			
			sum += num;
			
		}
		
		return ((double) sum) / ((double) this.getGrades().length);
		
	}
	
	/* Returns the student's data as a String */
	public String toString()
	{
		
		return String.format("%-11s%-8d%.2f\n", this.getName(), this.getId(), this.getGPA());
		
	}
	
}