import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;


public class BossRound
{

	private int xPos;
	private int yPos;
	private Image image;
	

	public BossRound(int x, int y)
	{
		xPos = x;
		yPos = y;
		try
		{
			image = ImageIO.read(new File("C:\\Users\\sunw2347\\Desktop\\APSCA-P2\\Unit 17\\src\\boss.jpg"));
		}
		catch(Exception e)
		{
			//feel free to do something here
			System.out.println("Error");
		}
	}
	

	public int getX()
	{
		return xPos;
	}

	public int getY()
	{
		return yPos;
	}
	

	public void setX(int x)
	{
		xPos = x;
	}
	

	public void setY(int y)
	{
		yPos = y;
	}
	

	public void draw(Graphics window)
	{
		window.drawImage(image, getX(), getY(), 80, 80, null);
	}
}


