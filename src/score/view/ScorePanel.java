package score.view;

import javax.swing.JPanel;
import score.controller.ScoreController;
import javax.swing.SpringLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.*;

public class ScorePanel extends JPanel
{
	private SpringLayout baseLayout;
	private ScoreController baseController;
	
	public ScorePanel(ScoreController baseController)
	{
		super();
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
}
