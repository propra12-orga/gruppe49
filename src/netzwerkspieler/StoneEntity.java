package netzwerkspieler;



public class StoneEntity extends Entity{
	/**
	 * 
	 * @param src Phad zum Stein Bild
	 * @param x	X Position des Steines
	 * @param y Y Position des Steines
	 */
	/*
	 * Hier wird von der Entity Klasse geerbt und mit hilfe der StoneEntity inizialisiert
	 */
	private boolean isBreakable;
	public StoneEntity(String src, double x, double y,boolean isBreakable) {
		super(src, x, y);
		this.setIsBreakable(isBreakable);
	}
	public boolean getIsBreakable() {
		return isBreakable;
	}
	public void setIsBreakable(boolean isBreakable) {
		this.isBreakable = isBreakable;
	}

	
}
