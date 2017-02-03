package score.model;

public class Game
{
	private int gameScore;
	private Player [] player;

	public Game()
	{
		player = new Player[8];
		
		for(int i = 0; i < player.length; i++)
		{
			player[i] = new Player();
		}
	}
		
	public void setScore(int score)
	{
		this.gameScore = score;
	}
	
	public Player[] getPlayer()
	{
		return player;
	}

	public void setPlayer(Player[] player)
	{
		this.player = player;
	}
}
