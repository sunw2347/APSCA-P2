//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class CharacterAnalyzer
{
	private char theChar;

	public CharacterAnalyzer()
	{
		setChar(' ');

	}

	public CharacterAnalyzer(char c)
	{
		setChar(c);

	}

	public void setChar(char c)
	{
		theChar = c;

	}
	
	public char getChar()
	{
		return theChar;
	}

	public boolean isUpper( )
	{
		if(theChar == Character.toUpperCase(theChar))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean isLower( )
	{
		if(theChar == Character.toLowerCase(theChar))
		{
			return true;
		}
		else
		{
			return false;
	
		}
	}
	public boolean isNumber( )
	{
		if(theChar >= '0' && theChar <= '9')
		{
			return true;
		}
		else
		{
		return false;
		}	
	}
	public int getASCII( )
	{
		int ascii = (int)theChar;
		return 0;
	}

	public String toString()
	{
		if(isUpper() == true)
		{
		return "" + getChar() + " is an uppercase character. ASCII == " + getASCII() + "\n";
		}
		else if(isLower() == true)
		{
		return "" + getChar() + " is a lowercase character. ASCII == " + getASCII() + "\n";
		}
		else
		{
		return "" + getChar() + " is a number. ASCII == " + getASCII() + "\n";
		}
	}
}