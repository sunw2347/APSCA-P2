//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab24b
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File ("C:\\Users\\sunw2347\\Desktop\\Unit\\Unit14\\Unit14-Assignments\\lab24b.dat"));
		int size = file.nextInt();
		file.nextLine();
		for(int i = 0; i<size; i++)
		{
			FancyWord test = new FancyWord(file.nextLine());
			System.out.println(test);
	   }
	}
}