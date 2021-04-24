//package project8.gpa;

/*
 * 
 * Name: SerializeStudent.java
 * Purpose: Serializes student classes into a file
 * Author: grivera64
 * Date: 04/21/2021
 * 
 */

/* Import Statements */
import java.util.Scanner;
import java.util.Random;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class SerializeStudent
{
	
	public static void main(String[] args) throws IOException
	{
		
		//Local variables
		String name;
		int seed;
		int id, numStudents, numGrades;
		int[] gradeList;
		Random randy;
		Scanner keyboard = new Scanner(System.in);
		Student stud;
		
		System.out.printf("Please enter a Seed for the random number generator: ");
		seed = keyboard.nextInt();
		randy = new Random(seed);
		keyboard.nextLine();
		
		System.out.printf("Please enter the name of the output file: ");
		String fileName = keyboard.nextLine();
		
		ObjectOutputStream inFile = 
				new ObjectOutputStream(new FileOutputStream(fileName));
		
		for (numStudents = randy.nextInt(6) + 3; numStudents > 0; numStudents--)
		{
			
			System.out.printf("Please enter the Student's last name: ");
			name = keyboard.nextLine();
			
			id = randy.nextInt(10001) + 10000;
			
			numGrades = randy.nextInt(4) + 3;
			
			gradeList = new int[numGrades];
			
			for (int i = 0; i < numGrades; i++)
			{
				
				gradeList[i] = randy.nextInt(41) + 60;
				
			}
			
			stud = new Student(name, id, gradeList);
			
			inFile.writeObject(stud);
			
		}
		
		inFile.close();
		keyboard.close();
		
		System.out.printf("The serialized objects were written to the %s file.\n", fileName);
		
	}
	
}