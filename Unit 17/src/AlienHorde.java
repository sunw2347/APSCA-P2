//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde
{
	private List<Alien> aliens;
	private int time;
	private int size;

	public AlienHorde(int s)
	{
		aliens = new ArrayList<Alien>();
		size = s;

	}

	public void add(Alien al)
	{
		aliens.add(al);
	}

	public void drawEmAll( Graphics window )
	{
		for (Alien al : aliens)
			al.draw(window);
	}

	public void moveEmAll()
	{
		time++;
		for (Alien alien : aliens) {
			if (time <= 250) {
				alien.move("LEFT");
			} else if (time <= 270) {
				alien.move("DOWN");
			} else if (time <= 520) {
				alien.move("RIGHT");
			} 
			 else if (time <= 540) {
					alien.move("DOWN");
					time=0;

			 }
		}
	}

	public void removeDeadOnes(List<Ammo> shots)
	{
		for(int i=0;i<shots.size();i++)
		{
			for(int j=0;j<aliens.size();j++)
			{
				try {
					if (shots.get(i).Collide(aliens.get(j))) {
						shots.remove(i);
						aliens.remove(j);
						i--;
						j--;
					}
				} catch (ArrayIndexOutOfBoundsException e) {

				}
			}
		}
	}
	public List<Alien> getAliens() {
		return aliens;
	}

	public int getSize() {
		return size;
	}
	public String toString()
	{
		return "";
	}

	
}