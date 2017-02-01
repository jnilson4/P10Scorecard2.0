package score.view;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import java.awt.Dimension;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import score.controller.ScoreController;

public class ScoreFrame extends JFrame
{
	private ScoreController baseController;
	private InstructionPanel appPanel;
	
	public ScoreFrame(ScoreController baseController)
	{
		super();
		this.baseController = baseController;
		this.appPanel = new InstructionPanel(baseController);
		
		this.setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("Phase 10 Scorecard v. 2.0");
		this.setSize(new Dimension(700,400));
		this.setVisible(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	
}