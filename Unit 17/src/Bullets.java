//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bullets
{
	private List<Ammo> ammo;
	private boolean load = true;
	private int timer = 40;
	private int tick = 0;

	public Bullets()
	{
		ammo = new ArrayList<Ammo>();
	}



	//post - draw each Ammo
	public void drawEmAll( Graphics window )
	{
		for (Ammo a : ammo)
			a.draw(window);
	}

	public void moveEmAll()
	{
		for (Ammo a : ammo)
			a.move("UP");
	}

	public void cleanEmUp()
	{
		for (int i = 0; i < ammo.size(); i++) {
			if (ammo.get(i).getY() < 0) {
				ammo.remove(i);
				i--;
			}
		}
	}

	public List<Ammo> getList()
	{
		return ammo;
	}
	public void add(Ammo al) 
	{
		if (load){
			ammo.add(al);
		load = false;
		} 
	}
	public void timeiskey() 
	{
		tick++;
		if (tick >= timer) {
			load = true;
			tick = 0;
		}
	}

	public String toString()
	{
		return Arrays.toString(ammo.toArray());

	}

	public List<Ammo> getAmmo() {
		return ammo;
	
	}
}
