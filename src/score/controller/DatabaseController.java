package score.controller;

//import javax.swing.JOptionPane;
import java.sql.*;

public class DatabaseController
{
//	private String connectionString;
//	private Connection databaseConnection;
//	private ScoreController baseController;
//	
//	public DatabaseController(ScoreController baseController)
//	{
//		this.baseController = baseController;
//		this.connectionString = "";
//		checkDriver();
//		setupConnection();
//	}
//	
//	private void checkDriver()	
//	{
//		try
//		{
//			Class.forName("com.mysql.jbdc.Driver");
//		}
//		catch(Exception currentException)
//		{
//			displayErrors(currentException);
//			System.exit(1);
//		}
//	}
//	
//	private void setupConnection()
//	{
//		try
//		{
//			databaseConnection = DriverManager.getConnection(connectionString);
//		}
//		catch(SQLException currentException)
//		{
//			displayErrors(currentException);
//		}
//	}
//	
//	public void displayErrors(Exception currentException)
//	{
//		JOptionPane.showMessageDialog(baseController.getFrame(), "Excption: " + currentException.getMessage());
//		if(currentException instanceof SQLException)
//		{
//			JOptionPane.showMessageDialog(baseController.getFrame(), "SQL State: " + ((SQLException) currentException).getSQLState());
//			JOptionPane.showMessageDialog(baseController.getFrame(), "SQL Error Code: " + ((SQLException) currentException).getErrorCode());
//		}
//	}
}
