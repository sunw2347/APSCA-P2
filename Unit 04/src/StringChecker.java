//?A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringChecker
{
	private String word;

	public StringChecker()
	{
		setString("");
	}

	public StringChecker(String s)
	{
		setString(s);

	}

   public void setString(String s)
   {
   		word = s;
   }

	public boolean findLetter(char c)
	{
		if (word.contains("c") || word.contains("g") || word.contains("U")) {
			return true;
		}

		else {
		return false;
		}
	}

	public boolean findSubString(String s)
	{
		if (word.contains(s) ){
			return true;
		}

		else{
		return false;
		}
	}

 	public String toString()
 	{
 		return "\n\n";
	}
}