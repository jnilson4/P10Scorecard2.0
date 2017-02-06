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
	
	private JTextArea phaseC1;
	private JTextArea pointsC1;
	private JTextArea addPointsC1;
	private JTextArea completePC1;
	
	private JTextArea phaseC2;
	private JTextArea pointsC2;
	private JTextArea addPointsC2;
	private JTextArea completePC2;
	
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
		
		this.phaseC1 = new JTextArea("Current         Phase");
		phaseC1.setEditable(false);
		phaseC1.setLineWrap(true);
		phaseC1.setWrapStyleWord(true);
		phaseC1.setColumns(1);
		phaseC1.setRows(2);
		phaseC1.setFont(new Font("Lucida Grande", Font.PLAIN, 8));
		phaseC1.setForeground(Color.WHITE);
		this.pointsC1 = new JTextArea("Total Points");
		pointsC1.setEditable(false);
		pointsC1.setColumns(1);
		pointsC1.setRows(2);
		pointsC1.setWrapStyleWord(true);
		pointsC1.setLineWrap(true);
		pointsC1.setFont(new Font("Lucida Grande", Font.PLAIN, 8));
		pointsC1.setForeground(Color.WHITE);
		this.addPointsC1 = new JTextArea("Round Points");
		baseLayout.putConstraint(SpringLayout.WEST, addPointsC1, 123, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, addPointsC1, -26, SpringLayout.WEST, pointsC1);
		addPointsC1.setEditable(false);
		baseLayout.putConstraint(SpringLayout.SOUTH, phaseC1, 0, SpringLayout.SOUTH, addPointsC1);
		baseLayout.putConstraint(SpringLayout.SOUTH, pointsC1, 0, SpringLayout.SOUTH, addPointsC1);
		addPointsC1.setFont(new Font("Lucida Grande", Font.PLAIN, 8));
		addPointsC1.setForeground(Color.WHITE);
		addPointsC1.setWrapStyleWord(true);
		addPointsC1.setRows(2);
		addPointsC1.setColumns(1);
		addPointsC1.setLineWrap(true);
		this.completePC1 = new JTextArea("  Phase Complete?");
		completePC1.setEditable(false);
		baseLayout.putConstraint(SpringLayout.SOUTH, completePC1, 0, SpringLayout.SOUTH, addPointsC1);
		baseLayout.putConstraint(SpringLayout.WEST, phaseC1, 6, SpringLayout.EAST, completePC1);
		baseLayout.putConstraint(SpringLayout.EAST, phaseC1, 57, SpringLayout.EAST, completePC1);
		baseLayout.putConstraint(SpringLayout.WEST, completePC1, 232, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, completePC1, -417, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.EAST, pointsC1, -6, SpringLayout.WEST, completePC1);
		completePC1.setLineWrap(true);
		completePC1.setWrapStyleWord(true);
		completePC1.setColumns(1);
		completePC1.setRows(2);
		completePC1.setFont(new Font("Lucida Grande", Font.PLAIN, 8));
		completePC1.setForeground(Color.WHITE);
		
		this.phaseC2 = new JTextArea("Current        Phase");
		phaseC2.setEditable(false);
		baseLayout.putConstraint(SpringLayout.WEST, phaseC2, -59, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, phaseC2, 0, SpringLayout.SOUTH, addPointsC1);
		baseLayout.putConstraint(SpringLayout.EAST, phaseC2, 0, SpringLayout.EAST, scoreRound);
		phaseC2.setLineWrap(true);
		phaseC2.setWrapStyleWord(true);
		phaseC2.setColumns(1);
		phaseC2.setRows(2);
		phaseC2.setFont(new Font("Lucida Grande", Font.PLAIN, 8));
		phaseC2.setForeground(Color.WHITE);
		this.pointsC2 = new JTextArea("Total Points");
		pointsC2.setEditable(false);
		baseLayout.putConstraint(SpringLayout.SOUTH, pointsC2, 0, SpringLayout.SOUTH, addPointsC1);
		baseLayout.putConstraint(SpringLayout.EAST, pointsC2, -58, SpringLayout.WEST, phaseC2);
		pointsC2.setColumns(1);
		pointsC2.setRows(2);
		pointsC2.setWrapStyleWord(true);
		pointsC2.setLineWrap(true);
		pointsC2.setFont(new Font("Lucida Grande", Font.PLAIN, 8));
		pointsC2.setForeground(Color.WHITE);
		this.addPointsC2 = new JTextArea("Round Points");
		baseLayout.putConstraint(SpringLayout.WEST, addPointsC2, 140, SpringLayout.EAST, phaseC1);
		baseLayout.putConstraint(SpringLayout.EAST, addPointsC2, -24, SpringLayout.WEST, pointsC2);
		addPointsC2.setEditable(false);
		baseLayout.putConstraint(SpringLayout.SOUTH, addPointsC2, 0, SpringLayout.SOUTH, addPointsC1);
		addPointsC2.setFont(new Font("Lucida Grande", Font.PLAIN, 8));
		addPointsC2.setForeground(Color.WHITE);
		addPointsC2.setWrapStyleWord(true);
		addPointsC2.setRows(2);
		addPointsC2.setColumns(1);
		addPointsC2.setLineWrap(true);
		this.completePC2 = new JTextArea("  Phase Complete?");
		completePC2.setEditable(false);
		baseLayout.putConstraint(SpringLayout.WEST, completePC2, 6, SpringLayout.EAST, pointsC2);
		baseLayout.putConstraint(SpringLayout.SOUTH, completePC2, 0, SpringLayout.SOUTH, addPointsC1);
		baseLayout.putConstraint(SpringLayout.EAST, completePC2, 57, SpringLayout.EAST, pointsC2);
		completePC2.setLineWrap(true);
		completePC2.setWrapStyleWord(true);
		completePC2.setColumns(1);
		completePC2.setRows(2);
		completePC2.setFont(new Font("Lucida Grande", Font.PLAIN, 8));
		completePC2.setForeground(Color.WHITE);
		
		this.player1 = new JLabel(playerNames[0]);
		this.player2 = new JLabel(playerNames[1]);
		baseLayout.putConstraint(SpringLayout.EAST, player2, 0, SpringLayout.EAST, player1);
		this.player3 = new JLabel(playerNames[2]);
		baseLayout.putConstraint(SpringLayout.EAST, player3, 0, SpringLayout.EAST, player1);
		this.player4 = new JLabel(playerNames[3]);
		baseLayout.putConstraint(SpringLayout.EAST, player4, 0, SpringLayout.EAST, player1);
		this.player5 = new JLabel(playerNames[4]);
		this.player6 = new JLabel(playerNames[5]);
		baseLayout.putConstraint(SpringLayout.EAST, player6, 0, SpringLayout.EAST, player5);
		this.player7 = new JLabel(playerNames[6]);
		baseLayout.putConstraint(SpringLayout.EAST, player7, 0, SpringLayout.EAST, player5);
		this.player8 = new JLabel(playerNames[7]);
		baseLayout.putConstraint(SpringLayout.EAST, player8, 0, SpringLayout.EAST, player5);
		
		this.player1Points = new JLabel("0");
		baseLayout.putConstraint(SpringLayout.WEST, pointsC1, -5, SpringLayout.WEST, player1Points);
		this.player2Points = new JLabel("0");
		this.player3Points = new JLabel("0");
		this.player4Points = new JLabel("0");
		this.player5Points = new JLabel("0");
		baseLayout.putConstraint(SpringLayout.WEST, pointsC2, -7, SpringLayout.WEST, player5Points);
		this.player6Points = new JLabel("0");
		this.player7Points = new JLabel("0");
		this.player8Points = new JLabel("0");
		
		this.player1Entry = new JTextField(4);
		baseLayout.putConstraint(SpringLayout.NORTH, player1Entry, 125, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, addPointsC1, -14, SpringLayout.NORTH, player1Entry);
		baseLayout.putConstraint(SpringLayout.NORTH, player1, 5, SpringLayout.NORTH, player1Entry);
		baseLayout.putConstraint(SpringLayout.EAST, player1Entry, -31, SpringLayout.WEST, player1Points);
		baseLayout.putConstraint(SpringLayout.EAST, player1, -40, SpringLayout.WEST, player1Entry);
		this.player2Entry = new JTextField(4);
		baseLayout.putConstraint(SpringLayout.NORTH, player2, 5, SpringLayout.NORTH, player2Entry);
		baseLayout.putConstraint(SpringLayout.EAST, player2Entry, -31, SpringLayout.WEST, player2Points);
		this.player3Entry = new JTextField(4);
		baseLayout.putConstraint(SpringLayout.SOUTH, player2Entry, -32, SpringLayout.NORTH, player3Entry);
		baseLayout.putConstraint(SpringLayout.NORTH, player3, 5, SpringLayout.NORTH, player3Entry);
		baseLayout.putConstraint(SpringLayout.EAST, player3Entry, -31, SpringLayout.WEST, player3Points);
		this.player4Entry = new JTextField(4);
		baseLayout.putConstraint(SpringLayout.SOUTH, player3Entry, -32, SpringLayout.NORTH, player4Entry);
		baseLayout.putConstraint(SpringLayout.NORTH, player4, 5, SpringLayout.NORTH, player4Entry);
		baseLayout.putConstraint(SpringLayout.EAST, player4Entry, -31, SpringLayout.WEST, player4Points);
		this.player5Entry = new JTextField(4);
		baseLayout.putConstraint(SpringLayout.NORTH, player5Entry, 14, SpringLayout.SOUTH, addPointsC2);
		baseLayout.putConstraint(SpringLayout.WEST, player5Points, 31, SpringLayout.EAST, player5Entry);
		baseLayout.putConstraint(SpringLayout.NORTH, player5, 5, SpringLayout.NORTH, player5Entry);
		this.player6Entry = new JTextField(4);
		baseLayout.putConstraint(SpringLayout.WEST, player6Points, 31, SpringLayout.EAST, player6Entry);
		baseLayout.putConstraint(SpringLayout.NORTH, player6, 5, SpringLayout.NORTH, player6Entry);
		baseLayout.putConstraint(SpringLayout.WEST, player6Entry, 465, SpringLayout.WEST, this);
		this.player7Entry = new JTextField(4);
		baseLayout.putConstraint(SpringLayout.SOUTH, player6Entry, -32, SpringLayout.NORTH, player7Entry);
		baseLayout.putConstraint(SpringLayout.WEST, player7Points, 31, SpringLayout.EAST, player7Entry);
		baseLayout.putConstraint(SpringLayout.NORTH, player7, 5, SpringLayout.NORTH, player7Entry);
		baseLayout.putConstraint(SpringLayout.WEST, player7Entry, 465, SpringLayout.WEST, this);
		this.player8Entry = new JTextField(4);
		baseLayout.putConstraint(SpringLayout.SOUTH, player7Entry, -32, SpringLayout.NORTH, player8Entry);
		baseLayout.putConstraint(SpringLayout.WEST, player8Points, 31, SpringLayout.EAST, player8Entry);
		baseLayout.putConstraint(SpringLayout.NORTH, player8, 5, SpringLayout.NORTH, player8Entry);
		baseLayout.putConstraint(SpringLayout.WEST, player8Entry, 465, SpringLayout.WEST, this);
		
		
		this.player1Check = new JCheckBox();
		baseLayout.putConstraint(SpringLayout.EAST, player1Points, -31, SpringLayout.WEST, player1Check);
		this.player2Check = new JCheckBox();
		baseLayout.putConstraint(SpringLayout.EAST, player2Points, -31, SpringLayout.WEST, player2Check);
		this.player3Check = new JCheckBox();
		baseLayout.putConstraint(SpringLayout.EAST, player3Points, -31, SpringLayout.WEST, player3Check);
		this.player4Check = new JCheckBox();
		baseLayout.putConstraint(SpringLayout.EAST, player4Points, -31, SpringLayout.WEST, player4Check);
		this.player5Check = new JCheckBox();
		this.player6Check = new JCheckBox();
		this.player7Check = new JCheckBox();
		baseLayout.putConstraint(SpringLayout.EAST, player7Points, -31, SpringLayout.WEST, player7Check);
		this.player8Check = new JCheckBox();

		this.player1Phase = new JLabel("0");
		this.player2Phase = new JLabel("0");
		baseLayout.putConstraint(SpringLayout.EAST, player2Check, -31, SpringLayout.WEST, player2Phase);
		this.player3Phase = new JLabel("0");
		baseLayout.putConstraint(SpringLayout.EAST, player3Check, -31, SpringLayout.WEST, player3Phase);
		this.player4Phase = new JLabel("0");
		baseLayout.putConstraint(SpringLayout.EAST, player4Check, -31, SpringLayout.WEST, player4Phase);
		this.player5Phase = new JLabel("0");
		this.player6Phase = new JLabel("0");
		this.player7Phase = new JLabel("0");
		this.player8Phase = new JLabel("0");
		

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
		
		this.add(phaseC1);
		this.add(pointsC1);
		this.add(addPointsC1);
		this.add(completePC1);
		
		this.add(phaseC2);
		this.add(pointsC2);
		this.add(addPointsC2);
		this.add(completePC2);
		
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
		
		this.add(imageText);

	}
	
	private void setupLayout()
	{
		pointsC1.setOpaque(false);
		addPointsC1.setOpaque(false);
		completePC1.setOpaque(false);
		phaseC2.setOpaque(false);
		pointsC2.setOpaque(false);
		addPointsC2.setOpaque(false);
		completePC2.setOpaque(false);
		phaseC1.setOpaque(false);
		baseLayout.putConstraint(SpringLayout.NORTH, scoreRound, 0, SpringLayout.NORTH, setupButton);
		baseLayout.putConstraint(SpringLayout.EAST, scoreRound, -10, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, setupButton, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, setupButton, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, player7Phase, 0, SpringLayout.NORTH, player7Points);
		baseLayout.putConstraint(SpringLayout.WEST, player7Phase, 31, SpringLayout.EAST, player7Check);
		player7Phase.setForeground(Color.WHITE);
		baseLayout.putConstraint(SpringLayout.NORTH, player8Phase, 0, SpringLayout.NORTH, player8Points);
		baseLayout.putConstraint(SpringLayout.WEST, player8Phase, 31, SpringLayout.EAST, player8Check);
		player8Phase.setForeground(Color.WHITE);
		baseLayout.putConstraint(SpringLayout.NORTH, player6Phase, 0, SpringLayout.NORTH, player6Points);
		baseLayout.putConstraint(SpringLayout.WEST, player6Phase, 31, SpringLayout.EAST, player6Check);
		player6Phase.setForeground(Color.WHITE);
		baseLayout.putConstraint(SpringLayout.NORTH, player5Phase, 0, SpringLayout.NORTH, player5Points);
		baseLayout.putConstraint(SpringLayout.WEST, player5Phase, 31, SpringLayout.EAST, player5Check);
		player5Phase.setForeground(Color.WHITE);
		baseLayout.putConstraint(SpringLayout.NORTH, player4Phase, 304, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, player4Phase, 0, SpringLayout.WEST, player1Phase);
		baseLayout.putConstraint(SpringLayout.SOUTH, player3Phase, -42, SpringLayout.NORTH, player4Phase);
		player4Phase.setForeground(Color.WHITE);
		baseLayout.putConstraint(SpringLayout.WEST, player3Phase, 0, SpringLayout.WEST, player1Phase);
		baseLayout.putConstraint(SpringLayout.SOUTH, player2Phase, -42, SpringLayout.NORTH, player3Phase);
		player3Phase.setForeground(Color.WHITE);
		baseLayout.putConstraint(SpringLayout.WEST, player2Phase, 0, SpringLayout.WEST, player1Phase);
		baseLayout.putConstraint(SpringLayout.SOUTH, player1Phase, -42, SpringLayout.NORTH, player2Phase);
		player2Phase.setForeground(Color.WHITE);
		baseLayout.putConstraint(SpringLayout.EAST, player1Phase, -397, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.EAST, player1Check, -31, SpringLayout.WEST, player1Phase);
		player1Phase.setForeground(Color.WHITE);
		baseLayout.putConstraint(SpringLayout.NORTH, player8Check, 299, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, player8Check, 0, SpringLayout.WEST, player5Check);
		baseLayout.putConstraint(SpringLayout.SOUTH, player7Check, -35, SpringLayout.NORTH, player8Check);
		baseLayout.putConstraint(SpringLayout.SOUTH, player1Check, -35, SpringLayout.NORTH, player2Check);
		baseLayout.putConstraint(SpringLayout.SOUTH, player2Check, -35, SpringLayout.NORTH, player3Check);
		baseLayout.putConstraint(SpringLayout.NORTH, player4Check, 299, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, player3Check, -35, SpringLayout.NORTH, player4Check);
		baseLayout.putConstraint(SpringLayout.WEST, player5Check, 31, SpringLayout.EAST, player5Points);
		baseLayout.putConstraint(SpringLayout.WEST, player6Check, 0, SpringLayout.WEST, player5Check);
		baseLayout.putConstraint(SpringLayout.SOUTH, player5Check, -35, SpringLayout.NORTH, player6Check);
		baseLayout.putConstraint(SpringLayout.WEST, player7Check, 0, SpringLayout.WEST, player5Check);
		baseLayout.putConstraint(SpringLayout.SOUTH, player6Check, -35, SpringLayout.NORTH, player7Check);
		baseLayout.putConstraint(SpringLayout.NORTH, player8Entry, 299, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, player4Entry, 299, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, player5, -31, SpringLayout.WEST, player5Entry);
		baseLayout.putConstraint(SpringLayout.WEST, player5Entry, 465, SpringLayout.WEST, this);
		player1Points.setForeground(Color.WHITE);
		baseLayout.putConstraint(SpringLayout.SOUTH, player1Points, -42, SpringLayout.NORTH, player2Points);
		player2Points.setForeground(Color.WHITE);
		baseLayout.putConstraint(SpringLayout.SOUTH, player2Points, -42, SpringLayout.NORTH, player3Points);
		player3Points.setForeground(Color.WHITE);
		baseLayout.putConstraint(SpringLayout.NORTH, player4Points, 304, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, player3Points, -42, SpringLayout.NORTH, player4Points);
		player4Points.setForeground(Color.WHITE);
		player5Points.setForeground(Color.WHITE);
		baseLayout.putConstraint(SpringLayout.SOUTH, player5Points, -42, SpringLayout.NORTH, player6Points);
		player6Points.setForeground(Color.WHITE);
		baseLayout.putConstraint(SpringLayout.SOUTH, player6Points, -42, SpringLayout.NORTH, player7Points);
		player7Points.setForeground(Color.WHITE);
		baseLayout.putConstraint(SpringLayout.SOUTH, player7Points, -42, SpringLayout.NORTH, player8Points);
		baseLayout.putConstraint(SpringLayout.NORTH, player8Points, 304, SpringLayout.NORTH, this);
		player8Points.setForeground(Color.WHITE);
		player1.setForeground(Color.WHITE);
		player2.setForeground(Color.WHITE);
		player3.setForeground(Color.WHITE);
		player4.setForeground(Color.WHITE);
		player5.setForeground(Color.WHITE);
		player6.setForeground(Color.WHITE);
		player7.setForeground(Color.WHITE);
		player8.setForeground(Color.WHITE);
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
