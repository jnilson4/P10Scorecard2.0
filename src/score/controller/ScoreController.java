package score.controller;

import score.view.ScoreFrame;
import score.model.*;

public class ScoreController
{
	private ScoreFrame baseFrame;
	private Game update;
	
	public ScoreController()
	{
		update = new Game();
		baseFrame = new ScoreFrame(this);
	}
	
	public void start()
	{
		
	}
	
	public ScoreFrame getFrame()
	{
		return baseFrame;
	}
	
	public void update(String[] names, int[] points, int[] phase)
	{	
		for(int i = 0; i < names.length; i++)
		{
			if(names[i] == null || names[i].equals(""))
			{
				names[i] = "--"; 
			}
		}
	}
	
	public void giveNames(String[] names)
	{
		for(int i = 0; i < names.length; i++)
		{
			update.getPlayer()[i].setName(names[i]);
		}
	}
	
	public void givePoints(int[] points)
	{
		for(int i = 0; i < points.length; i++)
		{
			update.getPlayer()[i].setPoints(points[i]);
		}
	}
	
	public void givePhases(int[] phase)
	{
		for(int i = 0; i < phase.length; i++)
		{
			update.getPlayer()[i].setPhase(phase[i]);
		}
	}
	
	public String [] getNames()
	{
		String [] names = new String [update.getPlayer().length];
		for(int i = 0; i < names.length; i++)
		{
			names[i] = update.getPlayer()[i].getName();
		}
		
		return names;
	}
	
	public void addPoints(int [] points)
	{
		int currentPoints = 0;
		for(int i = 0; i < points.length; i++)
		{
			points[i] = currentPoints + points[i];
		}
	}
	
	public void addPhase()
	{
		
	}
}
