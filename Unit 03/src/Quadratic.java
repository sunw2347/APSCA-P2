//?A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Quadratic
{
	private int a, b, c;
	private double rootOne;
	private double rootTwo;

	public Quadratic()
	{
		setEquation(0, 0, 0);
		rootOne = 0;
		rootTwo = 0;

	}

	public Quadratic(int quadA, int quadB, int quadC)
	{
		setEquation(quadA, quadB, quadC);
		rootOne = 0;
		rootTwo = 0;
	}

	public void setEquation(int quadA, int quadB, int quadC)
	{
		quadA = a;
		quadB = b;
		quadC = c;

 	}

	public void calcRoots( )
	{
		rootOne = ((-b + Math.sqrt((b*b)-4*a*c))/2*a);
		rootTwo = ((-b - Math.sqrt((b*b)-4*a*c))/2*a);
	}

	public void print( )
	{
		System.out.printf("rootone :: %.2f \n\n\n", rootOne);
		System.out.printf("roottwo :: %.2f \n\n\n", rootTwo);
	}
}