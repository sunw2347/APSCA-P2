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
	private Alien alienOne;
	private Alien alienTwo;
	
	 //uncomment once you are ready for this part
	 
	private AlienHorde aliens;
	private Bullets shots;
	

	private boolean[] keys;
	private BufferedImage back;

	public OuterSpace()
	{
		setBackground(Color.black);

		keys = new boolean[5];

		//instantiate other stuff
		ship = new Ship(360,500,5);

		this.addKeyListener(this);
		new Thread(this).start();

		setVisible(true);
		alienOne = new Alien(50,50,2);
		alienTwo = new Alien(150,50,2);
		Alien alienThree = new Alien(250,50,2);
		Alien alienFour = new Alien(350,50,2);
		Alien alienFive = new Alien(450,50,2);
		Alien alienSix = new Alien(550,50,2);
		Alien alienSeven = new Alien(650,50,2);
		Alien alienEight = new Alien(750,50,2);
		aliens = new AlienHorde(0);
		aliens.add(alienOne);
		aliens.add(alienTwo);
		aliens.add(alienThree);
		aliens.add(alienFour);
		aliens.add(alienFive);
		aliens.add(alienSix);
		aliens.add(alienSeven);
		aliens.add(alienEight);
		aliens.add(new Alien(50,150,2));
		aliens.add(new Alien(150,150,2));
		aliens.add(new Alien(250,150,2));
		aliens.add(new Alien(350,150,2));
		aliens.add(new Alien(450,150,2));
		aliens.add(new Alien(550,150,2));
		aliens.add(new Alien(650,150,2));
		aliens.add(new Alien(750,150,2));
		shots = new Bullets();
		int x = (int)(Math.random() * 760);
		int y = (int)(Math.random() * 150) + 250;
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
		

		if(keys[0] == true)
		{
			ship.move("LEFT");
		}
		else if(keys[1] == true)
		{
			ship.move("RIGHT");
		}
		else if(keys[2] == true)
		{
			ship.move("UP");
		}
		else if(keys[3] == true)
		{
			ship.move("DOWN");
		}
		else if(keys[4])
		{
			Ammo amm = new Ammo(ship.getX() + 35,ship.getY(),5);
			shots.add(amm);
		}

		for(int i = 0; i < shots.getList().size(); i += 15)
		{
			shots.getList().get(i).draw(graphToBack);
			shots.getList().get(i).move("UP");
		}
		
		//add code to move stuff

		ship.draw(graphToBack);
		aliens.drawEmAll(graphToBack);
		aliens.moveEmAll();
		//add in collision detection
		aliens.removeDeadOnes(shots.getList());
		
		
		if(ship.getX() == 800 && ship.getY() == 0)
		{
			Color temp = graphToBack.getColor();
			graphToBack.setColor(Color.RED);
			graphToBack.drawString("You died", 350, 500);
			graphToBack.setColor(temp);
		}
		
		if(aliens.getList().size() == 0)
		{
			Color temp = graphToBack.getColor();
			graphToBack.setColor(Color.RED);
			graphToBack.drawString("You win", 350, 500);
			graphToBack.setColor(temp);
		}
		
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
