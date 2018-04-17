//?A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.lang.Math;

public class Lab08i
{
	public static void main ( String[] args )
	{
		//test cases
		Prime test = new Prime();
		test.setPrime(24);
		test.isPrime();
		test.toString();
		
		test.setPrime(7);
		test.isPrime();
		test.toString();
		
		test.setPrime(100);
		test.isPrime();
		test.toString();
		
		test.setPrime(113);
		test.isPrime();
		test.toString();
		
		test.setPrime(65535);
		test.isPrime();
		test.toString();
		
		test.setPrime(2);
		test.isPrime();
		test.toString();
		
		test.setPrime(7334);
		test.isPrime();
		test.toString();
		
		test.setPrime(7919);
		test.isPrime();
		test.toString();
		
		test.setPrime(1115125003);
		test.isPrime();
		test.toString();
		
	}	
}