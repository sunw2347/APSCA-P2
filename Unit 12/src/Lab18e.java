//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class Lab18e
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("C:\\Users\\sunw2347\\Desktop\\Unit\\Unit12\\Unit12-2016\\Unit12-Assignments\\Lab18e\\lab18e.dat"));

		int size = file.nextInt();
		for(int i = 0; i < size; i++){
		String s = file.nextLine();
		String d = file.nextLine();
		Word2 test = new Word2(s);
		if(s.compareTo(d) < 0){
			out.println(s);
		}
		else if(s.compareTo(d) == 0){
			char ch = s.charAt(0);
			int asc = (int) ch;
			char cha = d.charAt(0);
			int ascii = (int) cha;
			if(asc > ascii){
				out.print(d);
			}
			else{
				out.print(s);
			}
		}
		else{
			out.print(d);
		}
	}
}
}