package createMap;

public class BombermanEntity extends Entity {
	/**
	 * 
	 * @param src Phad zum Bomberman Bild
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
	/**
	 * 
	 * @return string Spieler gibt spieler als string zurück
	 */
	public String getSpieler() {
		return spieler;
	}
	/**
	 * 
	 * @param spieler string spieler setzt spieler bezeichnung
	 */
	public void setSpieler(String spieler) {
		this.spieler = spieler;
	}
	
	

}