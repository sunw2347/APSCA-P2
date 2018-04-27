//?A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab


import java.awt.Color;

import java.awt.Graphics;

import java.awt.Image;

import java.io.File;

import javax.imageio.ImageIO;



public class Alien extends MovingThing
{
	private int speed;
	private Image image;

	public Alien()
	{
		this(0,0,0);
	}

	public Alien(int x, int y)
	{
		this(x,y,0);
	}

	public Alien(int x, int y, int s)
	{
		super(x, y);
		speed=s;
		try
		{
			image = ImageIO.read(new File("alien.JPG"));
		}
		catch(Exception e)
		{
			//feel free to do something here
			System.out.println("Retry");
		}
	}

	public void setSpeed(int s)
	{
	   //add code
		speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}
	
	public void move(String direction)
	{
		if(direction.equals("LEFT"))
	      setX(getX()-getSpeed());
		else if(direction.equals("RIGHT"))
			setX(getX() + getSpeed());
		else if(direction.equals("UP"))
			setY(getY() - getSpeed());
		else if(direction.equals("DOWN"))
			setY(getY() + getSpeed());
		
		if(getX() > 800)
		{
			setX(0);
		}
		if(getX() < 0)
		{
			setX(800);
		}
      //add more code to complete the move method
	}

	public void draw( Graphics window )
	{
		window.drawImage(image,getX(),getY(),80,80,null);
	}

	public String toString()
	{
		return super.toString() + " " + getSpeed();
	}
}