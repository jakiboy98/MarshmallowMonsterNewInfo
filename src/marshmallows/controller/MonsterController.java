package marshmallows.controller;

import marshmallows.model.MarshmallowMonster;
import marshmallows.view.MarshmallowOutput;
import java.util.Scanner;

public class MonsterController
{
	private MarshmallowMonster Homunculus;
	private MarshmallowOutput myOutput;
	private Scanner monsterScanner;
	
	public MonsterController()
	{
		int eyes = 3;
		double legs = 4;
		double hair = 1;
		int noses = 1;
		boolean hasBellyButton = false;
		double arms = 2;
		String name = "Father";
		
		monsterScanner = new Scanner(System.in);
		myOutput = new MarshmallowOutput();
		Homunculus = new MarshmallowMonster(name, eyes, noses, hair, legs, hasBellyButton, arms);
	}
	
	public void start()
	{
		myOutput.displayMonsterInfo(Homunculus.toString());
		askQuestions();
		myOutput.displayMonsterInfo("New Monster Info " + Homunculus.toString());
		System.out.println("Type in a different number of eyes for the monster");
		int newMonsterEyes = monsterScanner.nextInt();
		Homunculus.setMonsterEyes(newMonsterEyes);
	}
	
	private void askQuestions()
	{
		System.out.println("Type in a name for the homunculus ");
		String newMonsterName = monsterScanner.next();
		Homunculus.setMonsterName(newMonsterName);
	}
}
