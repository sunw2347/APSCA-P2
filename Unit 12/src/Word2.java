//?A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Word2 implements Comparable<Word2>
{
	private String word;

	public Word2(String s)
	{
		word = s;
	}

	private int numVowels()
	{
		String vowels = "AEIOUaeiou";
		int vowelCount=0;
		for(int i = 0; i < word.length(); i++){
			if(vowels.indexOf(word.charAt(i)) > -1){
				vowelCount++;
			}
		}
		return vowelCount;
	}

	public int compareTo(Word2 rhs)
	{
		if(numVowels()>rhs.numVowels()) return 1;
		if(numVowels()<rhs.numVowels()) return -1;
		else
			if(word.compareTo(rhs.toString()) > 0) return 1;
			else if(word.compareTo(rhs.toString()) < 0) return -1;
	return 0;
	}

	public String toString()
	{
		return word;
	}
}