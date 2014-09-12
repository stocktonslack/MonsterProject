package monsters.view;

import javax.swing.JOptionPane;

import monsters.controller.MonsterAppController;

public class MonsterView
{
	private MonsterAppController baseController;
	public MonsterView(MonsterAppController baseController)
	{
		this.baseController = baseController;
	}
	
	public void displayInformation()
	{
		JOptionPane.showMessageDialog(null, "I made a monster!!!");
		JOptionPane.showMessageDialog(null, "It's name is " + baseController.getMyMonster().getName());
		JOptionPane.showMessageDialog(null, "It has" + baseController.getMyMonster().getHairCount()+ "Hairs");
		JOptionPane.showMessageDialog(null, "It also has " + baseController.getMyMonster().getNumberOfLegs() + " Legs");
		JOptionPane.showMessageDialog(null, "My monster has the best " + 
		
	}
}
