package score.view;

import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import score.controller.ScoreController;
import java.awt.Font;
import java.awt.event.*;
import java.awt.Container;

public class SetupPanel extends JPanel
{
	private SpringLayout baseLayout;
	private ScoreController baseController;
	
	private ImageIcon backgroundImage;
	private JLabel imageText;
	
	private JLabel player1Label;
	private JLabel player2Label;
	private JLabel player3Label;
	private JLabel player4Label;
	private JLabel player5Label;
	private JLabel player6Label;
	private JLabel player7Label;
	private JLabel player8Label;
	
	private JTextField player1Box;
	private JTextField player2Box;
	private JTextField player3Box;
	private JTextField player4Box;
	private JTextField player5Box;
	private JTextField player6Box;
	private JTextField player7Box;
	private JTextField player8Box;
	
	private JButton nextButton;
	private JButton submitNames;
	private ImageIcon helpButton;
	private JLabel imageText1;
	
	public SetupPanel(ScoreController baseController)
	{
		super();
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		
		this.backgroundImage = new ImageIcon(getClass().getResource("/score/view/images/p10bg.jpg"));
		this.imageText = new JLabel(" ", backgroundImage, JLabel.CENTER);
		imageText.setForeground(Color.WHITE);
		
		this.player1Label = new JLabel("Player 1");
		this.player2Label = new JLabel("Player 2");
		baseLayout.putConstraint(SpringLayout.SOUTH, player1Label, -44, SpringLayout.NORTH, player2Label);
		baseLayout.putConstraint(SpringLayout.WEST, player2Label, 50, SpringLayout.WEST, this);
		this.player3Label = new JLabel("Player 3");
		baseLayout.putConstraint(SpringLayout.NORTH, player3Label, 232, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, player3Label, 50, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, player2Label, -54, SpringLayout.NORTH, player3Label);
		this.player4Label = new JLabel("Player 4");
		baseLayout.putConstraint(SpringLayout.WEST, player4Label, 50, SpringLayout.WEST, this);
		this.player5Label = new JLabel("Player 5");
		this.player6Label = new JLabel("Player 6");
		this.player7Label = new JLabel("Player 7");
		this.player8Label = new JLabel("Player 8");
		
		
		this.player1Box = new JTextField(4);
		baseLayout.putConstraint(SpringLayout.NORTH, player5Label, 5, SpringLayout.NORTH, player1Box);
		this.player2Box = new JTextField(4);
		baseLayout.putConstraint(SpringLayout.WEST, player6Label, 177, SpringLayout.EAST, player2Box);
		baseLayout.putConstraint(SpringLayout.WEST, player2Box, 104, SpringLayout.EAST, player2Label);
		baseLayout.putConstraint(SpringLayout.WEST, player1Box, 0, SpringLayout.WEST, player2Box);
		baseLayout.putConstraint(SpringLayout.SOUTH, player1Box, -34, SpringLayout.NORTH, player2Box);
		this.player3Box = new JTextField(4);
		baseLayout.putConstraint(SpringLayout.WEST, player3Box, 104, SpringLayout.EAST, player3Label);
		this.player4Box = new JTextField(4);
		baseLayout.putConstraint(SpringLayout.NORTH, player8Label, 5, SpringLayout.NORTH, player4Box);
		baseLayout.putConstraint(SpringLayout.NORTH, player4Label, 5, SpringLayout.NORTH, player4Box);
		baseLayout.putConstraint(SpringLayout.WEST, player8Label, 177, SpringLayout.EAST, player4Box);
		baseLayout.putConstraint(SpringLayout.NORTH, player4Box, 42, SpringLayout.SOUTH, player3Box);
		baseLayout.putConstraint(SpringLayout.WEST, player4Box, 0, SpringLayout.WEST, player1Box);
		this.player5Box = new JTextField(4);
		baseLayout.putConstraint(SpringLayout.NORTH, player5Box, 0, SpringLayout.NORTH, player1Box);
		this.player6Box = new JTextField(4);
		baseLayout.putConstraint(SpringLayout.WEST, player6Box, 586, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, player6Box, -56, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.EAST, player6Label, -99, SpringLayout.WEST, player6Box);
		this.player7Box = new JTextField(4);
		baseLayout.putConstraint(SpringLayout.WEST, player7Box, 586, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, player7Box, -56, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.EAST, player7Label, -99, SpringLayout.WEST, player7Box);
		this.player8Box = new JTextField(4);
		baseLayout.putConstraint(SpringLayout.NORTH, player8Box, 0, SpringLayout.NORTH, player4Box);
		baseLayout.putConstraint(SpringLayout.EAST, player8Label, -99, SpringLayout.WEST, player8Box);
		baseLayout.putConstraint(SpringLayout.WEST, player8Box, 586, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, player8Box, -56, SpringLayout.EAST, this);
		
		this.nextButton = new JButton("Continue to Scorecard");
		baseLayout.putConstraint(SpringLayout.NORTH, nextButton, 40, SpringLayout.SOUTH, player8Box);
		baseLayout.putConstraint(SpringLayout.EAST, nextButton, -10, SpringLayout.EAST, this);
		this.submitNames = new JButton("Submit Names");
		baseLayout.putConstraint(SpringLayout.NORTH, submitNames, 0, SpringLayout.NORTH, nextButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, submitNames, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, submitNames, -90, SpringLayout.WEST, nextButton);
	
		this.helpButton = new ImageIcon(getClass().getResource("/score/view/images/questionMark.jpg"));
		this.imageText1 = new JLabel(" ", helpButton, JLabel.CENTER);
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setPreferredSize(new Dimension(700,400));
		this.setBackground(Color.RED);
				
		this.add(player1Label);
		this.add(player2Label);
		this.add(player3Label);
		this.add(player4Label);
		this.add(player5Label);
		this.add(player6Label);
		this.add(player7Label);
		this.add(player8Label);

		this.add(player1Box);
		this.add(player2Box);
		this.add(player3Box);
		this.add(player4Box);
		this.add(player5Box);
		this.add(player6Box);
		this.add(player7Box);
		this.add(player8Box);
		
		this.add(nextButton);
		this.add(submitNames);
		
		this.add(imageText);

	}
	
	private void setupLayout()
	{
		player1Label.setForeground(Color.WHITE);
		baseLayout.putConstraint(SpringLayout.WEST, player1Label, 50, SpringLayout.WEST, this);
		player2Label.setForeground(Color.WHITE);
		player3Label.setForeground(Color.WHITE);
		player4Label.setForeground(Color.WHITE);
		player5Label.setForeground(Color.WHITE);
		player6Label.setForeground(Color.WHITE);
		player7Label.setForeground(Color.WHITE);
		player8Label.setForeground(Color.WHITE);
		baseLayout.putConstraint(SpringLayout.EAST, player5Label, -213, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, player6Label, 0, SpringLayout.NORTH, player2Label);
		baseLayout.putConstraint(SpringLayout.NORTH, player7Label, 0, SpringLayout.NORTH, player3Label);
		baseLayout.putConstraint(SpringLayout.NORTH, player2Box, -5, SpringLayout.NORTH, player2Label);
		baseLayout.putConstraint(SpringLayout.NORTH, player3Box, -5, SpringLayout.NORTH, player3Label);
		baseLayout.putConstraint(SpringLayout.WEST, player5Box, 99, SpringLayout.EAST, player5Label);
		baseLayout.putConstraint(SpringLayout.EAST, player5Box, -56, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, player6Box, -5, SpringLayout.NORTH, player2Label);
		baseLayout.putConstraint(SpringLayout.NORTH, player7Box, -5, SpringLayout.NORTH, player3Label);
	}
	
	private void setupListeners()
	{
		
	}
}
