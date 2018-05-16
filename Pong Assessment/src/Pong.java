//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;

public class Pong extends Canvas implements KeyListener, Runnable
{
	private int score;
	private Ball ball;
	private BlockLayer Pads;
	private Block block;
	private Paddle Pad;
	private boolean[] keys;
	private BufferedImage back;
	private boolean truth = true;

	public Pong()
	{
		//set up all variables related to the game
		score = 2;
		ball = new Ball();
		block = new Block();
		Pad = new Paddle(350, 244, 40, 40, Color.RED, 4);
		Pads = new BlockLayer(10);
		keys = new boolean[4];
		Pads.buildblocks(2, 10, block);
    	setBackground(Color.WHITE);
		setVisible(true);
		
		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
	}
	
   public void update(Graphics window){
	   paint(window);
   }

   public void paint(Graphics window)
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
		

		ball.moveAndDraw(graphToBack);
		
		Pad.draw(graphToBack);
		Pads.draw(graphToBack, Color.BLUE);
		graphToBack.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));

		graphToBack.setColor(Color.BLACK);
		/*
		graphToBack.drawString("left Score: "+ leftscore + 
				"                                       " + 
				"right Score: "+ rightscore, 50, 50);
		*/
		//see if ball hits left wall or right wall
		if(!(ball.getX()>=10 && ball.getX()<=780))
		{
			ball.setXSpeed(-ball.getXSpeed());
		}
		/*
		if(!(ball.getX()>=10 && ball.getX()<=780))
		{
			ball.setXSpeed(0);
			ball.setYSpeed(0);
			if(ball.getX()<=10)
			{
				rightscore++;
			}
			else if(ball.getX()>=780)
				leftscore++;
			ball.setXSpeed(0);
			ball.setYSpeed(0);
			ball.draw(graphToBack, Color.WHITE);
			ball.setPos(380, 265);
			ball.setColor(Color.WHITE);
			
			
			Pad.draw(graphToBack, Color.WHITE);
			Pad.setColor(Color.WHITE);
			
			ball = new Ball();
	
			Pad = new Paddle(750, 244, 40, 40, Color.GREEN, 4);

		}
*/
		
		//see if the ball hits the top or bottom wall 
		if(!(ball.getY()>=50 && ball.getY()<=540))
		{
			ball.setYSpeed(-ball.getYSpeed());
		}


		//see if the ball hits the left paddle
		if(ball.didCollideLeft(Pad)|| ball.didCollideRight(Pad))
		{			ball.setXSpeed(-ball.getXSpeed());
		}
		if(ball.didCollideTop(Pad)|| ball.didCollideBottom(Pad))
		{
			ball.setYSpeed(-ball.getYSpeed());
		}
		//see if it hits bottom
		for(int u=0;u<Pads.big();u++)
		{
			if(ball.didCollideLeft(Pads.getsomething(u))|| ball.didCollideRight(Pads.getsomething(u)))
			{			ball.setXSpeed(-ball.getXSpeed());
			Pads.removal(u);
			}
			if(ball.didCollideTop(Pads.getsomething(u))|| ball.didCollideBottom(Pads.getsomething(u)))
			{
				ball.setYSpeed(-ball.getYSpeed());
				Pads.removal(u);
			}
		}
		if(Pads.big() == 0 && truth)
		{
			System.out.println("ROUND 1 COMPLETE!");
			System.out.println("BLINKYBALL BONUS ROUND!");
			ball= new BlinkyBall(350,200);
			Pads.buildblocks(3, 10, block);
			truth = false;
			score = 1;
		}
		
		if(score == 1 && Pads.big() == 0){
			score = 0;
		}
		if(score == 0){
			System.out.println("YOU WIN!");
			try {
				TimeUnit.SECONDS.sleep(3);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.exit(0);
		}
		//see if the paddles need to be moved


		if(keys[0] == true) {
			Pad.moveUpAndDraw(graphToBack);
		}
		if(keys[1] == true) {
			Pad.moveDownAndDraw(graphToBack);
		}
		
		if(keys[2] == true) {
			Pad.moveLeftAndDraw(graphToBack);
		}
		if(keys[3] == true) {
			Pad.moveRightAndDraw(graphToBack);
		}
		twoDGraph.drawImage(back, null, 0, 0);
		graphToBack.clearRect(0, 0, 800, 600);
	}

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'S' : keys[1]=true; break;
			case 'A' : keys[2]=true; break;
			case 'D' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'S' : keys[1]=false; break;
			case 'A' : keys[2]=false; break;
			case 'D' : keys[3]=false; break;
		}
	}

	public void keyTyped(KeyEvent e){}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread();
		Thread.sleep(8);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}	
}