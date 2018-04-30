import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;


public class Bonus extends MovingThing{
	private int speed;
	private int time =0;
	private Image image;
	public Bonus()
	{
		this(0,0,30,30,0);
	}

	public Bonus(int x, int y)
	{
		super(x,y);
	}

	public Bonus(int x, int y, int s)
	{
		super(x,y);
		speed =s;
	}

	public Bonus(int x, int y, int w, int h, int s)
	{
		super(x, y, w,h);
		speed=s;
		try
		{
			image = ImageIO.read(new File("star.jpg"));
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Error");
		}
	}
	
	

	

   public void move(String direction)
	{
	   if(direction.equals("UP"))
	   {
		   setY(getY()-getSpeed());
	   }
	   if(direction.equals("DOWN"))
	   {
		   setY(getY()+getSpeed());
	   }
	   if(direction.equals("LEFT"))
	   {
		   setX(getX()-getSpeed());
	   }
	   if(direction.equals("RIGHT"))
	   {
		   setX(getX()+getSpeed());
	   }
	}

	public void draw( Graphics window )
	{
   	window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
	}
	

	public String toString()
	{
		return super.toString() + getSpeed();
	}
	
	public void setSpeed(int s) {
		speed = s;		
	}


	public int getSpeed() {
		return speed;
	}
		
	public void moveBonus()
	{
		time++;
		
			if (time <= 200) {
				this.move("LEFT");
			} else if (time <= 220) {
				this.move("DOWN");
			} else if (time <= 420) {
				this.move("RIGHT");
			} 
			 else if (time <= 440) {
					this.move("DOWN");
					time=0;

			 
		}
	}
	public void setVisible(boolean b) {
		if(b == false)
		{
			setHeight(1);
			setWidth(1);
		}
		
	}

}