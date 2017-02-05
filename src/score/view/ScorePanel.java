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
	
	private JLabel player1Phase;
	private JLabel player2Phase;
	private JLabel player3Phase;
	private JLabel player4Phase;
	private JLabel player5Phase;
	private JLabel player6Phase;
	private JLabel player7Phase;
	private JLabel player8Phase;
	
	public ScorePanel(ScoreController baseController)
	{
		super();
		this.baseController = baseController;
		String [] playerNames = baseController.getNames();
		this.baseLayout = new SpringLayout();
		
		this.backgroundImage = new ImageIcon(getClass().getResource("/score/view/images/p10bg.jpg"));
		this.imageText = new JLabel(" ", backgroundImage, JLabel.CENTER);
		
		this.setupButton = new JButton("Return to Setup");
		this.scoreRound = new JButton("Score Round");
		
		this.player1 = new JLabel(playerNames[0]);
		player1.setForeground(Color.WHITE);
		this.player2 = new JLabel(playerNames[1]);
		baseLayout.putConstraint(SpringLayout.SOUTH, player1, -42, SpringLayout.NORTH, player2);
		baseLayout.putConstraint(SpringLayout.WEST, player2, 31, SpringLayout.WEST, this);
		player2.setForeground(Color.WHITE);
		this.player3 = new JLabel(playerNames[2]);
		baseLayout.putConstraint(SpringLayout.SOUTH, player2, -42, SpringLayout.NORTH, player3);
		baseLayout.putConstraint(SpringLayout.WEST, player3, 0, SpringLayout.WEST, player2);
		player3.setForeground(Color.WHITE);
		this.player4 = new JLabel(playerNames[3]);
		baseLayout.putConstraint(SpringLayout.SOUTH, player3, -42, SpringLayout.NORTH, player4);
		baseLayout.putConstraint(SpringLayout.SOUTH, player4, -41, SpringLayout.NORTH, setupButton);
		player4.setForeground(Color.WHITE);
		this.player5 = new JLabel(playerNames[4]);
		baseLayout.putConstraint(SpringLayout.NORTH, player5, 0, SpringLayout.NORTH, player1);
		player5.setForeground(Color.WHITE);
		this.player6 = new JLabel(playerNames[5]);
		baseLayout.putConstraint(SpringLayout.NORTH, player6, 0, SpringLayout.NORTH, player2);
		player6.setForeground(Color.WHITE);
		this.player7 = new JLabel(playerNames[6]);
		baseLayout.putConstraint(SpringLayout.NORTH, player7, 42, SpringLayout.SOUTH, player6);
		player7.setForeground(Color.WHITE);
		this.player8 = new JLabel(playerNames[7]);
		baseLayout.putConstraint(SpringLayout.NORTH, player8, 43, SpringLayout.SOUTH, player7);
		baseLayout.putConstraint(SpringLayout.EAST, player8, -266, SpringLayout.EAST, this);
		player8.setForeground(Color.WHITE);
		
		this.player1Points = new JLabel("0");
		baseLayout.putConstraint(SpringLayout.NORTH, player1Points, 0, SpringLayout.NORTH, player1);
		player1Points.setForeground(Color.WHITE);
		this.player2Points = new JLabel("0");
		baseLayout.putConstraint(SpringLayout.NORTH, player2Points, 0, SpringLayout.NORTH, player2);
		player2Points.setForeground(Color.WHITE);
		this.player3Points = new JLabel("0");
		baseLayout.putConstraint(SpringLayout.NORTH, player3Points, 42, SpringLayout.SOUTH, player2Points);
		player3Points.setForeground(Color.WHITE);
		this.player4Points = new JLabel("0");
		baseLayout.putConstraint(SpringLayout.NORTH, player4Points, 44, SpringLayout.SOUTH, player3Points);
		player4Points.setForeground(Color.WHITE);
		this.player5Points = new JLabel("0");
		baseLayout.putConstraint(SpringLayout.NORTH, player5Points, 0, SpringLayout.NORTH, player1);
		player5Points.setForeground(Color.WHITE);
		this.player6Points = new JLabel("0");
		baseLayout.putConstraint(SpringLayout.NORTH, player6Points, 0, SpringLayout.NORTH, player2);
		player6Points.setForeground(Color.WHITE);
		this.player7Points = new JLabel("0");
		baseLayout.putConstraint(SpringLayout.NORTH, player7Points, 42, SpringLayout.SOUTH, player6Points);
		baseLayout.putConstraint(SpringLayout.EAST, player7Points, -138, SpringLayout.EAST, this);
		player7Points.setForeground(Color.WHITE);
		this.player8Points = new JLabel("0");
		baseLayout.putConstraint(SpringLayout.NORTH, player8Points, 42, SpringLayout.SOUTH, player7Points);
		player8Points.setForeground(Color.WHITE);
		
		this.player1Entry = new JTextField(4);
		baseLayout.putConstraint(SpringLayout.NORTH, player1Entry, -5, SpringLayout.NORTH, player1);
		baseLayout.putConstraint(SpringLayout.EAST, player1Entry, -31, SpringLayout.WEST, player1Points);
		baseLayout.putConstraint(SpringLayout.EAST, player1, -31, SpringLayout.WEST, player1Entry);
		this.player2Entry = new JTextField(4);
		baseLayout.putConstraint(SpringLayout.NORTH, player2Entry, -5, SpringLayout.NORTH, player2);
		baseLayout.putConstraint(SpringLayout.WEST, player2Entry, 31, SpringLayout.EAST, player2);
		baseLayout.putConstraint(SpringLayout.WEST, player2Points, 31, SpringLayout.EAST, player2Entry);
		this.player3Entry = new JTextField(4);
		baseLayout.putConstraint(SpringLayout.WEST, player3Points, 31, SpringLayout.EAST, player3Entry);
		baseLayout.putConstraint(SpringLayout.NORTH, player3Entry, 32, SpringLayout.SOUTH, player2Entry);
		baseLayout.putConstraint(SpringLayout.WEST, player3Entry, 31, SpringLayout.EAST, player3);
		this.player4Entry = new JTextField(4);
		baseLayout.putConstraint(SpringLayout.EAST, player4Entry, -31, SpringLayout.WEST, player4Points);
		baseLayout.putConstraint(SpringLayout.EAST, player4, -31, SpringLayout.WEST, player4Entry);
		baseLayout.putConstraint(SpringLayout.NORTH, player4Entry, 34, SpringLayout.SOUTH, player3Entry);
		this.player5Entry = new JTextField(4);
		baseLayout.putConstraint(SpringLayout.NORTH, player5Entry, -5, SpringLayout.NORTH, player1);
		baseLayout.putConstraint(SpringLayout.WEST, player5Points, 31, SpringLayout.EAST, player5Entry);
		baseLayout.putConstraint(SpringLayout.WEST, player5Entry, 31, SpringLayout.EAST, player5);
		this.player6Entry = new JTextField(4);
		baseLayout.putConstraint(SpringLayout.NORTH, player6Entry, -5, SpringLayout.NORTH, player2);
		baseLayout.putConstraint(SpringLayout.WEST, player6Points, 31, SpringLayout.EAST, player6Entry);
		baseLayout.putConstraint(SpringLayout.WEST, player6Entry, 31, SpringLayout.EAST, player6);
		this.player7Entry = new JTextField(4);
		baseLayout.putConstraint(SpringLayout.WEST, player7Points, 31, SpringLayout.EAST, player7Entry);
		baseLayout.putConstraint(SpringLayout.NORTH, player7Entry, 32, SpringLayout.SOUTH, player6Entry);
		baseLayout.putConstraint(SpringLayout.WEST, player7Entry, 31, SpringLayout.EAST, player7);
		this.player8Entry = new JTextField(4);
		baseLayout.putConstraint(SpringLayout.WEST, player8Points, 31, SpringLayout.EAST, player8Entry);
		baseLayout.putConstraint(SpringLayout.NORTH, player8Entry, 33, SpringLayout.SOUTH, player7Entry);
		baseLayout.putConstraint(SpringLayout.WEST, player8Entry, 31, SpringLayout.EAST, player8);
		
		this.player1Check = new JCheckBox();
		baseLayout.putConstraint(SpringLayout.NORTH, player1Check, -5, SpringLayout.NORTH, player1);
		baseLayout.putConstraint(SpringLayout.EAST, player1Points, -31, SpringLayout.WEST, player1Check);
		
		
		this.player2Check = new JCheckBox();
		baseLayout.putConstraint(SpringLayout.NORTH, player2Check, -5, SpringLayout.NORTH, player2);
		baseLayout.putConstraint(SpringLayout.WEST, player2Check, 31, SpringLayout.EAST, player2Points);
		this.player3Check = new JCheckBox();
		baseLayout.putConstraint(SpringLayout.NORTH, player3Check, 35, SpringLayout.SOUTH, player2Check);
		baseLayout.putConstraint(SpringLayout.WEST, player3Check, 31, SpringLayout.EAST, player3Points);
		this.player4Check = new JCheckBox();
		baseLayout.putConstraint(SpringLayout.EAST, player4Points, -31, SpringLayout.WEST, player4Check);
		baseLayout.putConstraint(SpringLayout.NORTH, player4Check, 37, SpringLayout.SOUTH, player3Check);
		this.player5Check = new JCheckBox();
		baseLayout.putConstraint(SpringLayout.NORTH, player5Check, -5, SpringLayout.NORTH, player1);
		baseLayout.putConstraint(SpringLayout.WEST, player5Check, 31, SpringLayout.EAST, player5Points);
		this.player6Check = new JCheckBox();
		baseLayout.putConstraint(SpringLayout.NORTH, player6Check, -5, SpringLayout.NORTH, player2);
		baseLayout.putConstraint(SpringLayout.WEST, player6Check, 31, SpringLayout.EAST, player6Points);
		this.player7Check = new JCheckBox();
		baseLayout.putConstraint(SpringLayout.NORTH, player7Check, 33, SpringLayout.SOUTH, player6Check);
		baseLayout.putConstraint(SpringLayout.WEST, player7Check, 31, SpringLayout.EAST, player7Points);
		this.player8Check = new JCheckBox();
		baseLayout.putConstraint(SpringLayout.NORTH, player8Check, 35, SpringLayout.SOUTH, player7Check);
		baseLayout.putConstraint(SpringLayout.WEST, player8Check, 31, SpringLayout.EAST, player8Points);

		this.player1Phase = new JLabel("0");
		baseLayout.putConstraint(SpringLayout.NORTH, player1Phase, 0, SpringLayout.NORTH, player1);
		baseLayout.putConstraint(SpringLayout.EAST, player1Phase, -370, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, player5, 31, SpringLayout.EAST, player1Phase);
		baseLayout.putConstraint(SpringLayout.EAST, player1Check, -31, SpringLayout.WEST, player1Phase);
		player1Phase.setForeground(Color.WHITE);
		this.player2Phase = new JLabel("0");
		baseLayout.putConstraint(SpringLayout.NORTH, player2Phase, 0, SpringLayout.NORTH, player2);
		baseLayout.putConstraint(SpringLayout.WEST, player6, 31, SpringLayout.EAST, player2Phase);
		baseLayout.putConstraint(SpringLayout.WEST, player2Phase, 31, SpringLayout.EAST, player2Check);
		player2Phase.setForeground(Color.WHITE);
		this.player3Phase = new JLabel("0");
		baseLayout.putConstraint(SpringLayout.WEST, player7, 31, SpringLayout.EAST, player3Phase);
		baseLayout.putConstraint(SpringLayout.NORTH, player3Phase, 42, SpringLayout.SOUTH, player2Phase);
		baseLayout.putConstraint(SpringLayout.WEST, player3Phase, 31, SpringLayout.EAST, player3Check);
		player3Phase.setForeground(Color.WHITE);
		this.player4Phase = new JLabel("0");
		baseLayout.putConstraint(SpringLayout.EAST, player4Phase, -31, SpringLayout.WEST, player8);
		baseLayout.putConstraint(SpringLayout.EAST, player4Check, -31, SpringLayout.WEST, player4Phase);
		baseLayout.putConstraint(SpringLayout.NORTH, player4Phase, 44, SpringLayout.SOUTH, player3Phase);
		player4Phase.setForeground(Color.WHITE);
		this.player5Phase = new JLabel("0");
		baseLayout.putConstraint(SpringLayout.NORTH, player5Phase, 0, SpringLayout.NORTH, player1);
		baseLayout.putConstraint(SpringLayout.WEST, player5Phase, 31, SpringLayout.EAST, player5Check);
		player5Phase.setForeground(Color.WHITE);
		this.player6Phase = new JLabel("0");
		baseLayout.putConstraint(SpringLayout.NORTH, player6Phase, 0, SpringLayout.NORTH, player2);
		baseLayout.putConstraint(SpringLayout.WEST, player6Phase, 31, SpringLayout.EAST, player6Check);
		player6Phase.setForeground(Color.WHITE);
		this.player7Phase = new JLabel("0");
		baseLayout.putConstraint(SpringLayout.NORTH, player7Phase, 42, SpringLayout.SOUTH, player6Phase);
		baseLayout.putConstraint(SpringLayout.WEST, player7Phase, 31, SpringLayout.EAST, player7Check);
		player7Phase.setForeground(Color.WHITE);
		this.player8Phase = new JLabel("0");
		baseLayout.putConstraint(SpringLayout.WEST, player8Phase, 31, SpringLayout.EAST, player8Check);
		baseLayout.putConstraint(SpringLayout.SOUTH, player8Phase, -41, SpringLayout.NORTH, scoreRound);
		player8Phase.setForeground(Color.WHITE);

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

		this.add(player1Phase);
		this.add(player2Phase);
		this.add(player3Phase);
		this.add(player4Phase);
		this.add(player5Phase);
		this.add(player6Phase);
		this.add(player7Phase);
		this.add(player8Phase);
		
//		this.add(imageText);

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
		
		
		setupButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				SetupPanel setup = new SetupPanel(baseController);
				baseController.getFrame().getContentPane().removeAll();
				baseController.getFrame().setContentPane(setup);
				baseController.getFrame().validate();
				repaint();
			}
		});
		
	}
	
	//I like the idea of a score card, just get that trash code outta here
	//good code in general-easy to understand and clean
}
