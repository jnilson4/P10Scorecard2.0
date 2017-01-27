package score.view;

import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import score.controller.ScoreController;
import java.awt.Font;
import java.awt.event.*;
import java.awt.Image;

public class InstructionPanel extends JPanel
{
	private SpringLayout baseLayout;
	private ScoreController baseController;
	private ImageIcon backgroundImage;
	private JLabel imageText;
	
	public InstructionPanel(ScoreController baseController)
	{
		super();
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		this.backgroundImage = new ImageIcon(getClass().getResource("/score/view/images/p10bg.jpg"));
		this.imageText = new JLabel(" ", backgroundImage, JLabel.CENTER);
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setPreferredSize(new Dimension(700,400));
		this.setBackground(Color.RED);
		
		this.add(imageText);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
}