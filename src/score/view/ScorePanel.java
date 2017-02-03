package score.view;

import javax.swing.*;
import score.controller.ScoreController;
import javax.swing.SpringLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.*;
import score.model.*;

public class ScorePanel extends JPanel
{
	private SpringLayout baseLayout;
	private ScoreController baseController;
	
	private ImageIcon backgroundImage;
	private JLabel imageText;
	
	private JButton setupButton;
	private JButton scoreRound;
	
	private JLabel player1;
	private JLabel player2;
	private JLabel player3;
	private JLabel player4;
	private JLabel player5;
	private JLabel player6;
	private JLabel player7;
	private JLabel player8;
	
	private JLabel player1Points;
	private JLabel player2Points;
	private JLabel player3Points;
	private JLabel player4Points;
	private JLabel player5Points;
	private JLabel player6Points;
	private JLabel player7Points;
	private JLabel player8Points;
	
	private JTextField player1Entry;
	private JTextField player2Entry;
	private JTextField player3Entry;
	private JTextField player4Entry;
	private JTextField player5Entry;
	private JTextField player6Entry;
	private JTextField player7Entry;
	private JTextField player8Entry;
	
	private JCheckBox player1Check;
	private JCheckBox player2Check;
	private JCheckBox player3Check;
	private JCheckBox player4Check;
	private JCheckBox player5Check;
	private JCheckBox player6Check;
	private JCheckBox player7Check;
	private JCheckBox player8Check;

	private String [] names;
	
	public ScorePanel(ScoreController baseController)
	{
		super();
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		
		this.backgroundImage = new ImageIcon(getClass().getResource("/score/view/images/p10bg.jpg"));
		this.imageText = new JLabel(" ", backgroundImage, JLabel.CENTER);
		
		this.setupButton = new JButton("Return to Setup");
		this.scoreRound = new JButton("Score Round");
		
		this.player1 = new JLabel("Player 1");
		player1.setForeground(Color.WHITE);
		baseLayout.putConstraint(SpringLayout.WEST, player1, 21, SpringLayout.WEST, this);
		this.player2 = new JLabel("Player 2");
		player2.setForeground(Color.WHITE);
		baseLayout.putConstraint(SpringLayout.NORTH, player2, 145, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, player1, -40, SpringLayout.NORTH, player2);
		baseLayout.putConstraint(SpringLayout.EAST, player2, 0, SpringLayout.EAST, player1);
		this.player3 = new JLabel("Player 3");
		player3.setForeground(Color.WHITE);
		baseLayout.putConstraint(SpringLayout.NORTH, player3, 47, SpringLayout.SOUTH, player2);
		baseLayout.putConstraint(SpringLayout.EAST, player3, 0, SpringLayout.EAST, player1);
		this.player4 = new JLabel("Player 4");
		player4.setForeground(Color.WHITE);
		baseLayout.putConstraint(SpringLayout.NORTH, player4, 49, SpringLayout.SOUTH, player3);
		baseLayout.putConstraint(SpringLayout.WEST, player4, 0, SpringLayout.WEST, player1);
		this.player5 = new JLabel("Player 5");
		player5.setForeground(Color.WHITE);
		baseLayout.putConstraint(SpringLayout.NORTH, player5, 0, SpringLayout.NORTH, player1);
		baseLayout.putConstraint(SpringLayout.WEST, player5, 281, SpringLayout.EAST, player1);
		this.player6 = new JLabel("Player 6");
		player6.setForeground(Color.WHITE);
		baseLayout.putConstraint(SpringLayout.NORTH, player6, 0, SpringLayout.NORTH, player2);
		baseLayout.putConstraint(SpringLayout.WEST, player6, 0, SpringLayout.WEST, player5);
		this.player7 = new JLabel("Player 7");
		player7.setForeground(Color.WHITE);
		baseLayout.putConstraint(SpringLayout.NORTH, player7, 0, SpringLayout.NORTH, player3);
		baseLayout.putConstraint(SpringLayout.WEST, player7, 0, SpringLayout.WEST, player5);
		this.player8 = new JLabel("Player 8");
		player8.setForeground(Color.WHITE);
		baseLayout.putConstraint(SpringLayout.NORTH, player8, 0, SpringLayout.NORTH, player4);
		baseLayout.putConstraint(SpringLayout.WEST, player8, 0, SpringLayout.WEST, player5);
		
		this.player1Points = new JLabel("0");
		player1Points.setForeground(Color.WHITE);
		baseLayout.putConstraint(SpringLayout.NORTH, player1Points, 0, SpringLayout.NORTH, player1);
		baseLayout.putConstraint(SpringLayout.WEST, player1Points, 35, SpringLayout.EAST, player1);
		this.player2Points = new JLabel("0");
		player2Points.setForeground(Color.WHITE);
		baseLayout.putConstraint(SpringLayout.NORTH, player2Points, 0, SpringLayout.NORTH, player2);
		baseLayout.putConstraint(SpringLayout.WEST, player2Points, 0, SpringLayout.WEST, player1Points);
		this.player3Points = new JLabel("0");
		player3Points.setForeground(Color.WHITE);
		baseLayout.putConstraint(SpringLayout.NORTH, player3Points, 0, SpringLayout.NORTH, player3);
		baseLayout.putConstraint(SpringLayout.WEST, player3Points, 0, SpringLayout.WEST, player1Points);
		this.player4Points = new JLabel("0");
		player4Points.setForeground(Color.WHITE);
		baseLayout.putConstraint(SpringLayout.NORTH, player4Points, 0, SpringLayout.NORTH, player4);
		baseLayout.putConstraint(SpringLayout.EAST, player4Points, 0, SpringLayout.EAST, player1Points);
		this.player5Points = new JLabel("0");
		player5Points.setForeground(Color.WHITE);
		baseLayout.putConstraint(SpringLayout.NORTH, player5Points, 0, SpringLayout.NORTH, player1);
		baseLayout.putConstraint(SpringLayout.WEST, player5Points, 37, SpringLayout.EAST, player5);
		this.player6Points = new JLabel("0");
		player6Points.setForeground(Color.WHITE);
		baseLayout.putConstraint(SpringLayout.NORTH, player6Points, 0, SpringLayout.NORTH, player2);
		baseLayout.putConstraint(SpringLayout.WEST, player6Points, 0, SpringLayout.WEST, player5Points);
		this.player7Points = new JLabel("0");
		player7Points.setForeground(Color.WHITE);
		baseLayout.putConstraint(SpringLayout.NORTH, player7Points, 0, SpringLayout.NORTH, player3);
		baseLayout.putConstraint(SpringLayout.EAST, player7Points, 0, SpringLayout.EAST, player5Points);
		this.player8Points = new JLabel("0");
		player8Points.setForeground(Color.WHITE);
		baseLayout.putConstraint(SpringLayout.NORTH, player8Points, 0, SpringLayout.NORTH, player4);
		baseLayout.putConstraint(SpringLayout.EAST, player8Points, 0, SpringLayout.EAST, player5Points);
		
		this.player1Entry = new JTextField(4);
		baseLayout.putConstraint(SpringLayout.NORTH, player1Entry, -5, SpringLayout.NORTH, player1);
		baseLayout.putConstraint(SpringLayout.WEST, player1Entry, 47, SpringLayout.EAST, player1Points);
		this.player2Entry = new JTextField(4);
		baseLayout.putConstraint(SpringLayout.NORTH, player2Entry, -5, SpringLayout.NORTH, player2);
		baseLayout.putConstraint(SpringLayout.WEST, player2Entry, 0, SpringLayout.WEST, player1Entry);
		this.player3Entry = new JTextField(4);
		baseLayout.putConstraint(SpringLayout.NORTH, player3Entry, -5, SpringLayout.NORTH, player3);
		baseLayout.putConstraint(SpringLayout.WEST, player3Entry, 0, SpringLayout.WEST, player1Entry);
		this.player4Entry = new JTextField(4);
		baseLayout.putConstraint(SpringLayout.NORTH, player4Entry, -5, SpringLayout.NORTH, player4);
		baseLayout.putConstraint(SpringLayout.WEST, player4Entry, 0, SpringLayout.WEST, player1Entry);
		this.player5Entry = new JTextField(4);
		baseLayout.putConstraint(SpringLayout.NORTH, player5Entry, -5, SpringLayout.NORTH, player1);
		baseLayout.putConstraint(SpringLayout.WEST, player5Entry, 53, SpringLayout.EAST, player5Points);
		this.player6Entry = new JTextField(4);
		baseLayout.putConstraint(SpringLayout.NORTH, player6Entry, -5, SpringLayout.NORTH, player2);
		baseLayout.putConstraint(SpringLayout.WEST, player6Entry, 0, SpringLayout.WEST, player5Entry);
		this.player7Entry = new JTextField(4);
		baseLayout.putConstraint(SpringLayout.NORTH, player7Entry, -5, SpringLayout.NORTH, player3);
		baseLayout.putConstraint(SpringLayout.WEST, player7Entry, 0, SpringLayout.WEST, player5Entry);
		this.player8Entry = new JTextField(4);
		baseLayout.putConstraint(SpringLayout.NORTH, player8Entry, -5, SpringLayout.NORTH, player4);
		baseLayout.putConstraint(SpringLayout.WEST, player8Entry, 0, SpringLayout.WEST, player5Entry);
		
		this.player1Check = new JCheckBox();
		baseLayout.putConstraint(SpringLayout.WEST, player1Check, 44, SpringLayout.EAST, player1Entry);
		baseLayout.putConstraint(SpringLayout.SOUTH, player1Check, 0, SpringLayout.SOUTH, player1);
		
		
		this.player2Check = new JCheckBox();
		baseLayout.putConstraint(SpringLayout.SOUTH, player2Check, 0, SpringLayout.SOUTH, player2);
		baseLayout.putConstraint(SpringLayout.EAST, player2Check, 0, SpringLayout.EAST, player1Check);
		this.player3Check = new JCheckBox();
		baseLayout.putConstraint(SpringLayout.WEST, player3Check, 0, SpringLayout.WEST, player1Check);
		baseLayout.putConstraint(SpringLayout.SOUTH, player3Check, 0, SpringLayout.SOUTH, player3);
		this.player4Check = new JCheckBox();
		baseLayout.putConstraint(SpringLayout.SOUTH, player4Check, 0, SpringLayout.SOUTH, player4);
		baseLayout.putConstraint(SpringLayout.EAST, player4Check, 0, SpringLayout.EAST, player1Check);
		this.player5Check = new JCheckBox();
		baseLayout.putConstraint(SpringLayout.SOUTH, player5Check, 0, SpringLayout.SOUTH, player1Entry);
		baseLayout.putConstraint(SpringLayout.EAST, player5Check, -50, SpringLayout.EAST, this);
		this.player6Check = new JCheckBox();
		baseLayout.putConstraint(SpringLayout.NORTH, player6Check, 0, SpringLayout.NORTH, player2Entry);
		baseLayout.putConstraint(SpringLayout.WEST, player6Check, 0, SpringLayout.WEST, player5Check);
		this.player7Check = new JCheckBox();
		baseLayout.putConstraint(SpringLayout.WEST, player7Check, 0, SpringLayout.WEST, player5Check);
		baseLayout.putConstraint(SpringLayout.SOUTH, player7Check, 0, SpringLayout.SOUTH, player3);
		this.player8Check = new JCheckBox();
		baseLayout.putConstraint(SpringLayout.NORTH, player8Check, 0, SpringLayout.NORTH, player4Entry);
		baseLayout.putConstraint(SpringLayout.WEST, player8Check, 0, SpringLayout.WEST, player5Check);

		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setPreferredSize(new Dimension(700,400));
		this.setBackground(Color.RED);
		
		this.add(setupButton);
		this.add(scoreRound);
				
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

		this.add(player1Entry);
		this.add(player2Entry);
		this.add(player3Entry);
		this.add(player4Entry);
		this.add(player5Entry);
		this.add(player6Entry);
		this.add(player7Entry);
		this.add(player8Entry);
		
		this.add(player1Check);
		this.add(player2Check);
		this.add(player3Check);
		this.add(player4Check);
		this.add(player5Check);
		this.add(player6Check);
		this.add(player7Check);
		this.add(player8Check);

		this.add(imageText);

	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, scoreRound, 0, SpringLayout.NORTH, setupButton);
		baseLayout.putConstraint(SpringLayout.EAST, scoreRound, -10, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, setupButton, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, setupButton, -10, SpringLayout.SOUTH, this);
	}
	
	private void setupListeners()
	{
		scoreRound.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				
			}
		});
		
	}
}
