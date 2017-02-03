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
		
	}
}
