//?A+ Computer Science  -  www.apluscompsci.com
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

		ArrayList<Word2> w = new ArrayList<Word2>();
		
		int size = file.nextInt();
		file.nextLine();
		while(file.hasNextLine())
			w.add(new Word2(file.nextLine()));
		System.out.println(w);
		for (int j=0;j<w.size()-1;j++){
		for (int i=0;i<w.size()-1;i++){
			if(w.get(i).compareTo(w.get(i+1))>0){
				Word2 x  = w.get(i);
				w.set(i, w.get(i+1));
				w.set(i+1, x);
			}
		}
		}
		for (int i = 0; i < w.size(); i++){
			System.out.println(w.get(i));
		}
	}
}