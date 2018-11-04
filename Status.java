package MP;
public class Status {
	public int nHealth;
	public int nAtk;
	public int nDef;
	public int nSpd;
	
	public Status (int nHealth, int nAtk, int nDef, int nSpd){
		this.nAtk = nAtk;
		this.nHealth = nHealth;
		this.nDef = nDef;
		this.nSpd = nSpd;
	}
	public int getHealth() {
		return nHealth;
	}
	public void setHealth(int nHealth) {
		this.nHealth = nHealth;
	}
	public int getAtk() {
		return nAtk;
	}
	public void setAtk(int nAtk) {
		this.nAtk = nAtk;
	}
	public int getDef() {
		return nDef;
	}
	public void setDef(int nDef) {
		this.nDef = nDef;
	}
	public int getSpd() {
		return nSpd;
	}
	public void setSpd(int nSpd) {
		this.nSpd = nSpd;
	}
	

}
