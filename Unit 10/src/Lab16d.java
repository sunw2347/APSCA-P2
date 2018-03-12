//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab16d
{
	public static void main( String args[] )
	{
		//make a new MadLib
		MadLib run = new MadLib();
		run.getRandomVerb();
		run.getRandomNoun();
		run.getRandomAdjective();
		run.toString();
		out.println("\n");
	}
}