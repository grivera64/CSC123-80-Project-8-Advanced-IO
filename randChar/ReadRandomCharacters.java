//package project8.randChar;

/*
 * 
 * Name: ReadRandomCharacters.java
 * Purpose: Reads a .data file with character content
 * Author: grivera64
 * Date: 04/20/2021
 * 
 */

/* Imports */
import java.util.Scanner;
import java.io.RandomAccessFile;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadRandomCharacters
{
	
	/* Driver method */
	public static void main(String[] args) throws IOException
	{
		/* Allow keyboard input */
		Scanner keyboard = new Scanner(System.in);
		
		/* Request for a valid input file until it's valid */
		System.out.printf("Please enter the name of the input file: ");
		
		/* Create variables to store values outside of the while loop */
		String fileName;
		RandomAccessFile rFile = null;
		boolean successful = false;
		
		while (!successful)
		{
			
			/* Attempt to read inputed file */
			try
			{
				
				fileName = keyboard.nextLine();
				rFile = new RandomAccessFile(fileName, "r");
				successful = true;
				
			}
			catch (FileNotFoundException e)
			{
				
				continue;
				
			}
			
		}
		
		/* Print the 6th, 8th, and 3rd entry */
		rFile.seek(5 * 2);
		System.out.printf("Sixth entry is %c\n", rFile.readChar());
		
		rFile.seek(7 * 2);
		System.out.printf("Eighth entry is %c\n", rFile.readChar());
		
		rFile.seek(2 * 2);
		System.out.printf("Third entry is %c\n", rFile.readChar());
		
		/* Close and terminate */
		rFile.close();
		keyboard.close();
		
	}
	
}