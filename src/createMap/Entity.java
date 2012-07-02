package createMap;


public class Entity {

	protected double x;
	protected double y;
	protected Sprite sprite;
	
	
	public final static int Default_Movement_On_X =50;
	public final static int Default_Movement_On_Y =50;
	
	/**
	 * 
	 * @param src holt das bild mithilfe der Sprite Klasse und speicherd es ab 
	 * @param x  Setzt die X Position von dem Entity Objekt
	 * @param y  Setzt Y Position von dem Entity Objekt
	 */
	public Entity(String src, double x, double y){
		sprite = SpriteManager.manager.getSprite(src);
		this.x=x;
		this.y=y;
	}
	
	
	/**
	 * 
	 * @return gibt das Sprite zurück
	 */
	public Sprite getSprite() {
		return sprite;
	}
	
	public int getX() {
		return (int)x;
	}
	
	public int getY() {
		return (int)y;
	}
	
	public void setX(int x){
		this.x=x;
	}

	
	public void setY(int y){
		this.y=y;
	}
	
	
}
