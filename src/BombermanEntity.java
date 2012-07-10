

public class BombermanEntity extends Entity {
	/**
	 * 
	 * @param src Pfad zum Bomberman Bild
	 * @param x	X Position des Bombermans
	 * @param y Y Position des Bombermans
	 */
	/*
	 * Hier wird von der Entity Klasse geerbt und mit hilfe der BombermanEntity inizialisiert
	 */
	private String spieler;
	public BombermanEntity(String src, double x, double y ,String spieler) {
		super(src, x, y);	
		this.setSpieler(spieler);
	}
	public String getSpieler() {
		return spieler;
	}
	public void setSpieler(String spieler) {
		this.spieler = spieler;
	}
	
	

}
