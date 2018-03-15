//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.io.File;
import java.util.ArrayList;

public class GradeBookFileRunner
{
   public static void main( String args[] ) throws Exception
   {
		out.println("Class Stats program\n\n");
		Scanner file = new Scanner(new File("C:\\Users\\sunw2347\\Documents\\GitHub\\APCSA-P2\\Unit11\\src\\Gradebook.dat"));
		String name = file.nextLine();
		int number = Integer.parseInt(file.nextLine());
		Class userclass = new Class(name, number);
		for (int i = 0; i < number; i++){
			Student student = new Student(file.nextLine(), file.nextLine());
			userclass.addStudent(i, student);
		}
		out.println(userclass + "\n");
		out.println(userclass + "\n");
		out.println("Failure List = " + userclass.getFailureList(65));
		out.println("Highest Average = " + userclass.getStudentWithHighestAverage());
		out.println("Lowest Average = " + userclass.getStudentWithLowestAverage());
		out.println("Class average = " + userclass.getClassAverage());
		












	}		
}