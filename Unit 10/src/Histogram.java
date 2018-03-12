//? A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Histogram
{
	private ArrayList<Integer> count;
	private ArrayList<Character> letters;
	private String fileName;

	public Histogram()
	{
		count = new ArrayList<Integer>();
		letters  = new ArrayList<Character>();
		
	}

	public Histogram(char[] values, String fName)
	{
		this();
		fileName = fName;
		for(int i=0;i<values.length;i++)
		{
			letters.add(values[i]);
		}
		out.println("searching for letters = "+letters);
	}

	public void loadAndAnalyzeFile() throws IOException
	{
		int counter;
		String s;
		for (int i = 0; i < letters.size(); i++){
			counter = 0;
			Scanner file = new Scanner(new File(fileName));
			while (file.hasNextLine()){
				s = file.nextLine();
				for (int j = 0; j < s.length(); j++)
					if (s.charAt(j) == letters.get(i)){
						counter ++;
				}
			}
			count.add(counter);
		}
	}

	public char mostFrequent()
	{
		int location =0;
		int greatestch = count.get(0);
		for (int i = 0; i < count.size();i++){
			if (greatestch < count.get(i)){
				greatestch = count.get(i);
				location = i;
			}
		}
		return letters.get(location);
	}

	public char leastFrequent()
	{
		int loc = 0;
		int little = count.get(0);
		for (int i =0;i <count.size();i++){
			if (little > count.get(i)){
				little = count.get(i);
				loc = i;
			}
		}
		return letters.get(loc);
	}

	public String toString()
	{
	   return fileName + "\n" + letters + "\n" + count;
	}
}