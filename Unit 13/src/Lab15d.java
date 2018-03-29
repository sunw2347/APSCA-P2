//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class Lab15d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner sc = new Scanner(new File("C:\\Users\\sunw2347\\Desktop\\APSCA-P2\\Unit 13\\src\\lab15d.dat"));

		int x = sc.nextInt();
		sc.nextLine();

		for (int i=0; i<x; i++){
			FancyWords test = new FancyWords(sc.nextLine());
			System.out.println(test);
		}
		


	}
}