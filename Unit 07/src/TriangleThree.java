//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class TriangleThree
{
   private int size;
   private String letter;

	public TriangleThree()
	{
		setTriangle("", 0);
	}

	public TriangleThree(String let, int count)
	{
		setTriangle(let, count);
	}

	public void setTriangle( String let, int sz )
	{
		size = sz;
		letter = let;
	}

	public String getLetter()
	{
		return letter;
	}

	public String toString()
	{
		String output = "";
		for(int i = 0; i <= size ; i++)
		{
			for(int j = 0; j < size; j++)
			{
				output += " ";
			}
			for(int j = i; j < size; j++)
			{
				output += getLetter();
			}
			output += "\n";
		}
		return output;
	}
}