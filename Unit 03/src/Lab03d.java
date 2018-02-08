//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab03d
{
	public static void main( String[] args )
	{
		//add test cases
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter x1 :: \n");
		int x1 = keyboard.nextInt();
		System.out.println("Enter x2 :: \n");
		int x2 = keyboard.nextInt();
		System.out.println("Enter y1 :: \n");
		int y1 = keyboard.nextInt();
		System.out.println("Enter y2 :: \n");
		int y2 = keyboard.nextInt();
		
		Distance test = new Distance(x1, x2, y1, y2);
		test.calcDistance();
		test.print();
		
		System.out.println("Enter x1 :: \n");
		x1 = keyboard.nextInt();
		System.out.println("Enter x2 :: \n");
		x2 = keyboard.nextInt();
		System.out.println("Enter y1 :: \n");
		y1 = keyboard.nextInt();
		System.out.println("Enter y2 :: \n");
		y2 = keyboard.nextInt();
		
		test.setCoordinates(x1, y1, x2, y2);
		test.calcDistance();
		test.print();
		
		System.out.println("Enter x1 :: \n");
		x1 = keyboard.nextInt();
		System.out.println("Enter x2 :: \n");
		x2 = keyboard.nextInt();
		System.out.println("Enter y1 :: \n");
		y1 = keyboard.nextInt();
		System.out.println("Enter y2 :: \n");
		y2 = keyboard.nextInt();
		
		test.setCoordinates(x1, y1, x2, y2);
		test.calcDistance();
		test.print();
			
	}
}