//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Word1 implements Comparable<Word1>
{
	private String word;

	public Word1(String s)
	{
		word = s;
	}

	public int compareTo(Word1 rhs)
	{
		if(equals(rhs))return 0;
		if(()>rhs.numVowels()) return 1;
		else
		return -1;
		
		
		return 0;
	}

	public String toString()
	{
		return word;
	}
}