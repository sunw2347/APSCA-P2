//?A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import static java.lang.System.*;

public class MadLib
{
	private ArrayList<String> verbs; //arraylist instantiation
	private ArrayList<String> nouns;
	private ArrayList<String> adjectives;
	
	public MadLib()
	{
		verbs = new ArrayList<String>();
		nouns = new ArrayList<String>();
		adjectives = new ArrayList<String>();

	}

	public MadLib(String fileName)
	{
		//load stuff
		try{
			Scanner file = new Scanner(new File(fileName));
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}
		
	}

	public void loadNouns()
	{
		try{
			 Scanner scanner = new Scanner(new File("C:\\Users\\sunw2347\\Desktop\\Unit\\Unit10\\Unit10-2016\\Unit10-Assignments\\Lab16d\\nouns.dat"));
			 while (scanner.hasNext()){
				    nouns.add(scanner.next());
			}
			scanner.close();
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}	
		
	}
	
	public void loadVerbs()
	{
		try{
			Scanner scanner = new Scanner(new File("C:\\Users\\sunw2347\\Desktop\\Unit\\Unit10\\Unit10-2016\\Unit10-Assignments\\Lab16d\\verbs.dat"));
			while (scanner.hasNext()){
				    verbs.add(scanner.next());
			}
			scanner.close();
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}
	}

	public void loadAdjectives()
	{
		try{
			Scanner scanner = new Scanner(new File("C:\\Users\\sunw2347\\Desktop\\Unit\\Unit10\\Unit10-2016\\Unit10-Assignments\\Lab16d\\adjectives.dat"));
			while (scanner.hasNext()){
			    adjectives.add(scanner.next());
			}
			scanner.close();
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}
	}

	public String getRandomVerb()
	{
		Random rand = new Random(); 
		int value = rand.nextInt(19) + 1;
		return verbs.get(value) + " ";
	}
	
	public String getRandomNoun()
	{
		Random rand = new Random(); 
		int value = rand.nextInt(12) + 1; 
		return nouns.get(value) + " ";
	}
	
	public String getRandomAdjective()
	{
		Random rand = new Random(); 
		int value = rand.nextInt(17) + 1; 
		return adjectives.get(value) + " ";
	}		

	public String toString()
	{
	   return "The " + getRandomNoun() + getRandomVerb() + "after the " + getRandomAdjective() + getRandomAdjective() + getRandomNoun() + "while the " + getRandomVerb() + "the" + getRandomNoun();
	}
}