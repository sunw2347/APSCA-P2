//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab21g
{
	public static void main(String args[])
	{
		//instantiate an AtCounter
		AtCounter test = new AtCounter();
		test.countAts(0, 0);
		out.println(test.toString());
		AtCounter test2 = new AtCounter();
		test2.countAts(2, 5);
		out.println(test2.toString());
		AtCounter test3 = new AtCounter();
		test3.countAts(5, 0);
		out.println(test3.toString());
		AtCounter test4 = new AtCounter();
		test4.countAts(9, 9);
		out.println(test4.toString());
		AtCounter test5 = new AtCounter();
		test5.countAts(3, 9);
		out.println(test5.toString());
		//test the code
	}
}