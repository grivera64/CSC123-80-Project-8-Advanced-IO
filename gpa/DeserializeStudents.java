package project8.gpa;

/*
 * 
 * Name: DeserializeStudents.java
 * Purpose: Reads students from a .dat file
 * Author: grivera64
 * Date: 04/21/2021
 * 
 */

/* Imports */
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.EOFException;

public class DeserializeStudents
{
	
	/* Driver method */
	public static void main(String[] args)
	{
		
		/* Create input reader */
		Scanner keyboard = new Scanner(System.in);
		
		/* Ask user for input */
		System.out.printf("Please enter the name of the input file of Student Objects: ");
		
		/* Local Variables */
		String name = null;
		FileInputStream file;
		ObjectInputStream inFile;
		
		/* Loop until input is valid */
		while (true)
		{
			try
			{
				
				/* Get input and check for any exceptions */
				name = keyboard.nextLine();
				file = new FileInputStream(name);
				inFile = new ObjectInputStream(file);
				
				/* If all went well, print the chart */
				System.out.printf("%-11s%-8s%s\n", "Name", "ID", "GPA");
				
				/* Read file until reach EOF */
				while (true)
				{
					
					System.out.printf("%s", inFile.readObject());
					
				}
				
			}
			/* Catch EOF */
			catch (EOFException e)
			{
				
				System.out.printf("File reading complete\n");
				break;
				
			}
			/* Catch any other error */
			catch (Exception e )
			{
				
				System.out.printf("File %s wasn't found\nPlease re-enter: ", name);
				continue;
				
			}
		}
		
		/* Close input reader */
		keyboard.close();
		
		/* Terminate the program */
		
	}
	
}