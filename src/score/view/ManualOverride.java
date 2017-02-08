package score.view;

import javax.swing.*;
import score.controller.ScoreController;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.*;

public class ManualOverride extends JPanel
{
	private ScoreController baseController;
	private SpringLayout baseLayout;
	
	private ImageIcon backgroundImage;
	private JLabel imageText;
	
	private JButton returnToScore, submitChanges;
	
	public ManualOverride(ScoreController baseController)
	{
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		
		this.backgroundImage = new ImageIcon(getClass().getResource("/score/view/images/p10bg.jpg"));
		this.imageText = new JLabel(" ", backgroundImage, JLabel.CENTER);
		
		this.returnToScore = new JButton("Return to Scorecard");
		this.submitChanges = new JButton("Submit Changes");
		
		setupPanel();
		setupGUI();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setPreferredSize(new Dimension(700,400));
		this.setBackground(Color.red);
		
		this.add(returnToScore);
		this.add(submitChanges);
		
		this.add(imageText);
	}
	
	private void setupGUI()
	{
		
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, returnToScore, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, returnToScore, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, submitChanges, 0, SpringLayout.NORTH, returnToScore);
		baseLayout.putConstraint(SpringLayout.EAST, submitChanges, -10, SpringLayout.EAST, this);
	}
	
	private void setupListeners()
	{
		returnToScore.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent clicked)
			{
				ScorePanel score = new ScorePanel(baseController);
				baseController.getFrame().getContentPane().removeAll();
				baseController.getFrame().setContentPane(score);
				baseController.getFrame().validate();
				repaint();
			}
		});
	}
}
