package score.view;

import javax.swing.JOptionPane;

public class ScoreViewer
{
	public String windowMessage;
	
	public ScoreViewer()
	{
		windowMessage = "Phase 10 Scorecard";
	}
	
	public void displayMessage(String message)
	{
		JOptionPane.showMessageDialog(null, message, windowMessage, JOptionPane.PLAIN_MESSAGE, null);
	}
}
