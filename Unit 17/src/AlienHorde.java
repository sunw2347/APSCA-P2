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

	public AlienHorde(int size)
	{
		aliens = new ArrayList<Alien>();
	}

	public void add(Alien al)
	{
		aliens.add(al);
	}

	public void drawEmAll( Graphics window )
	{
		for(Alien alien : aliens)
		{
			alien.draw(window);
		}
	}

	public void moveEmAll()
	{
		for(Alien alien : aliens)
		{
			alien.move("LEFT");
		}
	}

	public void removeDeadOnes(List<Ammo> shots)
	{
		for(int i = 0; i < shots.size(); i += 5)
		{
			for(Alien alien : aliens)
			{
				if(shots.get(i).getX() <= alien.getX() + 80 && shots.get(i).getX() >= alien.getX() - 10 && shots.get(i).getY() <= alien.getY() + 75 && shots.get(i).getY() >= alien.getY() -10)
				{
					aliens.remove(alien);
					shots.get(i).setPos(800,0);
				}
			}

		}
	}
	
	public List<Alien> getList()
	{
		return aliens;
	}

	public String toString()
	{
		return aliens.toString();
	}
}