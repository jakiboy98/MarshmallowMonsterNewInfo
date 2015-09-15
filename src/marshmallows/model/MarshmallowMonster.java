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
	
	private MarshmallowMonster();
	
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
	
	public int getmonsterNoses;
	{
		return monsterNoses;
	}
	
	public int getmonsterHair;
	{
		return monsterHair;
	}
	
	public int getmonsterLegs;
	{
		return monsterLegs;
	}
	
	public int getmonsterBellyButton;
	{
		return monsterBellyButton;
	}
	
	public int getmonsterArms;
	{
		return monsterArms;
	}
	
	public void setMonsterName(String monsterName);
	{
		this.monsterName = monsterName;
	}
	
	public void setMonsterEyes(String monsterEyes);
	{
		this.monsterEyes = monsterEyes;
	}
	
	public void setMonsterNoses(String monsterNoses);
	{
		this.monsterNoses = monsterNoses;
	}
	
	public void setMonsterHair(String monsterHair);
	{
		this.monsterHair = monsterHair;
	}
	
	public void setMonsterLegs(String monsterLegs);
	{
		this.monsterLegs = monsterLegs
	}
	public String toString()
	{
		String monster = "This monster has " + monsterEyes + "eyes, and its name is " + monsterName;
		
		return monster;
	}
}

