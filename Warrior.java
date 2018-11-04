
package MP;
import java.util.*;
public class Warrior {
	//Armor
	Status Light = new Status(0,0,20,-5);
	Status Medium = new Status(0,0,30,-15);
	Status Heavy = new Status(0,0,40,-25);
	//Weapons
	Status Dagger = new Status(0,20,0,0);
	Status Sword = new Status(0,30,0,-10);
	Status BattleAxe = new Status(0,40,0,-20);
	//Opponents
	Status Thief = new Status(150,20,0,0);
	Status Viking = new Status(250,30,0,-10);
	Status Minotaur = new Status(350,40,0,-20);
	
	Status Warrior = new Status(100,1,1,1); //Default Status
	String sName;

//What the warrior can do:
	Scanner scn = new Scanner (System.in);
//public void setName - sets the Warrior's Name
	public void setName(){
		sName = scn.nextLine();
	}
// public void addArmor - Warrior chooses between 3 armor Light Medium Heavy, status of chosen armor increments Warrior status
	public void addLightArmor(){
		Warrior.nDef += Light.nDef;
		Warrior.nSpd += Light.nSpd;
	}
	
	public void addMediumArmor(){
		Warrior.nDef += Medium.nDef;
		Warrior.nSpd += Medium.nSpd;
	}
	
	public void addHeavyArmor(){
		Warrior.nDef += Heavy.nDef;
		Warrior.nSpd += Heavy.nSpd;
	}
//public void addWeapon - Warrior chooses between 3 weapons Dag Swo BatAxe, status of chosen wep increments Warrior status
	public void addDagger(){
		Warrior.nAtk += Dagger.nAtk;
		Warrior.nSpd += Dagger.nSpd;		
	}
	public void addSword(){
		Warrior.nAtk += Sword.nAtk;
		Warrior.nSpd += Sword.nSpd;		
	}
	public void addBattleAxe(){
		Warrior.nAtk += BattleAxe.nAtk;
		Warrior.nSpd += BattleAxe.nSpd;		
	}
	
//public void viewStats - displays the Warrior's current Health,Atk,Def,Spd values
	public void ViewStats(){
	System.out.println("Name:"+sName);
	System.out.println("Health:"+Warrior.nHealth);
	System.out.println("Attack:"+Warrior.nAtk);
	System.out.println("Defense:"+Warrior.nDef);
	System.out.println("Speed:"+Warrior.nSpd);
	}

//public void ChooseOpponent - choose Opponent to battle - Thief,Viking,Minotaur
	public void chooseThief(){
		
	}
//public void Warrior Actions - Attack Defend and Charge
	public void WarriorAtkThief(){
		int Thief_Atked_Health = Warrior.nAtk - Thief.nDef; //Thief Health after attacked
		Thief.nHealth -= Thief_Atked_Health;
	}
	public void WarriorAtkViking(){
		int Viking_Atked_Health = Warrior.nAtk - Viking.nDef; //Viking Health after attacked
		Viking.nHealth -= Viking_Atked_Health;
	}
	public void WarriorAtkMinotaur(){
		int Minotaur_Atked_Health = Warrior.nAtk - Minotaur.nDef; //Minotaur Health after attacked
		Minotaur.nHealth -= Minotaur_Atked_Health;
	}
//public void chooseEnvironment - Warrior chooses between 3 environments
	public void chooseArena(){
		
	}
	public void chooseSwamp(int PlayerTurn, int EnemyTurn,int EnemyType){
		if(PlayerTurn == 1 ){
			Warrior.nHealth--;
		}
		if (EnemyTurn == 1 && EnemyType == 1){
			Thief.nAtk++;	
		}
		if (EnemyTurn == 1 && EnemyType == 2){
			Viking.nAtk++;	
		}
		if (EnemyTurn == 1 && EnemyType == 3){
			Minotaur.nAtk++;	
		}
	}
	public void chooseColosseum(int PlayerTurn, int EnemyTurn,int EnemyType){
		if(PlayerTurn == 1){
			Warrior.nAtk++;
		}
		if (EnemyTurn == 1 && EnemyType == 1){
			Thief.nDef--;	
		}
		if (EnemyTurn == 1 && EnemyType == 2){
			Viking.nDef--;	
		}
		if (EnemyTurn == 1 && EnemyType == 3){
			Minotaur.nDef--;	
		}
	}
//All methods will be utilized on the Game Class (Main)
}
