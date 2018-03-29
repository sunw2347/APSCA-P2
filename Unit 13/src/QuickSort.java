//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  - 

import static java.lang.System.*;
import java.util.Arrays;		//use Arrays.toString() to help print out the array

public class QuickSort
{
	private static int passCount;

	public static void quickSort(Comparable[] list)
	{	passCount = 0;
		int low = 0;
		int high = list.length - 1;
		quickSort(list, low, high);
	}	


	private static void quickSort(Comparable[] list, int low, int high)
	{ 
		
		if(low < high){
			int split = partition(list, low, high);
			System.out.println("pass " +passCount+++ " " + Arrays.toString(list));
			quickSort(list, low, split);
			quickSort(list, split+1, high);
			
				
		}
		
	}


	private static int partition(Comparable[] list, int low, int high)
	{
		
		Comparable pivot = list[low];
		int x=low-1;
		int top=1+high;
		while (x<top){
			while (list[--top].compareTo(pivot)>0);
			while (list[++x].compareTo(pivot)<0);
				if (x>=top){
					return top;
				}
				Comparable holder= list[x];
				list[x]=list[top];
				list[top]=holder;
				
			
		}



		return 0;
	}

	public static void main(String args[])
	{
		QuickSort.quickSort(new Comparable[]{9,5,3,2});


		QuickSort.quickSort(new Comparable[]{19,52,3,2,7,21});


		QuickSort.quickSort(new Comparable[]{68,66,11,2,42,31});
	}

}