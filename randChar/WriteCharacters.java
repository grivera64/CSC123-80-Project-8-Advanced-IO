//package project8.randChar;

/*
 * 
 * Name: WriteCharacters.java
 * Purpose: Writes characters into a binary file
 * Author: grivera64
 * Date: 04/20/2021
 * 
 */

/* Imports */
import java.util.Random;
import java.util.Scanner;
import java.io.RandomAccessFile;
import java.io.IOException;


public class WriteCharacters
{
	
	/* Driver Method */
	public static void main(String[] args) throws IOException
	{
		
		/* Create objects for use in program */
		Scanner keyboard = new Scanner(System.in);
		Random random = new Random(5);
		char arr[] = new char[15];
		
		/* initialize arr to random uppercase letters */
		for (int index = 0; index < 15; index++)
		{
			
			arr[index] = (char)(random.nextInt(26) + (int) 'A');
			
		}
		
		/* Print the characters in the array */
		int counter = 1;
		for (char character : arr)
		{
			
			System.out.printf("%d\t%c\n", counter, character++);
			
		}
		
		/* Ask user for Random Access Output File */
		System.out.printf("Please enter the name of the Random Access output file: ");
		String fileName = keyboard.nextLine();
		
		System.out.printf("Opening the file...\n");
		
		/* Create the Random Access File */
		RandomAccessFile rFile = new RandomAccessFile(fileName, "rw");
		
		System.out.printf("Writing data to the file...\n");
		
		/* Write each character to the file */
		for (char character : arr)
		{
			
			rFile.writeChar(character);
			
		}
		
		System.out.printf("Done.\n");
		
		/* Close the input and output */
		rFile.close();
		keyboard.close();
		
		/* Program Terminated */
		
	}
	
}