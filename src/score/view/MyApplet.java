package score.view;

import java.awt.Graphics;

import javax.swing.JApplet;

import score.controller.ScoreController;

public class MyApplet extends JApplet
{
	private InstructionPanel loadPanel;
	private ScoreController scoreController;
	
	public void init()
	{
		scoreController = new ScoreController();
		loadPanel = new InstructionPanel(scoreController);
	}
	
	public void start() 
	{

	}
	
	
	public void paint(Graphics draw)
	{
//		draw.drawString("show me the money", 45, 543);
		
	}
}
