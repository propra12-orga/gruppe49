

public class BombEntity extends Entity {
	/**
	 * 
	 * @param src Pfad zum Bomben Bild
	 * @param x	X Position der Bombe
	 * @param y Y Position des Bombe
	 */
	/*
	 * Hier wird von der Entity Klasse geerbt und mit Hilfe der BombEntity inizialisiert
	 */
	private boolean isAlive;
	public BombEntity(String src, double x, double y,boolean isAlive) {
		super(src, x, y);
		this.isAlive=isAlive;
		
	}
	
	public boolean getIsAlive(){
		return isAlive;
	}
	
	public void setIsAlive(boolean isAlive){
		this.isAlive=isAlive;
	}


	
}
