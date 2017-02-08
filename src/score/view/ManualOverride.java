package score.view;

import javax.swing.*;
import score.controller.ScoreController;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.*;

public class ManualOverride extends JPanel
{
	private ScoreController baseController;
	private SpringLayout baseLayout;
	
	private ImageIcon backgroundImage, helpButton;
	private JLabel imageText, imageText1;
	
	private JLabel player1, player2, player3, player4, player5, player6, player7, player8;
	private JTextField player1Points, player2Points, player3Points, player4Points, player5Points, player6Points, player7Points, player8Points;
	private JTextField player1Phase, player2Phase, player3Phase, player4Phase, player5Phase, player6Phase, player7Phase, player8Phase;
	
	private JButton returnToScore, submitChanges;
	
	public ManualOverride(ScoreController baseController)
	{
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		
		this.backgroundImage = new ImageIcon(getClass().getResource("/score/view/images/p10bg.jpg"));
		this.imageText = new JLabel(" ", backgroundImage, JLabel.CENTER);
		
		this.helpButton = new ImageIcon(getClass().getResource("/score/view/images/questionMark2.png"));
		this.imageText1 = new JLabel(" ", helpButton, JLabel.CENTER);
		
		this.returnToScore = new JButton("Return to Scorecard");
		this.submitChanges = new JButton("Submit Changes");
		
		String [] playerNames = baseController.getNames();
		this.player1 = new JLabel(playerNames[0]);
		baseLayout.putConstraint(SpringLayout.NORTH, player1, 109, SpringLayout.NORTH, this);
		player1.setForeground(Color.WHITE);
		this.player2 = new JLabel(playerNames[1]);
		baseLayout.putConstraint(SpringLayout.SOUTH, player1, -39, SpringLayout.NORTH, player2);
		baseLayout.putConstraint(SpringLayout.SOUTH, player2, 185, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, player2, 0, SpringLayout.EAST, player1);
		player2.setForeground(Color.WHITE);
		this.player3 = new JLabel(playerNames[2]);
		baseLayout.putConstraint(SpringLayout.NORTH, player3, 50, SpringLayout.SOUTH, player2);
		baseLayout.putConstraint(SpringLayout.EAST, player3, 0, SpringLayout.EAST, player1);
		player3.setForeground(Color.WHITE);
		this.player4 = new JLabel(playerNames[3]);
		baseLayout.putConstraint(SpringLayout.EAST, player4, 0, SpringLayout.EAST, player1);
		baseLayout.putConstraint(SpringLayout.SOUTH, player3, -54, SpringLayout.NORTH, player4);
		player4.setForeground(Color.WHITE);
		this.player5 = new JLabel(playerNames[4]);
		baseLayout.putConstraint(SpringLayout.NORTH, player5, 109, SpringLayout.NORTH, this);
		player5.setForeground(Color.WHITE);
		this.player6 = new JLabel(playerNames[5]);
		baseLayout.putConstraint(SpringLayout.NORTH, player6, 169, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, player6, 0, SpringLayout.EAST, player5);
		baseLayout.putConstraint(SpringLayout.SOUTH, player5, -44, SpringLayout.NORTH, player6);
		player6.setForeground(Color.WHITE);
		this.player7 = new JLabel(playerNames[6]);
		baseLayout.putConstraint(SpringLayout.NORTH, player7, 235, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, player7, 0, SpringLayout.EAST, player5);
		baseLayout.putConstraint(SpringLayout.SOUTH, player6, -50, SpringLayout.NORTH, player7);
		player7.setForeground(Color.WHITE);
		this.player8 = new JLabel(playerNames[7]);
		baseLayout.putConstraint(SpringLayout.EAST, player8, 0, SpringLayout.EAST, player5);
		baseLayout.putConstraint(SpringLayout.SOUTH, player7, -54, SpringLayout.NORTH, player8);
		baseLayout.putConstraint(SpringLayout.NORTH, player8, 305, SpringLayout.NORTH, this);
		player8.setForeground(Color.WHITE);
		
		this.player1Points = new JTextField(4);
		baseLayout.putConstraint(SpringLayout.NORTH, player1Points, 109, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, player1Points, 171, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, player1, -28, SpringLayout.WEST, player1Points);
		this.player2Points = new JTextField(4);
		baseLayout.putConstraint(SpringLayout.NORTH, player2Points, 29, SpringLayout.SOUTH, player1Points);
		baseLayout.putConstraint(SpringLayout.WEST, player2Points, 0, SpringLayout.WEST, player1Points);
		this.player3Points = new JTextField(4);
		baseLayout.putConstraint(SpringLayout.NORTH, player3Points, 40, SpringLayout.SOUTH, player2Points);
		baseLayout.putConstraint(SpringLayout.WEST, player3Points, 0, SpringLayout.WEST, player1Points);
		this.player4Points = new JTextField(4);
		baseLayout.putConstraint(SpringLayout.WEST, player4Points, 0, SpringLayout.WEST, player1Points);
		baseLayout.putConstraint(SpringLayout.SOUTH, player4Points, -35, SpringLayout.NORTH, returnToScore);
		this.player5Points = new JTextField(4);
		baseLayout.putConstraint(SpringLayout.NORTH, player5Points, 104, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, player5Points, 37, SpringLayout.EAST, player5);
		this.player6Points = new JTextField(4);
		baseLayout.putConstraint(SpringLayout.NORTH, player6Points, 34, SpringLayout.SOUTH, player5Points);
		baseLayout.putConstraint(SpringLayout.WEST, player6Points, 0, SpringLayout.WEST, player5Points);
		this.player7Points = new JTextField(4);
		baseLayout.putConstraint(SpringLayout.NORTH, player7Points, 40, SpringLayout.SOUTH, player6Points);
		baseLayout.putConstraint(SpringLayout.WEST, player7Points, 0, SpringLayout.WEST, player5Points);
		this.player8Points = new JTextField(4);
		baseLayout.putConstraint(SpringLayout.NORTH, player8Points, 44, SpringLayout.SOUTH, player7Points);
		baseLayout.putConstraint(SpringLayout.WEST, player8Points, 0, SpringLayout.WEST, player5Points);
		
		this.player1Phase = new JTextField(4);
		baseLayout.putConstraint(SpringLayout.NORTH, player1Phase, 109, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, player1Phase, -62, SpringLayout.WEST, player5);
		baseLayout.putConstraint(SpringLayout.EAST, player1Points, -45, SpringLayout.WEST, player1Phase);
		this.player2Phase = new JTextField(4);
		baseLayout.putConstraint(SpringLayout.NORTH, player2Phase, 29, SpringLayout.SOUTH, player1Phase);
		baseLayout.putConstraint(SpringLayout.WEST, player2Phase, 0, SpringLayout.WEST, player1Phase);
		this.player3Phase = new JTextField(4);
		baseLayout.putConstraint(SpringLayout.NORTH, player3Phase, 40, SpringLayout.SOUTH, player2Phase);
		baseLayout.putConstraint(SpringLayout.WEST, player3Phase, 0, SpringLayout.WEST, player1Phase);
		this.player4Phase = new JTextField(4);
		baseLayout.putConstraint(SpringLayout.NORTH, player4Phase, 44, SpringLayout.SOUTH, player3Phase);
		baseLayout.putConstraint(SpringLayout.WEST, player4Phase, 0, SpringLayout.WEST, player1Phase);
		this.player5Phase = new JTextField(4);
		baseLayout.putConstraint(SpringLayout.NORTH, player5Phase, 74, SpringLayout.SOUTH, imageText1);
		this.player6Phase = new JTextField(4);
		baseLayout.putConstraint(SpringLayout.NORTH, player6Phase, 34, SpringLayout.SOUTH, player5Phase);
		baseLayout.putConstraint(SpringLayout.WEST, player6Phase, 0, SpringLayout.WEST, player5Phase);
		this.player7Phase = new JTextField(4);
		baseLayout.putConstraint(SpringLayout.NORTH, player7Phase, 40, SpringLayout.SOUTH, player6Phase);
		baseLayout.putConstraint(SpringLayout.WEST, player7Phase, 0, SpringLayout.WEST, player5Phase);
		this.player8Phase = new JTextField(4);
		baseLayout.putConstraint(SpringLayout.NORTH, player8Phase, 44, SpringLayout.SOUTH, player7Phase);
		baseLayout.putConstraint(SpringLayout.WEST, player8Phase, 0, SpringLayout.WEST, player5Phase);
		
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
		
		this.add(player1);
		this.add(player2);
		this.add(player3);
		this.add(player4);
		this.add(player5);
		this.add(player6);
		this.add(player7);
		this.add(player8);
		
		this.add(player1Points);
		this.add(player2Points);
		this.add(player3Points);
		this.add(player4Points);
		this.add(player5Points);
		this.add(player6Points);
		this.add(player7Points);
		this.add(player8Points);
		
		this.add(player1Phase);
		this.add(player2Phase);
		this.add(player3Phase);
		this.add(player4Phase);
		this.add(player5Phase);
		this.add(player6Phase);
		this.add(player7Phase);
		this.add(player8Phase);
		
		this.add(imageText1);
		
//		this.add(imageText);
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
		baseLayout.putConstraint(SpringLayout.NORTH, imageText1, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, imageText1, -10, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, player2, 169, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, player4, -40, SpringLayout.NORTH, returnToScore);
		baseLayout.putConstraint(SpringLayout.EAST, player5, -233, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.EAST, player5Phase, -35, SpringLayout.EAST, this);
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
		
		submitChanges.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent clicked)
			{
				//Phases
				int [] points = new int [8];
				
				points[0] = Integer.parseInt(player1Points.getText());
				points[1] = Integer.parseInt(player2Points.getText());
				points[2] = Integer.parseInt(player3Points.getText());
				points[3] = Integer.parseInt(player4Points.getText());
				points[4] = Integer.parseInt(player5Points.getText());
				points[5] = Integer.parseInt(player6Points.getText());
				points[6] = Integer.parseInt(player7Points.getText());
				points[7] = Integer.parseInt(player8Points.getText());
				
				baseController.giveTotalPoints(points);
				
				for(Component temp : getComponents())
				{
					if(temp instanceof JTextField)
					{
						if(((JTextField) temp).getText() != "")
						{
							((JTextField) temp).setText("");
						}
					}
				}
			}
		});
		
		imageText1.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent clicked)
			{
				InstructionPanel help = new InstructionPanel(baseController);
				baseController.getFrame().getContentPane().removeAll();
				baseController.getFrame().setContentPane(help);
				baseController.getFrame().validate();
				repaint();
			}
		});
	}
}
