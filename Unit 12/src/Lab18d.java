//?A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class Lab18d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("C:\\Users\\sunw2347\\Desktop\\Unit\\Unit12\\Unit12-2016\\Unit12-Assignments\\Lab18d\\lab18d.dat"));

		int size = file.nextInt();
		file.nextLine();
		Word1[] x = new Word1[size];
		for(int i=0;i<size;i++)
		{
			Word1 w = new Word1(file.nextLine());
			x[i] = w;
		}
		Word1 a = new Word1(x[0].toString());
		for(int i =0;i<size;i++)
		{
		for(int z=0;z<size-1;z++)
		{
			if(x[z].compareTo(x[z+1]) ==1)
			{
				a = x[z+1];
				x[z+1] = x[z];
				x[z] = a;
			}
		}
		
		}
		for (int i = 0; i < x.length; i++){
			System.out.println(x[i]);
		}

		}
		
}