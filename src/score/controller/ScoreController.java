package score.controller;

import score.view.*;
import score.model.*;
import javax.swing.JOptionPane;

public class ScoreController
{
	private ScoreFrame baseFrame;
	private Game update;
	private ScoreViewer scoreView;
	
	public ScoreController()
	{
		update = new Game();
		baseFrame = new ScoreFrame(this);
		scoreView = new ScoreViewer();
	}
	
	public void start()
	{
		System.out.println("Program Started");
	}
	
	public ScoreFrame getFrame()
	{
		return baseFrame;
	}
	
	//startAbstraction
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
	//endAbstraction
	
	public void giveNames(String[] names)
	{
		for(int i = 0; i < names.length; i++)
		{
			update.getPlayer()[i].setName(names[i]);
		}
	}
	
	//startComplexity
	public void givePoints(int[] points)
	{
		for(int i = 0; i < points.length; i++)
		{
			update.getPlayer()[i].setPoints(update.getPlayer()[i].getPoints() + points[i]);
		}
	}
	//endComplexity
	
	public void givePhases(boolean [] phase)
	{
		for(int i = 0; i < phase.length; i++)
		{
			if(phase[i])
			{
				update.getPlayer()[i].setPhase(update.getPlayer()[i].getPhase()+1);
			}
		}
	}
	
	public void giveTotalPoints(int [] totalPoints)
	{
		for(int i = 0; i < totalPoints.length; i++)
		{
			update.getPlayer()[i].setPoints(update.getPlayer()[i].getPoints());
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
	
	public int [] getPoints()
	{
		int [] points = new int [update.getPlayer().length];
		for(int i = 0; i < points.length; i++)
		{
			points[i] = update.getPlayer()[i].getPoints();
		}
		
		return points;
	}
	
	public int [] getPhase()
	{
		int [] phases = new int [update.getPlayer().length];
		for(int i = 0; i < phases.length; i++)
		{
			phases[i] = update.getPlayer()[i].getPhase();
		}
		
		return phases;
	}
	
	public boolean isValidInteger(String input)
	{
		boolean isValid = false;
		
		try
		{
			int successful = Integer.parseInt(input);
			isValid = true;
			
		}
		catch(NumberFormatException error)
		{
			scoreView.displayMessage("Please make sure the scores entered only contain numbers.");
		}
		
		return isValid;
	}
	
	public void handleErrors(Exception currentException)
	{
		scoreView.displayMessage("An error has occured. Details provided next.");
		scoreView.displayMessage(currentException.getMessage());
	}
	
	public ScoreViewer getPopup()
	{
		return scoreView;
	}
}
