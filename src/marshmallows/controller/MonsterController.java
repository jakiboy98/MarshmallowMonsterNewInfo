package marshmallows.controller;

import marshmallows.model.MarshmallowMonster;
import marshmallows.view.MarshmallowOutput;
import java.util.Scanner;

public class MonsterController
{
	private MarshmallowMonster Homunculus;
	private MarshmallowOutput myOutput;
	private MarshmallowMonster userMonster;
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
		myOutput.displayMonsterGUI(Homunculus.toString());
	}
	
	private void askQuestions()
	{
		System.out.println("Type in a name for the homunculus ");
		String newMonsterName = monsterScanner.next();
		System.out.println("Give me Eyes");
		int newMonsterEyes = monsterScanner.nextInt();
		System.out.println("I needs noses");
		int newMonsterNoses = monsterScanner.nextInt();
		System.out.println("Give me hair");
		double newMonsterHair = monsterScanner.nextDouble();
		System.out.println("Give me dem legs");
		double newMonsterLegs = monsterScanner.nextDouble();
		System.out.println("I need my bellybutton");
		boolean newMonsterBellyButton = monsterScanner.nextBoolean();
		Homunculus.setMonsterName(newMonsterName);
		Homunculus.setMonsterEyes(newMonsterEyes);
		Homunculus.setMonsterNoses(newMonsterNoses);
		Homunculus.setMonsterHair(newMonsterHair);
		Homunculus.setMonsterLegs(newMonsterLegs);
		Homunculus.setMonsterBellyButton(newMosnterBellyButton);
		
	}
}
