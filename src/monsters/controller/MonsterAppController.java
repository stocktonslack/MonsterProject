package monsters.controller;

import monsters.model.MarshmallowMonster;
import monsters.view.MonsterView;

public class MonsterAppController
{
	private MonsterView myAppView;
	private MarshmallowMonster myMonster;
	private MarshmallowMonster otherMonster;
	
	public MonsterAppController()
	{
		myAppView = new MonsterView(this);
		myMonster = new MarshmallowMonster("Timothy", 
													4.0, // legs
													5.0, //hair
													6, //eyes
													3, //nose
													3, //arms
													true); //has bellyButton;
		otherMonster = new MarshmallowMonster ("Batman", 2.0, .5, 6, 4, 1, true);
													
													 

	}
	
	public MarshmallowMonster getMyMonster()
	{
		return myMonster;
	}
	
	public void start()
	{
		myAppView.displayInformation();
	}
}

