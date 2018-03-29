//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  - 

import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

class InsertionSort
{
	private ArrayList<String> list = new ArrayList<String>();

	public InsertionSort()
	{
	
	}

	//modfiers
	public void add(String word)
	{
		
		int x = 0;
		if (list.indexOf(word)!=-1){
			System.out.println("Already in list.");
		}
		else{
			x = Collections.binarySearch(list, word);
			x = Math.abs(x+1);
			list.add(x, word);
			
		}
	}


	public void remove(String word)
	{
	
		list.remove(word);

	}

	public String toString()
	{
		
		String output = "";
		for (int i = 0; i<list.size(); i++){
			output += list.get(i) + " ";
		}
		return output; 
	}
}