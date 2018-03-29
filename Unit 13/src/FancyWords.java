//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import static java.lang.System.*;

public class FancyWords
{
	private String[] wordRay; 

	public FancyWords(String sentence)
	{
		setWords(sentence);
	}

	public void setWords(String sentence)
	{	
		wordRay=sentence.split(" ");
	}

	public String toString()
	{
		String str="";
		int x = Integer.MIN_VALUE;
		for (String i: wordRay){
			if (x<i.length()){
				x=i.length();
			}
		}
		for (int i=0; i<wordRay.length; i++){
			for (int j=wordRay[i].length(); j<=x; j++){
				wordRay[i]=" "+wordRay[i];
			}
			
		}
		for (int i=0; i<= x; i++){
			for (int j=wordRay.length-1; j>=0; j--){
				char[] ch = wordRay[j].toCharArray();
				str += ch[wordRay[j].length()-i-1];
			}
			str+="\n";
		}

		return str+"\n";
	}
}