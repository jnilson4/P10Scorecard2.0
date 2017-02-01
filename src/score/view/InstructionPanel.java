package score.view;

import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import score.controller.ScoreController;
import score.view.SetupPanel;
import java.awt.Font;
import java.awt.event.*;
import java.awt.Container;

public class InstructionPanel extends JPanel
{
	private SpringLayout baseLayout;
	private ScoreController baseController;
	
	private ImageIcon backgroundImage;
	private JLabel imageText;
	private JTextArea instructions;
	private JButton nextPage;
	

	public InstructionPanel(ScoreController baseController)
	{
		super();
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		
		this.nextPage = new JButton("Proceed to Setup");
		this.backgroundImage = new ImageIcon(getClass().getResource("/score/view/images/p10bg.jpg"));
		this.imageText = new JLabel(" ", backgroundImage, JLabel.CENTER);
		this.instructions = new JTextArea(15, 55);
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setPreferredSize(new Dimension(700,400));
		this.setBackground(Color.RED);
		
		this.add(nextPage);
		this.add(instructions);
		this.add(imageText);
		
		instructions.setText("Welcome to the Phase 10 Scorecard! Here are a few tips for using our scorecard!\n\n1. At the end of each round, enter in score the player got. If the player did not have any points, simply leave theirs blank. If the player passed the phase, be sure to check the \"Passed Phase\" box.\n\n2. Once you have entered in the points and checked if they passed their phase, please click score round. This will add their points and advance their phase if they passed it.\n\n3. If you enter in a score incorrectly or if you check the phase box and they didn't actually pass their phase, press on the \"Manual Override\" button. This will allow you to change the players score and phase manually. Please be careful while using this function.");
	}
	
	private void setupLayout()
	{
		instructions.setFont(new Font("PingFang HK", Font.PLAIN, 13));
		baseLayout.putConstraint(SpringLayout.SOUTH, instructions, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, instructions, -40, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, nextPage, 275, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, nextPage, -27, SpringLayout.SOUTH, this);
		instructions.setForeground(Color.WHITE);
		instructions.setEditable(false);
		instructions.setLineWrap(true);
		instructions.setWrapStyleWord(true);
		instructions.setOpaque(false);
	}
	
	private void setupListeners()
	{
		nextPage.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{	
				
				SetupPanel temp = new SetupPanel(baseController);
				baseController.getFrame().getContentPane().removeAll();
				baseController.getFrame().setContentPane(temp);
//				baseController.getFrame().invalidate();
				baseController.getFrame().validate();
//				baseController.getFrame().setContentPane(new SetupPanel(baseController));
				repaint();
			}
		});
	}
}