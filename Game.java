package MP;
import java.util.*;
public class Game {
	
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int Play_Game = 0;
		Warrior warrior1 = new Warrior();
		int PlayerTurn = 0;
		int EnemyTurn = 0;
		
		System.out.println("Input Name of Warrior: ");
		warrior1.setName();
		
		
		System.out.println("Choose Armor 1[Light],2[Medium],3[Heavy]:");
		int input = scn.nextInt();
		if(input == 1){
			warrior1.addLightArmor();
			System.out.println("Light Armor Equipped");
		}
		
		if(input == 2){
			warrior1.addMediumArmor();
			System.out.println("Medium Armor Equipped");
		}
		
		if(input == 3){
			warrior1.addHeavyArmor();
			System.out.println("Heavy Armor Equipped");
		}
		
		
		
		System.out.println("Choose Weapon 1[Dagger],2[Sword],3[BattleAxe]:");
		input = scn.nextInt();
		if(input == 1){
			warrior1.addDagger();
			System.out.println("Dagger Equipped");
		}
		if(input == 2){
			warrior1.addSword();
			System.out.println("Sword Equipped");
		}
		if(input == 3){
			warrior1.addBattleAxe();
			System.out.println("BattleAxe Equipped");
		}
		
		
		System.out.println("Choose Opponent 1[Thief],2[Viking],3[Minotaur]");
		input = scn.nextInt();
		int EnemyType = input;
		
		
		
		System.out.println("Choose Environment 1[Arena],2[Swamp],3[Colosseum]:");
		input = scn.nextInt();
		
		if(input == 1){
			warrior1.chooseArena();
		}
		if(input == 2){
			warrior1.chooseSwamp(PlayerTurn, EnemyTurn, EnemyType);
		}
		if(input == 3){
			warrior1.chooseColosseum(PlayerTurn, EnemyTurn, EnemyType);
		}
		warrior1.Warrior.nDef = 999; //Testing 
		warrior1.ViewStats();
		
	}

}
