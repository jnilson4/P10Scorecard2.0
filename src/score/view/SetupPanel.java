package score.view;

import javax.swing.*;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import score.controller.ScoreController;
import java.awt.Font;
import java.awt.event.*;
import java.awt.Container;
import java.util.Vector;

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
	
	private JTextArea setupInstructions;
	
	private ScorePanelTraversalPolicy newPolicy;
	
	public SetupPanel(ScoreController baseController)
	{
		super();
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		
		this.backgroundImage = new ImageIcon(getClass().getResource("/score/view/images/p10bg.jpg"));
		this.imageText = new JLabel(" ", backgroundImage, JLabel.CENTER);
		
		this.player1Label = new JLabel("Player 1");
		baseLayout.putConstraint(SpringLayout.NORTH, player1Label, 140, SpringLayout.NORTH, this);
		this.player2Label = new JLabel("Player 2");
		baseLayout.putConstraint(SpringLayout.NORTH, player2Label, 55, SpringLayout.NORTH, player1Label);
		this.player3Label = new JLabel("Player 3");
		baseLayout.putConstraint(SpringLayout.NORTH, player3Label, 55, SpringLayout.NORTH, player2Label);
		this.player4Label = new JLabel("Player 4");
		baseLayout.putConstraint(SpringLayout.NORTH, player4Label, 55, SpringLayout.NORTH, player3Label);
		this.player5Label = new JLabel("Player 5");
		baseLayout.putConstraint(SpringLayout.NORTH, player5Label, 0, SpringLayout.NORTH, player1Label);
		this.player6Label = new JLabel("Player 6");
		baseLayout.putConstraint(SpringLayout.NORTH, player6Label, 0, SpringLayout.NORTH, player2Label);
		baseLayout.putConstraint(SpringLayout.EAST, player6Label, -213, SpringLayout.EAST, this);
		this.player7Label = new JLabel("Player 7");
		baseLayout.putConstraint(SpringLayout.NORTH, player7Label, 0, SpringLayout.NORTH, player3Label);
		baseLayout.putConstraint(SpringLayout.EAST, player7Label, -213, SpringLayout.EAST, this);
		this.player8Label = new JLabel("Player 8");
		baseLayout.putConstraint(SpringLayout.NORTH, player8Label, 0, SpringLayout.NORTH, player4Label);
		
		this.player1Box = new JTextField(4);
		baseLayout.putConstraint(SpringLayout.NORTH, player1Box, -5, SpringLayout.NORTH, player1Label);
		this.player2Box = new JTextField(4);
		baseLayout.putConstraint(SpringLayout.NORTH, player2Box, -5, SpringLayout.NORTH, player2Label);
		this.player3Box = new JTextField(4);
		baseLayout.putConstraint(SpringLayout.NORTH, player3Box, -5, SpringLayout.NORTH, player3Label);
		this.player4Box = new JTextField(4);
		baseLayout.putConstraint(SpringLayout.NORTH, player4Box, -5, SpringLayout.NORTH, player4Label);
		baseLayout.putConstraint(SpringLayout.WEST, player4Box, 203, SpringLayout.WEST, this);
		this.player5Box = new JTextField(4);
		baseLayout.putConstraint(SpringLayout.NORTH, player5Box, -5, SpringLayout.NORTH, player1Label);
		this.player6Box = new JTextField(4);
		baseLayout.putConstraint(SpringLayout.NORTH, player6Box, -5, SpringLayout.NORTH, player2Label);
		this.player7Box = new JTextField(4);
		baseLayout.putConstraint(SpringLayout.NORTH, player7Box, -5, SpringLayout.NORTH, player3Label);
		baseLayout.putConstraint(SpringLayout.SOUTH, player7Box, 0, SpringLayout.SOUTH, player3Box);
		this.player8Box = new JTextField(4);
		baseLayout.putConstraint(SpringLayout.NORTH, player8Box, -5, SpringLayout.NORTH, player4Label);
		
		this.nextButton = new JButton("Continue to Scorecard");
		this.submitNames = new JButton("Submit Names");
	
		this.setupInstructions = new JTextArea("Enter in the players names next to the corresponding box. Once the names have been entered, press submit names and the names will change on the left of the box.");
		
		this.helpButton = new ImageIcon(getClass().getResource("/score/view/images/questionMark2.png"));
		this.imageText1 = new JLabel(" ", helpButton, JLabel.CENTER);
		
		Vector<Component> stuff = new Vector<Component>();
		stuff.add(player1Box);
		stuff.add(player2Box);
		stuff.add(player3Box);
		stuff.add(player4Box);
		stuff.add(player5Box);
		stuff.add(player6Box);
		stuff.add(player7Box);
		stuff.add(player8Box);
		newPolicy = new ScorePanelTraversalPolicy(stuff);
		baseController.getFrame().setFocusTraversalPolicy(newPolicy);
		
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
		this.add(imageText1);
		
		this.add(setupInstructions);
		
		this.add(imageText);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, player1Label, 50, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, nextButton, 0, SpringLayout.NORTH, submitNames);
		baseLayout.putConstraint(SpringLayout.WEST, submitNames, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, submitNames, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, nextButton, 0, SpringLayout.EAST, imageText1);
		baseLayout.putConstraint(SpringLayout.NORTH, imageText1, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, imageText1, -10, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, setupInstructions, 32, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, player2Label, 0, SpringLayout.WEST, player1Label);
		baseLayout.putConstraint(SpringLayout.WEST, player8Label, 0, SpringLayout.WEST, player5Label);
		baseLayout.putConstraint(SpringLayout.EAST, player8Label, 0, SpringLayout.EAST, player5Label);
		baseLayout.putConstraint(SpringLayout.WEST, player3Label, 0, SpringLayout.WEST, player1Label);
		baseLayout.putConstraint(SpringLayout.WEST, player4Label, 0, SpringLayout.WEST, player1Label);
		baseLayout.putConstraint(SpringLayout.EAST, player5Label, -213, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, player1Box, 203, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, player2Box, 203, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, player3Box, 203, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, player5Box, 99, SpringLayout.EAST, player5Label);
		baseLayout.putConstraint(SpringLayout.EAST, player5Box, -56, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, player6Box, 586, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, player6Box, -56, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.EAST, player7Box, -56, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, player8Box, 586, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, player8Box, -56, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, setupInstructions, -262, SpringLayout.SOUTH, this);
	}
	
	private void setupGUI()
	{
		player1Label.setForeground(Color.WHITE);
		player2Label.setForeground(Color.WHITE);
		player3Label.setForeground(Color.WHITE);
		player4Label.setForeground(Color.WHITE);
		player5Label.setForeground(Color.WHITE);
		player6Label.setForeground(Color.WHITE);
		player7Label.setForeground(Color.WHITE);
		player8Label.setForeground(Color.WHITE);
		imageText.setForeground(Color.WHITE);
		setupInstructions.setColumns(53);
		setupInstructions.setRows(2);
		setupInstructions.setForeground(Color.WHITE);
		setupInstructions.setOpaque(false);
		setupInstructions.setEditable(false);
		setupInstructions.setLineWrap(true);
		setupInstructions.setWrapStyleWord(true);
	}
	
	private void setupListeners()
	{
		submitNames.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{	
				String [] names = new String [8];
				
				names[0] = player1Box.getText();
				names[1] = player2Box.getText();
				names[2] = player3Box.getText();
				names[3] = player4Box.getText();
				names[4] = player5Box.getText();
				names[5] = player6Box.getText();
				names[6] = player7Box.getText();
				names[7] = player8Box.getText();
				
				player1Label.setText(names[0]);
				player2Label.setText(names[1]);
				player3Label.setText(names[2]);
				player4Label.setText(names[3]);
				player5Label.setText(names[4]);
				player6Label.setText(names[5]);
				player7Label.setText(names[6]);
				player8Label.setText(names[7]);
				
				baseController.giveNames(names);
				
				for(int i = 0; i < names.length; i++)
				{
					if(names[0].equals(""))
					{
						player1Label.setText("Player 1");
					}
					if(names[1].equals(""))
					{
						player2Label.setText("Player 2");
					}
					if(names[2].equals(""))
					{
						player3Label.setText("Player 3");
					}
					if(names[3].equals(""))
					{
						player4Label.setText("Player 4");
					}
					if(names[4].equals(""))
					{
						player5Label.setText("Player 5");
					}
					if(names[5].equals(""))
					{
						player6Label.setText("Player 6");
					}
					if(names[6].equals(""))
					{
						player7Label.setText("Player 7");
					}
					if(names[7].equals(""))
					{
						player8Label.setText("Player 8");
					}
				}
			}
		});
		
		nextButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				ScorePanel scorePanel = new ScorePanel(baseController);
				baseController.getFrame().getContentPane().removeAll();
				baseController.getFrame().setContentPane(scorePanel);
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
