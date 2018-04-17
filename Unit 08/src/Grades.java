//?A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.lang.System;
import java.lang.Math;
import java.util.Scanner;

public class Grades
{
	private int number;
	public Grades(){
		this(0);

		
	}
	
	public Grades(int num){
		//constructor
		setGrades(num);
	}
	
	public void setGrades(int num){
	//set method
		number=num;
	
		
	}


	private double getSum()
	{
		Scanner keyboard = new Scanner(System.in);
		double[] grades = new double[number];
		System.out.print("Enter grades: ");
		double sum=0.0;
	
		for (int i=0; i<number; i++){
			double input = keyboard.nextDouble();
			grades[i]=input;
			System.out.print("Grade " + i + ": " + input + "\n");
			sum=sum+input;
			
		}



		return sum;
	}

	public double getAverage()
	{
	
		double average=0.0;
		average=getSum()/number;
		return average;
	}

	public String toString()
	{
		return "\naverage = " + getAverage() + "\n";
		
	}
	



}