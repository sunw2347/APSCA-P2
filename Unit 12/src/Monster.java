//?A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Monster implements Comparable
{
	private int myWeight;
	private int myHeight;
	private int myAge;

	//write a default Constructor
	public Monster()
	{
		setHeight(0);
		setWeight(0);
		setAge(0);
	}


	//write an initialization constructor with an int parameter ht
	public Monster(int ht)
	{
		myHeight = ht;
	}


	//write an initialization constructor with int parameters ht and wt
	public Monster(int ht, int wt)
	{
		myWeight = wt;
		myHeight = ht;
	}



	//write an initialization constructor with int parameters ht, wt, and age
	public Monster(int ht, int wt, int age)
	{
		myWeight = wt;
		myHeight = ht;
		myAge = age;
	}


	//modifiers - write set methods for height, weight, and age
	public void setHeight(int ht)
	{
		myHeight = ht;
	}
	public void setWeight(int wt)
	{
		myWeight = wt;
	}
	public void setAge(int age)
	{
		myAge = age;
	}
	
	
	//accessors - write get methods for height, weight, and age
	public int getHeight()
	{
		return myHeight;
	}
	public int getWeight()
	{
		return myWeight;
	}
	public int getAge()
	{
		return myAge;
	}
	//creates a new copy of this Object
	public Object clone()
	{
	   	return new Monster();
	}

	public boolean equals( Object obj )
	{
		if (this.compareTo(obj) == 0){
			return true;
		}
		return false;
	}

	public int compareTo( Object obj )
	{
		Monster rhs = (Monster)obj;
		if(this.myHeight == rhs.myHeight)
		{
			if(this.myWeight == rhs.myWeight)
			{
				if(this.myAge == rhs.myAge)
				{
					return 0;
				}
				if(this.myAge > rhs.myAge)
				{
					return 1;
				}
				else
					return -1;
			}
			if(this.myWeight > rhs.myWeight)
			{
				return 1;
			}
			else
				return -1;
		}
		if(this.myHeight > rhs.myHeight)
		{
			return 1;
		}
		else
			return -1;
	
	}

	//write a toString() method
	public String toString()
	{
		return myHeight + " " + myWeight + " " + myAge;
	}
	
}