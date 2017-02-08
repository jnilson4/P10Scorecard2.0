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
		this.player2 = new JLabel(playerNames[1]);
		this.player3 = new JLabel(playerNames[2]);
		this.player4 = new JLabel(playerNames[3]);
		this.player5 = new JLabel(playerNames[4]);
		this.player6 = new JLabel(playerNames[5]);
		this.player7 = new JLabel(playerNames[6]);
		this.player8 = new JLabel(playerNames[7]);
		
		this.player1Points = new JTextField(4);
		this.player2Points = new JTextField(4);
		this.player3Points = new JTextField(4);
		this.player4Points = new JTextField(4);
		this.player5Points = new JTextField(4);
		this.player6Points = new JTextField(4);
		this.player7Points = new JTextField(4);
		this.player8Points = new JTextField(4);
		
		this.player1Phase = new JTextField(4);
		this.player2Phase = new JTextField(4);
		this.player3Phase = new JTextField(4);
		this.player4Phase = new JTextField(4);
		this.player5Phase = new JTextField(4);
		this.player6Phase = new JTextField(4);
		this.player7Phase = new JTextField(4);
		this.player8Phase = new JTextField(4);

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
		
		this.add(imageText1);
		
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
		baseLayout.putConstraint(SpringLayout.NORTH, imageText1, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, imageText1, -10, SpringLayout.EAST, this);
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
