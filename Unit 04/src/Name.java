//?A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Name
{
	private String name; //instantiation
	private String last;

	public Name()
	{
		setName("", "");
		

	}

	public Name(String s, String t)
	{
		setName(s, t);

	}

   public void setName(String s, String t)
   {
	   name = s;
	   last = t;

   }

	public String getFirst()
	{
		name.substring(0,5);
		return name;
	}

	public String getLast()
	{
		last.substring(3);
		return last;
	}

 	public String toString()
 	{
 		return name + " " + last;
	}
}