import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class BlockLayer {
private int space;
private int horistart;
private int horiend;
private int vertistart;
private int vertiend;
private ArrayList<Block> blocks = new ArrayList<Block>(0);
public BlockLayer(int s)
{
	space = s;
	horistart = 20;
	horiend = 750;
	vertistart = 70;
	vertiend = 500;
}
public void buildblocks(int r, int s, Block bl)
{
	if(blocks.size() == 0)
	{
		horistart = 20;
		horiend = 750;
		vertistart = 70;
		vertiend = 500;
	}
	space =s;
	for(int h=0;h<r;h++)
	{
	for(int i = horistart;i<horiend;i=i+space)
	{
		bl = new Block();
		bl.setWidth(40);
		bl.setHeight(20);
		bl.setPos(i, vertistart-20);
		blocks.add(bl); 	
		i+=bl.getWidth();
	}
	for(int i = horistart;i<horiend;i=i+space)
	{
		bl = new Block();
		bl.setWidth(40);
		bl.setHeight(20);
		bl.setPos(i, vertiend+30);
		blocks.add(bl); 	
		i+=bl.getWidth();
	}
	for(int p=vertistart;p<vertiend;p=p+space)
	{
		bl = new Block();
		bl.setWidth(20);
		bl.setHeight(40);
		bl.setPos(horistart, p);
		blocks.add(bl); 	
		p+=bl.getHeight();
	}
	for(int p=vertistart;p<vertiend;p=p+space)
	{
		bl = new Block();
		bl.setWidth(20);
		bl.setHeight(40);
		bl.setPos(horiend, p);
		blocks.add(bl); 	
		p+=bl.getHeight();
	}
	horistart +=30;
	horiend -=40;
	vertistart +=30;
	vertiend -=30;
}
}
public int big()
{
	return blocks.size();
}
public Block getsomething(int i)
{
	return blocks.get(i);
}
public void removal(int i)
{
	blocks.remove(i);
}
public void draw(Graphics window, Color col)
{
	for(int k=0;k<blocks.size();k++)
	{
		blocks.get(k).draw(window,col);
	}
}
}
