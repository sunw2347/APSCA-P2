//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab21i
{
	public static void main( String args[] ) throws IOException
	{
		Scanner sc = new Scanner(new File("C:\\Users\\sunw2347\\Desktop\\APSCA-P2\\Unit 14\\src\\lab21i.dat"));
		while(sc.hasNextLine())
		{
			int size = sc.nextInt();
			sc.nextLine();
			String str = sc.nextLine();
			Maze test = new Maze(size, str);
			System.out.println(test);
		}
	}
}