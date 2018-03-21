//?A+ Computer Science  -  www.apluscompsci.com
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
		if(word.length() > rhs.toString().length()){
			return 1;
		}
		if(word.length() < rhs.toString().length()){
			return -1;
		}
		else{
			if(word.charAt(0) > rhs.toString().charAt(0)){
				return 1;
			}
			if(word.charAt(0) < rhs.toString().charAt(0)){
				return -1;		
			}
		return 0;
	}

	public String toString()
	{
		return word;
	}
}