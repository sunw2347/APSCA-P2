//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab24d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner (new File("C:\\Users\\sunw2347\\Desktop\\Unit\\Unit14\\Unit14-Assignments\\lab24d.dat"));
		int s = file.nextInt();
		file.nextLine();
		for(int i = 0; i < s; i++){
			TicTacToe test = new TicTacToe(file.nextLine());
			System.out.println(test);
		}

	}
}



