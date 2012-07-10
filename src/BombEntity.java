

public class BombEntity extends Entity {
	/**
	 * 
	 * @param src Phad zum Bomben Bild
	 * @param x	X Position der Bombe
	 * @param y Y Position des Bombe
	 */
	/*
	 * Hier wird von der Entity Klasse geerbt und mit hilfe der BombEntity inizialisiert
	 */
	private boolean isAlive;
	public BombEntity(String src, double x, double y,boolean isAlive) {
		super(src, x, y);
		this.isAlive=isAlive;
		
	}
	/**
	 * 
	 * @return boolean isAlive git den Lebensstatus von Bomberman wieder
	 */
	
	public boolean getIsAlive(){
		return isAlive;
	}
	/**
	 * 
	 * @param isAlive setzt den Lebensstatus
	 */
	public void setIsAlive(boolean isAlive){
		this.isAlive=isAlive;
	}


	
}
