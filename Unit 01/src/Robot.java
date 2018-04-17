//?A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;
//Unit 01
class Robot extends Canvas
{
   public Robot()    //constructor method - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);   	
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString("Robot LAB ", 35, 35 );

      head(window);
      
      upperBody(window);
      
      lowerBody(window);//call head method
      
      //call other methods
      
   }

   public void head( Graphics window )
   {
      window.setColor(Color.YELLOW);

      window.fillOval(300, 100, 200, 100);
      
      window.setColor(Color.GREEN);
      
      window.fillOval(200, 200, 20, 20);
      
      window.fillOval(400, 200, 20, 20);
      
      window.setColor(Color.black);
      
      window.fillOval(300, 100, 20, 10);
      
      window.setColor(Color.red);
      
      window.fillArc(300, 300, 100, 30, 90, 180);


		//add more code here
				
   }

   public void upperBody( Graphics window )
   {

		window.setColor(Color.BLUE);//add more code here
		window.fillRect(300, 500, 150, 100);
		window.setColor(Color.BLACK);
		window.drawLine(225, 450, 125, 400);
		window.drawLine(375, 450, 375, 400);
   }

   public void lowerBody( Graphics window )
   {

		window.setColor(Color.GRAY);
		window.fillRect(300, 700, 150, 100);
		window.setColor(Color.BLACK);
		window.drawLine(225, 650, 125, 600);
		window.drawLine(375, 650, 375, 600);//add more code here

   }
   
}