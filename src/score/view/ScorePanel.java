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
		baseLayout.putConstraint(SpringLayout.WEST, player1, 21, SpringLayout.WEST, this);
		player1.setForeground(Color.WHITE);
		this.player2 = new JLabel(playerNames[1]);
		baseLayout.putConstraint(SpringLayout.SOUTH, player1, -42, SpringLayout.NORTH, player2);
		baseLayout.putConstraint(SpringLayout.SOUTH, player2, -196, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, player2, 21, SpringLayout.WEST, this);
		player2.setForeground(Color.WHITE);
		this.player3 = new JLabel(playerNames[2]);
		baseLayout.putConstraint(SpringLayout.NORTH, player3, 42, SpringLayout.SOUTH, player2);
		baseLayout.putConstraint(SpringLayout.WEST, player3, 21, SpringLayout.WEST, this);
		player3.setForeground(Color.WHITE);
		this.player4 = new JLabel(playerNames[3]);
		baseLayout.putConstraint(SpringLayout.WEST, player4, 21, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, player4, -41, SpringLayout.NORTH, setupButton);
		player4.setForeground(Color.WHITE);
		this.player5 = new JLabel(playerNames[4]);
		player5.setForeground(Color.WHITE);
		this.player6 = new JLabel(playerNames[5]);
		baseLayout.putConstraint(SpringLayout.SOUTH, player5, -42, SpringLayout.NORTH, player6);
		baseLayout.putConstraint(SpringLayout.NORTH, player6, 0, SpringLayout.NORTH, player2);
		player6.setForeground(Color.WHITE);
		this.player7 = new JLabel(playerNames[6]);
		baseLayout.putConstraint(SpringLayout.WEST, player7, 351, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, player7, 208, SpringLayout.NORTH, this);
		player7.setForeground(Color.WHITE);
		this.player8 = new JLabel(playerNames[7]);
		baseLayout.putConstraint(SpringLayout.WEST, player8, 351, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, player8, -79, SpringLayout.SOUTH, this);
		player8.setForeground(Color.WHITE);
		
		this.player1Points = new JLabel("0");
		baseLayout.putConstraint(SpringLayout.NORTH, player1Points, 130, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, player1Points, -490, SpringLayout.EAST, this);
		player1Points.setForeground(Color.WHITE);
		this.player2Points = new JLabel("0");
		baseLayout.putConstraint(SpringLayout.SOUTH, player1Points, -41, SpringLayout.NORTH, player2Points);
		baseLayout.putConstraint(SpringLayout.NORTH, player2Points, 187, SpringLayout.NORTH, this);
		player2Points.setForeground(Color.WHITE);
		this.player3Points = new JLabel("0");
		baseLayout.putConstraint(SpringLayout.NORTH, player3Points, 42, SpringLayout.SOUTH, player2Points);
		player3Points.setForeground(Color.WHITE);
		this.player4Points = new JLabel("0");
		baseLayout.putConstraint(SpringLayout.NORTH, player4Points, 44, SpringLayout.SOUTH, player3Points);
		player4Points.setForeground(Color.WHITE);
		this.player5Points = new JLabel("0");
		baseLayout.putConstraint(SpringLayout.NORTH, player5Points, 130, SpringLayout.NORTH, this);
		player5Points.setForeground(Color.WHITE);
		this.player6Points = new JLabel("0");
		player6Points.setForeground(Color.WHITE);
		this.player7Points = new JLabel("0");
		baseLayout.putConstraint(SpringLayout.EAST, player6Points, 0, SpringLayout.EAST, player7Points);
		baseLayout.putConstraint(SpringLayout.NORTH, player7Points, 0, SpringLayout.NORTH, player7);
		player7Points.setForeground(Color.WHITE);
		this.player8Points = new JLabel("0");
		player8Points.setForeground(Color.WHITE);
		
		this.player1Entry = new JTextField(4);
		baseLayout.putConstraint(SpringLayout.EAST, player1Entry, -37, SpringLayout.WEST, player1Points);
		this.player2Entry = new JTextField(4);
		baseLayout.putConstraint(SpringLayout.SOUTH, player1Entry, -31, SpringLayout.NORTH, player2Entry);
		baseLayout.putConstraint(SpringLayout.NORTH, player2Entry, 182, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, player2Points, 38, SpringLayout.EAST, player2Entry);
		baseLayout.putConstraint(SpringLayout.WEST, player2Entry, 93, SpringLayout.WEST, this);
		this.player3Entry = new JTextField(4);
		baseLayout.putConstraint(SpringLayout.NORTH, player3Entry, 32, SpringLayout.SOUTH, player2Entry);
		baseLayout.putConstraint(SpringLayout.WEST, player3Points, 38, SpringLayout.EAST, player3Entry);
		baseLayout.putConstraint(SpringLayout.WEST, player3Entry, 93, SpringLayout.WEST, this);
		this.player4Entry = new JTextField(4);
		baseLayout.putConstraint(SpringLayout.NORTH, player4Entry, 34, SpringLayout.SOUTH, player3Entry);
		baseLayout.putConstraint(SpringLayout.WEST, player4Entry, 24, SpringLayout.EAST, player4);
		baseLayout.putConstraint(SpringLayout.WEST, player4Points, 37, SpringLayout.EAST, player4Entry);
		this.player5Entry = new JTextField(4);
		baseLayout.putConstraint(SpringLayout.WEST, player5Points, 43, SpringLayout.EAST, player5Entry);
		baseLayout.putConstraint(SpringLayout.WEST, player5Entry, 43, SpringLayout.EAST, player5);
		this.player6Entry = new JTextField(4);
		baseLayout.putConstraint(SpringLayout.SOUTH, player5Entry, -18, SpringLayout.NORTH, player6Entry);
		baseLayout.putConstraint(SpringLayout.NORTH, player6Points, 5, SpringLayout.NORTH, player6Entry);
		this.player7Entry = new JTextField(4);
		baseLayout.putConstraint(SpringLayout.SOUTH, player6Entry, -8, SpringLayout.NORTH, player7Entry);
		baseLayout.putConstraint(SpringLayout.EAST, player6Entry, 0, SpringLayout.EAST, player7Entry);
		baseLayout.putConstraint(SpringLayout.WEST, player7Entry, 13, SpringLayout.EAST, player7);
		baseLayout.putConstraint(SpringLayout.NORTH, player7Entry, -5, SpringLayout.NORTH, player7);
		this.player8Entry = new JTextField(4);
		baseLayout.putConstraint(SpringLayout.NORTH, player8Entry, 300, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, player8Entry, 26, SpringLayout.EAST, player8);
		
		this.player1Check = new JCheckBox();
		baseLayout.putConstraint(SpringLayout.WEST, player1Check, 37, SpringLayout.EAST, player1Points);
		
		
		this.player2Check = new JCheckBox();
		baseLayout.putConstraint(SpringLayout.SOUTH, player1Check, -36, SpringLayout.NORTH, player2Check);
		baseLayout.putConstraint(SpringLayout.NORTH, player2Check, 184, SpringLayout.NORTH, this);
		this.player3Check = new JCheckBox();
		baseLayout.putConstraint(SpringLayout.NORTH, player3Check, 35, SpringLayout.SOUTH, player2Check);
		this.player4Check = new JCheckBox();
		baseLayout.putConstraint(SpringLayout.NORTH, player4Check, 37, SpringLayout.SOUTH, player3Check);
		baseLayout.putConstraint(SpringLayout.WEST, player4Check, 243, SpringLayout.WEST, this);
		this.player5Check = new JCheckBox();
		baseLayout.putConstraint(SpringLayout.WEST, player5Check, 43, SpringLayout.EAST, player5Points);
		this.player6Check = new JCheckBox();
		baseLayout.putConstraint(SpringLayout.SOUTH, player5Check, -19, SpringLayout.NORTH, player6Check);
		baseLayout.putConstraint(SpringLayout.SOUTH, player6Check, 0, SpringLayout.SOUTH, player6Points);
		this.player7Check = new JCheckBox();
		baseLayout.putConstraint(SpringLayout.NORTH, player7Check, 11, SpringLayout.SOUTH, player6Check);
		baseLayout.putConstraint(SpringLayout.EAST, player7Points, -42, SpringLayout.WEST, player7Check);
		this.player8Check = new JCheckBox();
		baseLayout.putConstraint(SpringLayout.NORTH, player8Points, 0, SpringLayout.NORTH, player8Check);
		baseLayout.putConstraint(SpringLayout.EAST, player8Points, -42, SpringLayout.WEST, player8Check);
		baseLayout.putConstraint(SpringLayout.NORTH, player8Check, 44, SpringLayout.SOUTH, player7Check);

		this.player1Phase = new JLabel("0");
		baseLayout.putConstraint(SpringLayout.EAST, player1Phase, -380, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, player5, 31, SpringLayout.EAST, player1Phase);
		player1Phase.setForeground(Color.WHITE);
		this.player2Phase = new JLabel("0");
		baseLayout.putConstraint(SpringLayout.WEST, player6, 30, SpringLayout.EAST, player2Phase);
		baseLayout.putConstraint(SpringLayout.SOUTH, player1Phase, -41, SpringLayout.NORTH, player2Phase);
		baseLayout.putConstraint(SpringLayout.NORTH, player2Phase, 187, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, player2Phase, -379, SpringLayout.EAST, this);
		player2Phase.setForeground(Color.WHITE);
		this.player3Phase = new JLabel("0");
		baseLayout.putConstraint(SpringLayout.NORTH, player3Phase, 42, SpringLayout.SOUTH, player2Phase);
		baseLayout.putConstraint(SpringLayout.EAST, player3Check, -42, SpringLayout.WEST, player3Phase);
		baseLayout.putConstraint(SpringLayout.EAST, player2Check, -42, SpringLayout.WEST, player3Phase);
		baseLayout.putConstraint(SpringLayout.EAST, player3Phase, -379, SpringLayout.EAST, this);
		player3Phase.setForeground(Color.WHITE);
		this.player4Phase = new JLabel("0");
		baseLayout.putConstraint(SpringLayout.NORTH, player4Phase, 44, SpringLayout.SOUTH, player3Phase);
		baseLayout.putConstraint(SpringLayout.WEST, player4Phase, 313, SpringLayout.WEST, this);
		player4Phase.setForeground(Color.WHITE);
		this.player5Phase = new JLabel("0");
		baseLayout.putConstraint(SpringLayout.EAST, player5Phase, -26, SpringLayout.EAST, this);
		player5Phase.setForeground(Color.WHITE);
		this.player6Phase = new JLabel("0");
		baseLayout.putConstraint(SpringLayout.WEST, player6Phase, 667, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, player5Phase, -28, SpringLayout.NORTH, player6Phase);
		baseLayout.putConstraint(SpringLayout.EAST, player6Check, -17, SpringLayout.WEST, player6Phase);
		baseLayout.putConstraint(SpringLayout.NORTH, player6Phase, 0, SpringLayout.NORTH, player6Points);
		player6Phase.setForeground(Color.WHITE);
		this.player7Phase = new JLabel("0");
		baseLayout.putConstraint(SpringLayout.NORTH, player7Phase, 18, SpringLayout.SOUTH, player6Phase);
		baseLayout.putConstraint(SpringLayout.WEST, player7Phase, 667, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, player7Check, -17, SpringLayout.WEST, player7Phase);
		player7Phase.setForeground(Color.WHITE);
		this.player8Phase = new JLabel("0");
		baseLayout.putConstraint(SpringLayout.WEST, player8Phase, 667, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, player8Check, -17, SpringLayout.WEST, player8Phase);
		baseLayout.putConstraint(SpringLayout.NORTH, player8Phase, 49, SpringLayout.SOUTH, player7Phase);
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
