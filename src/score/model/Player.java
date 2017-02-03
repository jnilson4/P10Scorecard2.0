package score.model;

public class Player
{
	private String name;
	private int points;
	private int phase;
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public int getPoints()
	{
		return points;
	}
	
	public void setPoints(int points)
	{
		this.points = points;
	}
	
	public int getPhase()
	{
		return phase;
	}
	
	public void setPhase(int phase)
	{
		this.phase = phase;
	}
}
