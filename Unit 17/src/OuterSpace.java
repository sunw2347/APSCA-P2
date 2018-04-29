import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class OuterSpace extends Canvas implements KeyListener, Runnable
{
	private Ship ship;
	

	// uncomment once you are ready for this part
	 
   	private AlienHorde horde;
	private Bullets shots;
	private BossRound boss;

	private boolean[] keys;
	private BufferedImage back;

	public OuterSpace()
	{
		setBackground(Color.black);

		keys = new boolean[5];
		horde = new AlienHorde(20);
		//instantiate other instance variables
		//Ship, Alien
		ship = new Ship(400, 500, 75, 75, 2);
		shots = new Bullets();
		keys = new boolean[5];
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 3; j++) {
				horde.add(new Alien(400+80*i,40*j, 40,40,2));
			}
		}
		this.addKeyListener(this);
		new Thread(this).start();
		int x = (int)(Math.random() * 760);
		int y = (int)(Math.random() * 150) + 250;
		asteroid = new Asteroid(x,y);
		setVisible(true);
	}

   public void update(Graphics window)
   {
	   paint(window);
   }

	public void paint( Graphics window )
	{
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();

		graphToBack.setColor(Color.BLUE);
		graphToBack.drawString("StarFighter ", 25, 50 );
		graphToBack.setColor(Color.BLACK);
		graphToBack.fillRect(0,0,800,600);
		ship.draw(graphToBack);
		horde.drawEmAll(graphToBack);
		shots.drawEmAll(twoDGraph);
		if(keys[0] == true)
		{
			ship.move("LEFT");
		}
		if(keys[1] == true)
		{
			ship.move("RIGHT");
		}
		if(keys[2] == true)
		{
			ship.move("UP");
		}
		if(keys[3] == true)
		{
			ship.move("DOWN");
		}
		if(keys[4] == true)
		{
			shots.add(new Ammo(ship.getX()+ship.getWidth()/2-5,ship.getY(),4));

		}

		boss.draw(graphToBack);
		
		for(int i = 0; i < shots.getList().size(); i += 15)
		{
			if(shots.getList().get(i).getX() <= boss.getX() + 80 && shots.getList().get(i).getX() >= boss.getX() - 10 && shots.getList().get(i).getY() <= boss.getY() + 80 && shots.getList().get(i).getY() >= boss.getY() -10)
			{
				shots.getList().get(i).setPos(800,0);
			}
		}
		
		if(ship.getX() > boss.getX() - 80 && ship.getX() < boss.getX() + 80 && ship.getY() > boss.getY() - 80 && ship.getY() < boss.getY() + 80)
		{
			ship.setSpeed(0);
			ship.setPos(800, 0);
		}
		
		if(ship.getX() == 800 && ship.getY() == 0)
		{
			System.out.println("You lose.");
			System.exit(0);
		}
		
		for (int i = 0; i < shots.getAmmo().size(); i++)
			for (int j = 0; j < horde.getAliens().size(); j++)
				if (shots.getAmmo().get(i).Collide(horde.getAliens().get(j))) {
					shots.getAmmo().remove(i--);
					horde.getAliens().remove(j--);
					
				}
		
		// check collision between ship and alienhorde
		for (int i = 0; i < horde.getAliens().size(); i++)
			if (ship.Collide(horde.getAliens().get(i))) {
				System.out.println("You lose.");
				System.exit(0);
			}
		
		horde.moveEmAll();
		shots.moveEmAll();
		shots.cleanEmUp();
		shots.timeiskey();
		
		//add code to move Ship, Alien, etc.
		
		horde.removeDeadOnes(shots.getList());
		if(horde.getSize() == 0)
		{
			System.out.println("You win.");
			System.exit(0);
		}
		//add in collision detection to see if Bullets hit the Aliens and if Bullets hit the Ship

		
		twoDGraph.drawImage(back, null, 0, 0);
	}


	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = true;
		} 
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = true;
		}
		repaint();
	}

	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = false;
		}
		repaint();
	}

	public void keyTyped(KeyEvent e)
	{
      //no code needed here
	}

   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(5);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
}