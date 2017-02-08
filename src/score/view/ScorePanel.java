package score.view;

import javax.swing.*;
import score.controller.ScoreController;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.*;
import score.model.*;

public class ScorePanel extends JPanel
{
	private SpringLayout baseLayout;
	private ScoreController baseController;
	
	private ImageIcon backgroundImage, helpButton;
	private JLabel imageText, imageText1, roundNumber;
	private int round;
	
	private JButton setupButton, scoreRound, manualOverride;
	
	private JLabel player1, player2, player3, player4, player5, player6, player7, player8;
	
	private JLabel player1Points, player2Points, player3Points, player4Points, player5Points, player6Points, player7Points, player8Points;
	
	private JTextField player1Entry, player2Entry, player3Entry, player4Entry, player5Entry, player6Entry, player7Entry, player8Entry;
	
	private JCheckBox player1Check, player2Check, player3Check, player4Check, player5Check, player6Check, player7Check, player8Check;
	
	private JLabel player1Phase, player2Phase, player3Phase, player4Phase, player5Phase, player6Phase, player7Phase, player8Phase;
	
	private JTextArea phaseC1, phaseC2, pointsC1, pointsC2, addPointsC1, addPointsC2, completePC1, completePC2;
	
	public ScorePanel(ScoreController baseController)
	{
		super();
		this.baseController = baseController;
		String [] playerNames = baseController.getNames();
		this.baseLayout = new SpringLayout();
		
		this.backgroundImage = new ImageIcon(getClass().getResource("/score/view/images/p10bg.jpg"));
		this.imageText = new JLabel(" ", backgroundImage, JLabel.CENTER);
		this.round = 1;
		this.roundNumber = new JLabel("ROUND " + round);
		
		this.helpButton = new ImageIcon(getClass().getResource("/score/view/images/questionMark2.png"));
		this.imageText1 = new JLabel(" ", helpButton, JLabel.CENTER);
		
		this.setupButton = new JButton("Return to Setup");
		this.scoreRound = new JButton("Score Round");
		this.manualOverride = new JButton("Manual Override");
		
		this.phaseC1 = new JTextArea("Current         Phase");
		this.pointsC1 = new JTextArea("Total Points");
		this.addPointsC1 = new JTextArea("Round Points");
		this.completePC1 = new JTextArea("  Phase Complete?");
		
		this.phaseC2 = new JTextArea("Current        Phase");
		this.pointsC2 = new JTextArea("Total Points");
		this.addPointsC2 = new JTextArea("Round Points");
		this.completePC2 = new JTextArea("  Phase Complete?");
		
		this.player1 = new JLabel(playerNames[0]);
		this.player2 = new JLabel(playerNames[1]);
		this.player3 = new JLabel(playerNames[2]);
		this.player4 = new JLabel(playerNames[3]);
		this.player5 = new JLabel(playerNames[4]);
		this.player6 = new JLabel(playerNames[5]);
		this.player7 = new JLabel(playerNames[6]);
		this.player8 = new JLabel(playerNames[7]);
		
		this.player1Points = new JLabel("0");
		this.player2Points = new JLabel("0");
		this.player3Points = new JLabel("0");
		this.player4Points = new JLabel("0");
		this.player5Points = new JLabel("0");
		this.player6Points = new JLabel("0");
		this.player7Points = new JLabel("0");
		this.player8Points = new JLabel("0");
		
		this.player1Entry = new JTextField(4);
		this.player2Entry = new JTextField(4);
		this.player3Entry = new JTextField(4);
		this.player4Entry = new JTextField(4);
		this.player5Entry = new JTextField(4);
		this.player6Entry = new JTextField(4);
		this.player7Entry = new JTextField(4);
		this.player8Entry = new JTextField(4);
		
		this.player1Check = new JCheckBox();
		this.player2Check = new JCheckBox();
		this.player3Check = new JCheckBox();
		this.player4Check = new JCheckBox();
		this.player5Check = new JCheckBox();
		this.player6Check = new JCheckBox();
		this.player7Check = new JCheckBox();
		this.player8Check = new JCheckBox();

		this.player1Phase = new JLabel("1");
		this.player2Phase = new JLabel("1");
		this.player3Phase = new JLabel("1");
		this.player4Phase = new JLabel("1");
		this.player5Phase = new JLabel("1");
		this.player6Phase = new JLabel("1");
		this.player7Phase = new JLabel("1");
		this.player8Phase = new JLabel("1");
		

		setupPanel();
		setupGUI();
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
		this.add(manualOverride);
		
		this.add(roundNumber);
		this.add(imageText1);
		
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
		baseLayout.putConstraint(SpringLayout.NORTH, roundNumber, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, roundNumber, 12, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, imageText1, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, imageText1, -10, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, manualOverride, 126, SpringLayout.EAST, setupButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, manualOverride, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, scoreRound, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, scoreRound, -10, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, setupButton, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, setupButton, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, player7Phase, 0, SpringLayout.NORTH, player7Points);
		baseLayout.putConstraint(SpringLayout.WEST, player7Phase, 31, SpringLayout.EAST, player7Check);
		baseLayout.putConstraint(SpringLayout.NORTH, player8Phase, 0, SpringLayout.NORTH, player8Points);
		baseLayout.putConstraint(SpringLayout.WEST, player8Phase, 31, SpringLayout.EAST, player8Check);
		baseLayout.putConstraint(SpringLayout.NORTH, player6Phase, 0, SpringLayout.NORTH, player6Points);
		baseLayout.putConstraint(SpringLayout.WEST, player6Phase, 31, SpringLayout.EAST, player6Check);
		baseLayout.putConstraint(SpringLayout.NORTH, player5Phase, 0, SpringLayout.NORTH, player5Points);
		baseLayout.putConstraint(SpringLayout.WEST, player5Phase, 31, SpringLayout.EAST, player5Check);
		baseLayout.putConstraint(SpringLayout.NORTH, player4Phase, 304, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, player4Phase, 0, SpringLayout.WEST, player1Phase);
		baseLayout.putConstraint(SpringLayout.SOUTH, player3Phase, -42, SpringLayout.NORTH, player4Phase);
		baseLayout.putConstraint(SpringLayout.WEST, player3Phase, 0, SpringLayout.WEST, player1Phase);
		baseLayout.putConstraint(SpringLayout.SOUTH, player2Phase, -42, SpringLayout.NORTH, player3Phase);
		baseLayout.putConstraint(SpringLayout.WEST, player2Phase, 0, SpringLayout.WEST, player1Phase);
		baseLayout.putConstraint(SpringLayout.SOUTH, player1Phase, -42, SpringLayout.NORTH, player2Phase);
		baseLayout.putConstraint(SpringLayout.EAST, player1Phase, -397, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.EAST, player1Check, -31, SpringLayout.WEST, player1Phase);
		baseLayout.putConstraint(SpringLayout.NORTH, player8Check, 299, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, player8Check, 0, SpringLayout.WEST, player5Check);
		baseLayout.putConstraint(SpringLayout.SOUTH, player7Check, -35, SpringLayout.NORTH, player8Check);
		baseLayout.putConstraint(SpringLayout.SOUTH, player1Check, -35, SpringLayout.NORTH, player2Check);
		baseLayout.putConstraint(SpringLayout.NORTH, player4Check, 299, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, player5Check, 31, SpringLayout.EAST, player5Points);
		baseLayout.putConstraint(SpringLayout.WEST, player6Check, 0, SpringLayout.WEST, player5Check);
		baseLayout.putConstraint(SpringLayout.SOUTH, player5Check, -35, SpringLayout.NORTH, player6Check);
		baseLayout.putConstraint(SpringLayout.WEST, player7Check, 0, SpringLayout.WEST, player5Check);
		baseLayout.putConstraint(SpringLayout.SOUTH, player6Check, -35, SpringLayout.NORTH, player7Check);
		baseLayout.putConstraint(SpringLayout.NORTH, player8Entry, 299, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, player4Entry, 299, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, player5, -31, SpringLayout.WEST, player5Entry);
		baseLayout.putConstraint(SpringLayout.WEST, player5Entry, 465, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, player3Points, -42, SpringLayout.NORTH, player4Points);
		baseLayout.putConstraint(SpringLayout.SOUTH, player5Points, -42, SpringLayout.NORTH, player6Points);
		baseLayout.putConstraint(SpringLayout.SOUTH, player6Points, -42, SpringLayout.NORTH, player7Points);
		baseLayout.putConstraint(SpringLayout.SOUTH, player7Points, -42, SpringLayout.NORTH, player8Points);
		baseLayout.putConstraint(SpringLayout.NORTH, player8Points, 304, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, addPointsC1, 123, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, phaseC1, 0, SpringLayout.SOUTH, addPointsC1);
		baseLayout.putConstraint(SpringLayout.SOUTH, pointsC1, 0, SpringLayout.SOUTH, addPointsC1);
		baseLayout.putConstraint(SpringLayout.SOUTH, completePC1, 0, SpringLayout.SOUTH, addPointsC1);
		baseLayout.putConstraint(SpringLayout.WEST, phaseC1, 6, SpringLayout.EAST, completePC1);
		baseLayout.putConstraint(SpringLayout.EAST, phaseC1, 57, SpringLayout.EAST, completePC1);
		baseLayout.putConstraint(SpringLayout.WEST, completePC1, 232, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, completePC1, -417, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, phaseC2, -59, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, phaseC2, 0, SpringLayout.SOUTH, addPointsC1);
		baseLayout.putConstraint(SpringLayout.EAST, phaseC2, 0, SpringLayout.EAST, scoreRound);
		baseLayout.putConstraint(SpringLayout.SOUTH, pointsC2, 0, SpringLayout.SOUTH, addPointsC1);
		baseLayout.putConstraint(SpringLayout.EAST, pointsC2, -58, SpringLayout.WEST, phaseC2);
		baseLayout.putConstraint(SpringLayout.WEST, addPointsC2, 140, SpringLayout.EAST, phaseC1);
		baseLayout.putConstraint(SpringLayout.EAST, addPointsC2, -24, SpringLayout.WEST, pointsC2);
		baseLayout.putConstraint(SpringLayout.SOUTH, addPointsC2, 0, SpringLayout.SOUTH, addPointsC1);
		baseLayout.putConstraint(SpringLayout.WEST, completePC2, 6, SpringLayout.EAST, pointsC2);
		baseLayout.putConstraint(SpringLayout.SOUTH, completePC2, 0, SpringLayout.SOUTH, addPointsC1);
		baseLayout.putConstraint(SpringLayout.EAST, completePC2, 57, SpringLayout.EAST, pointsC2);
		baseLayout.putConstraint(SpringLayout.EAST, player2, 0, SpringLayout.EAST, player1);
		baseLayout.putConstraint(SpringLayout.EAST, player3, 0, SpringLayout.EAST, player1);
		baseLayout.putConstraint(SpringLayout.EAST, player4, 0, SpringLayout.EAST, player1);
		baseLayout.putConstraint(SpringLayout.EAST, player6, 0, SpringLayout.EAST, player5);
		baseLayout.putConstraint(SpringLayout.EAST, player7, 0, SpringLayout.EAST, player5);
		baseLayout.putConstraint(SpringLayout.EAST, player8, 0, SpringLayout.EAST, player5);
		baseLayout.putConstraint(SpringLayout.WEST, pointsC2, -7, SpringLayout.WEST, player5Points);
		baseLayout.putConstraint(SpringLayout.NORTH, player1Entry, 125, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, player3Entry, -32, SpringLayout.NORTH, player4Entry);
		baseLayout.putConstraint(SpringLayout.NORTH, player5Entry, 14, SpringLayout.SOUTH, addPointsC2);
		baseLayout.putConstraint(SpringLayout.WEST, player5Points, 31, SpringLayout.EAST, player5Entry);
		baseLayout.putConstraint(SpringLayout.NORTH, player5, 5, SpringLayout.NORTH, player5Entry);
		baseLayout.putConstraint(SpringLayout.WEST, player6Points, 31, SpringLayout.EAST, player6Entry);
		baseLayout.putConstraint(SpringLayout.NORTH, player6, 5, SpringLayout.NORTH, player6Entry);
		baseLayout.putConstraint(SpringLayout.WEST, player6Entry, 465, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, player6Entry, -32, SpringLayout.NORTH, player7Entry);
		baseLayout.putConstraint(SpringLayout.WEST, player7Points, 31, SpringLayout.EAST, player7Entry);
		baseLayout.putConstraint(SpringLayout.NORTH, player7, 5, SpringLayout.NORTH, player7Entry);
		baseLayout.putConstraint(SpringLayout.WEST, player7Entry, 465, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, player7Entry, -32, SpringLayout.NORTH, player8Entry);
		baseLayout.putConstraint(SpringLayout.WEST, player8Points, 31, SpringLayout.EAST, player8Entry);
		baseLayout.putConstraint(SpringLayout.NORTH, player8, 5, SpringLayout.NORTH, player8Entry);
		baseLayout.putConstraint(SpringLayout.WEST, player8Entry, 465, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, player1Points, -31, SpringLayout.WEST, player1Check);
		baseLayout.putConstraint(SpringLayout.EAST, player7Points, -31, SpringLayout.WEST, player7Check);
		baseLayout.putConstraint(SpringLayout.EAST, player2Check, -31, SpringLayout.WEST, player2Phase);
		baseLayout.putConstraint(SpringLayout.EAST, player3Check, -31, SpringLayout.WEST, player3Phase);
		baseLayout.putConstraint(SpringLayout.EAST, player3Check, -31, SpringLayout.WEST, player3Phase);
		baseLayout.putConstraint(SpringLayout.EAST, pointsC1, -6, SpringLayout.WEST, completePC1);
		baseLayout.putConstraint(SpringLayout.EAST, addPointsC1, -534, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, pointsC1, 26, SpringLayout.EAST, addPointsC1);
		baseLayout.putConstraint(SpringLayout.NORTH, player1, 130, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, player3, -42, SpringLayout.NORTH, player4);
		baseLayout.putConstraint(SpringLayout.NORTH, player4, 304, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, player2, 0, SpringLayout.NORTH, player6);
		baseLayout.putConstraint(SpringLayout.NORTH, player1Points, 19, SpringLayout.SOUTH, pointsC1);
		baseLayout.putConstraint(SpringLayout.WEST, player2Points, 0, SpringLayout.WEST, player1Points);
		baseLayout.putConstraint(SpringLayout.SOUTH, player2Points, -42, SpringLayout.NORTH, player3Points);
		baseLayout.putConstraint(SpringLayout.NORTH, player4Points, 42, SpringLayout.SOUTH, player3);
		baseLayout.putConstraint(SpringLayout.WEST, player4Points, 0, SpringLayout.WEST, player3Points);
		baseLayout.putConstraint(SpringLayout.EAST, player1, -40, SpringLayout.WEST, player1Entry);
		baseLayout.putConstraint(SpringLayout.SOUTH, addPointsC1, -14, SpringLayout.NORTH, player1Entry);
		baseLayout.putConstraint(SpringLayout.EAST, player1Entry, -31, SpringLayout.WEST, player1Points);
		baseLayout.putConstraint(SpringLayout.NORTH, player2Entry, -5, SpringLayout.NORTH, player2);
		baseLayout.putConstraint(SpringLayout.WEST, player2Entry, 0, SpringLayout.WEST, player1Entry);
		baseLayout.putConstraint(SpringLayout.EAST, player3Entry, -31, SpringLayout.WEST, player3Points);
		baseLayout.putConstraint(SpringLayout.WEST, player4Entry, 0, SpringLayout.WEST, player3Entry);
		baseLayout.putConstraint(SpringLayout.SOUTH, player2Check, -35, SpringLayout.NORTH, player3Check);
		baseLayout.putConstraint(SpringLayout.EAST, player3Points, -31, SpringLayout.WEST, player3Check);
		baseLayout.putConstraint(SpringLayout.NORTH, player3Check, 241, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, player4Check, 0, SpringLayout.WEST, player3Check);
		
	}
	
	private void setupGUI()
	{
		roundNumber.setForeground(Color.WHITE);
		pointsC1.setOpaque(false);
		addPointsC1.setOpaque(false);
		completePC1.setOpaque(false);
		phaseC2.setOpaque(false);
		pointsC2.setOpaque(false);
		addPointsC2.setOpaque(false);
		completePC2.setOpaque(false);
		phaseC1.setOpaque(false);
		player8Phase.setForeground(Color.WHITE);
		player6Phase.setForeground(Color.WHITE);
		player5Phase.setForeground(Color.WHITE);
		player4Phase.setForeground(Color.WHITE);
		player2Phase.setForeground(Color.WHITE);
		player3Phase.setForeground(Color.WHITE);
		player1Phase.setForeground(Color.WHITE);
		player4Points.setForeground(Color.WHITE);
		player5Points.setForeground(Color.WHITE);
		player6Points.setForeground(Color.WHITE);
		player1Points.setForeground(Color.WHITE);
		player2Points.setForeground(Color.WHITE);
		player3Points.setForeground(Color.WHITE);
		player7Phase.setForeground(Color.WHITE);
		player7Points.setForeground(Color.WHITE);
		player8Points.setForeground(Color.WHITE);
		player1.setForeground(Color.WHITE);
		player2.setForeground(Color.WHITE);
		player3.setForeground(Color.WHITE);
		player4.setForeground(Color.WHITE);
		player5.setForeground(Color.WHITE);
		player6.setForeground(Color.WHITE);
		player7.setForeground(Color.WHITE);
		player8.setForeground(Color.WHITE);
		phaseC1.setEditable(false);
		phaseC1.setLineWrap(true);
		phaseC1.setWrapStyleWord(true);
		phaseC1.setColumns(1);
		phaseC1.setRows(2);
		phaseC1.setFont(new Font("Lucida Grande", Font.PLAIN, 8));
		phaseC1.setForeground(Color.WHITE);
		pointsC1.setEditable(false);
		pointsC1.setColumns(1);
		pointsC1.setRows(2);
		pointsC1.setWrapStyleWord(true);
		pointsC1.setLineWrap(true);
		pointsC1.setFont(new Font("Lucida Grande", Font.PLAIN, 8));
		pointsC1.setForeground(Color.WHITE);
		addPointsC1.setEditable(false);
		addPointsC1.setFont(new Font("Lucida Grande", Font.PLAIN, 8));
		addPointsC1.setForeground(Color.WHITE);
		addPointsC1.setWrapStyleWord(true);
		addPointsC1.setRows(2);
		addPointsC1.setColumns(1);
		addPointsC1.setLineWrap(true);
		completePC1.setEditable(false);
		completePC1.setLineWrap(true);
		completePC1.setWrapStyleWord(true);
		completePC1.setColumns(1);
		completePC1.setRows(2);
		completePC1.setFont(new Font("Lucida Grande", Font.PLAIN, 8));
		completePC1.setForeground(Color.WHITE);
		phaseC2.setEditable(false);
		phaseC2.setLineWrap(true);
		phaseC2.setWrapStyleWord(true);
		phaseC2.setColumns(1);
		phaseC2.setRows(2);
		phaseC2.setFont(new Font("Lucida Grande", Font.PLAIN, 8));
		phaseC2.setForeground(Color.WHITE);
		pointsC2.setEditable(false);
		pointsC2.setColumns(1);
		pointsC2.setRows(2);
		pointsC2.setWrapStyleWord(true);
		pointsC2.setLineWrap(true);
		pointsC2.setFont(new Font("Lucida Grande", Font.PLAIN, 8));
		pointsC2.setForeground(Color.WHITE);
		addPointsC2.setEditable(false);
		addPointsC2.setFont(new Font("Lucida Grande", Font.PLAIN, 8));
		addPointsC2.setForeground(Color.WHITE);
		addPointsC2.setWrapStyleWord(true);
		addPointsC2.setRows(2);
		addPointsC2.setColumns(1);
		addPointsC2.setLineWrap(true);
		completePC2.setEditable(false);
		completePC2.setLineWrap(true);
		completePC2.setWrapStyleWord(true);
		completePC2.setColumns(1);
		completePC2.setRows(2);
		completePC2.setFont(new Font("Lucida Grande", Font.PLAIN, 8));
		completePC2.setForeground(Color.WHITE);
	}
	
	private void setupListeners()
	{
		scoreRound.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				round += 1;
				roundNumber.setText("ROUND " + round);
				
				//Points
				int [] roundPoints = new int [8];
				
				for(Component temp : getComponents())
				{
					if(temp instanceof JTextField)
					{
						if(((JTextField) temp).getText().equals(""))
						{
							((JTextField) temp).setText("0");
						}
					}
				}
				
				roundPoints[0] = Integer.parseInt(player1Entry.getText());
				roundPoints[1] = Integer.parseInt(player2Entry.getText());
				roundPoints[2] = Integer.parseInt(player3Entry.getText());
				roundPoints[3] = Integer.parseInt(player4Entry.getText());
				roundPoints[4] = Integer.parseInt(player5Entry.getText());
				roundPoints[5] = Integer.parseInt(player6Entry.getText());
				roundPoints[6] = Integer.parseInt(player7Entry.getText());
				roundPoints[7] = Integer.parseInt(player8Entry.getText());
				
				baseController.givePoints(roundPoints);
				
				player1Points.setText(Integer.toString(baseController.getPoints()[0]));
				player2Points.setText(Integer.toString(baseController.getPoints()[1]));
				player3Points.setText(Integer.toString(baseController.getPoints()[2]));
				player4Points.setText(Integer.toString(baseController.getPoints()[3]));
				player5Points.setText(Integer.toString(baseController.getPoints()[4]));
				player6Points.setText(Integer.toString(baseController.getPoints()[5]));
				player7Points.setText(Integer.toString(baseController.getPoints()[6]));
				player8Points.setText(Integer.toString(baseController.getPoints()[7]));
				
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
				
				//Phases
				boolean [] passedPhase = new boolean [8];
				
				passedPhase[0] = player1Check.isSelected();
				passedPhase[1] = player2Check.isSelected();
				passedPhase[2] = player3Check.isSelected();
				passedPhase[3] = player4Check.isSelected();
				passedPhase[4] = player5Check.isSelected();
				passedPhase[5] = player6Check.isSelected();
				passedPhase[6] = player7Check.isSelected();
				passedPhase[7] = player8Check.isSelected();
				
				baseController.givePhases(passedPhase);
				
				player1Phase.setText(Integer.toString(baseController.getPhase()[0]));
				player2Phase.setText(Integer.toString(baseController.getPhase()[1]));
				player3Phase.setText(Integer.toString(baseController.getPhase()[2]));
				player4Phase.setText(Integer.toString(baseController.getPhase()[3]));
				player5Phase.setText(Integer.toString(baseController.getPhase()[4]));
				player6Phase.setText(Integer.toString(baseController.getPhase()[5]));
				player7Phase.setText(Integer.toString(baseController.getPhase()[6]));
				player8Phase.setText(Integer.toString(baseController.getPhase()[7]));
				
				player1Check.setSelected(false);
				player2Check.setSelected(false);
				player3Check.setSelected(false);
				player4Check.setSelected(false);
				player5Check.setSelected(false);
				player6Check.setSelected(false);
				player7Check.setSelected(false);
				player8Check.setSelected(false);
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
		
		manualOverride.addActionListener(new ActionListener()	
		{
			public void actionPerformed(ActionEvent clicked)
			{
				ManualOverride mo = new ManualOverride(baseController);
				baseController.getFrame().getContentPane().removeAll();
				baseController.getFrame().setContentPane(mo);
				baseController.getFrame().validate();
				repaint();
			}
		});
	}
	
	//I like the idea of a score card
	//good code in general-easy to understand and clean
}