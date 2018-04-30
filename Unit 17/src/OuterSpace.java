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
	private int hordesize = 0;
   	private AlienHorde horde;
	private Bullets shots;
	private Bonus star;
	private Bullets shots2;
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
		shots2 = new Bullets();
		keys = new boolean[5];
		star = new Bonus(400+80*4,40*3, 40,40,2);
		for (int i = 0; i <5; i++) {
			for (int j = 0; j < 4; j++) {
				if(i ==4 && j==3)
				{
					
				}
				else
				{
				horde.add(new Alien(400+80*i,40*j, 40,40,2));
				hordesize++;
				}
			}
		}
		this.addKeyListener(this);
		new Thread(this).start();
		
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
		public int life = 1;
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
		shots2.drawEmAll(twoDGraph);
		guac.draw(graphToBack);
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
		for (int i = 0; i < shots.getAmmo().size(); i++)
		{
			if(shots.getAmmo().get(i).Collide(star))
			{
				star.setVisible(false);
				life++;
				
			}
			for (int j = 0; j < horde.getAliens().size(); j++) {
				if (shots.getAmmo().get(i).Collide(horde.getAliens().get(j))) {
					shots.getAmmo().remove(i--);
					horde.getAliens().remove(j--);
				
				}
		}
		}
				for (int i = 0; i < shots2.getAmmo().size(); i++)
		{
			
			for (int j = 0; j < horde.getAliens().size(); j++) {
				if (shots2.getAmmo().get(i).Collide(horde.getAliens().get(j))) {
					shots2.getAmmo().remove(i--);
					horde.getAliens().remove(j--);
				
				}
		}
		}
		
		// check collision between ship and alienhorde
		for (int i = 0; i < horde.getAliens().size(); i++)
			if (ship.Collide(horde.getAliens().get(i))) {
				life--;
				if(life <= 0){
				System.out.println("You lose.");
				System.exit(0);
				}
			}
		
		horde.moveEmAll();
		star.moveBonus();
		shots.moveEmAll();
		shots.cleanEmUp();
		shots.timeiskey();
		shots2.moveEmAll();
		shots2.cleanEmUp();
		shots2.timeiskey();
		
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