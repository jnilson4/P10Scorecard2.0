package score.controller;

import score.view.ScoreFrame;

public class ScoreController
{
	private ScoreFrame baseFrame;
	
	public ScoreController()
	{
		baseFrame = new ScoreFrame(this);
	}
	
	public void start()
	{
		
	}
	
	public ScoreFrame getFrame()
	{
		return baseFrame;
	}
}
