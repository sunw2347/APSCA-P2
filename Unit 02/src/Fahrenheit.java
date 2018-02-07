//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Fahrenheit
{
	private double fahrenheit;

	public void setFahrenheit(double fahren)
	{
	 fahrenheit = fahren;
	}

	public double getCelsius()
	{	
		double celsius = 0.0;
		celsius = (fahrenheit - 32)* (5/9);//add code to convert fahrenheit to celsius
		return celsius;
	}

	public void print()
	{
		//this is part of the solution
		Fahrenheit test = new Fahrenheit();
		test.getCelsius();
		System.out.printf("%.2f degrees Fahrenheit == %.2f degrees Celsius\n\n\n", fahrenheit, celsius);
	}
}
