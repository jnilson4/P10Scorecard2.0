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
//		for(int i = 0; i < player.length; i++)
//		{
//			if(player[i].equals(""))
//			{
//				
//			}
//		}
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
}
