package marshmallows.controller;

import marshmallows.model.MarshmallowMonster;
import marshmallows.view.MarshmallowOutput;

public class MonsterController
{
	private MarshmallowMonster Homunculus;
	private MarshmallowOutput myOutput;
	
	public MonsterController()
	{
		int eyes = 3;
		double legs = 4;
		double hair = 1;
		int noses = 1;
		boolean hasBellyButton = false;
		double arms = 2;
		String name = "Father";
		
		myOutput = new MarshmallowOutput();
		Homunculus = new MarshmallowMonster(name, eyes, noses, hair, legs, hasBellyButton, arms);
	}
	
	public void start()
	{
		myOutput.displayMonsterInfo(Homunculus.toString());
	}
}
