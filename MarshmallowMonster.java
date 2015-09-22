package marshmallows.model;

public class MarshmallowMonster 
{

	private String monsterName;
	private int monsterEyes;
	private int monsterNoses;
	private double monsterHair;
	private double monsterLegs;
	private boolean monsterBellyButton;
	private double monsterArms;
	
	
	public MarshmallowMonster(String monstername, int monsterEyes)
	{
		
	}	
	
	public MarshmallowMonster(String monsterName, int monsterEyes, int monsterNoses, double monsterHair, double monsterLegs, boolean monsterBellyButton, double monsterArms)
	{
		this.monsterName = monsterName;
		this.monsterEyes = monsterEyes;
		this.monsterNoses = monsterNoses;
		this.monsterHair = monsterHair;
		this.monsterLegs = monsterLegs;
		this.monsterBellyButton = monsterBellyButton;
		this.monsterArms = monsterArms;
	}

	//Getters & Setters
	public String getMonsterName()
	{
		return monsterName;
	}
	
	public int getMonsterEyes()
	{
		return monsterEyes;
	}
	
	public int getmonsterNoses()
	{
		return monsterNoses;
	}
	
	public double getmonsterHair()
	{
		return monsterHair;
	}
	
	public double getmonsterLegs()
	{
		return monsterLegs;
	}
	
	public boolean getmonsterBellyButton()
	{
		return monsterBellyButton;
	}
	
	public double getmonsterArms()
	{
		return monsterArms;
	}
	
	public void setMonsterName(String monsterName)
	{
		this.monsterName = monsterName;
	}
	
	public void setMonsterEyes(int monsterEyes)
	{
		this.monsterEyes = monsterEyes;
	}
	
	public void setMonsterNoses(int monsterNoses)
	{
		this.monsterNoses = monsterNoses;
	}
	
	public void setMonsterHair(double monsterHair)
	{
		this.monsterHair = monsterHair;
	}
	
	public void setMonsterLegs(double monsterLegs)
	{
		this.monsterLegs = monsterLegs;
	}
	//finish the rest of the code
	public String toString()
	{
		String monster = "This monster has " + monsterEyes + "eyes, and its name is " + monsterName;
		
		return monster;
	}
}

