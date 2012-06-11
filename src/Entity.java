
public class Entity {

	protected double x;
	protected double y;
	protected double mx;
	protected double my;
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
		mx=0;
		my=0;
	}
	/**
	 * 
	 * @param hm setzt Bewegung in der Horizontalen
	 */
	public void setHorizontalMovement(int hm){
		mx=hm;
	}
	/**
	 * 
	 * @param vm  setzt Bewegung in der Vertikalen
	 */
	public void setVerticalMovement(int vm){
		my=vm;
	}
	/**
	 * 
	 * @return gibt die Bewegung in der horizontale zur�ck
	 */
	public double getHorizontalMovement(){
		return mx;
	}
	/**
	 * 
	 * @return gibt die Bewegung in der vertikalen zur�ck
	 */
	public double getVerticalMovement(){
		return my;
	}
	/*
	 * Bewegt das Objekt auf der x Achse 
	 */
	public void moveOnX(){
		if(GamePanel.gp.getWidth() !=0){
			if(x+mx<0 )x=0;
			else if(x+mx>GamePanel.gp.getWidth()-sprite.getWidth())x=GamePanel.gp.getWidth()-sprite.getWidth();
			else x+=mx;
		}
	}
	/*
	 * Bewegt das Objekt in der y Achse
	 */
	public void moveOnY(){
		if(GamePanel.gp.getHeight() !=0){
			if(y+my<0 )y=0;
			else if(y+my>GamePanel.gp.getHeight()-sprite.getHeight())y=GamePanel.gp.getHeight()-sprite.getHeight();
			else y+=my;
		}
	}
	/**
	 * 
	 * @return gibt das Sprite zur�ck
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
	
	public boolean canMoveLeft(int step){
		for(int i=0;i<EntityManager.entitylist.size();i++){
			Entity e=EntityManager.entitylist.get(i);
			if(e != null){
				if(x-step==e.getX()&&y==e.getY()){
					return false;
				}
			}
		}
		
		for(int i=0;i<EntityManager.entitylistb1.size();i++){
			Entity e=EntityManager.entitylistb1.get(i);
			if(e != null){
				if(x-step==e.getX()&&y==e.getY()){
					return false;
				}
			}
		}
		
		for(int i=0;i<EntityManager.entitylistb2.size();i++){
			Entity e=EntityManager.entitylistb2.get(i);
			if(e != null){
				if(x-step==e.getX()&&y==e.getY()){
					return false;
				}
			}
		}
		
		
		return true;
	}

	public boolean canMoveRight(int step){
		for(int i=0;i<EntityManager.entitylist.size();i++){
			Entity e=EntityManager.entitylist.get(i);
			if(e != null){
				if(x+step==e.getX()&&y==e.getY()){
					return false;
				}
			}
		}
		
		for(int i=0;i<EntityManager.entitylistb1.size();i++){
			Entity e=EntityManager.entitylistb1.get(i);
			if(e != null){
				if(x+step==e.getX()&&y==e.getY()){
					return false;
				}
			}
		}
		
		for(int i=0;i<EntityManager.entitylistb2.size();i++){
			Entity e=EntityManager.entitylistb2.get(i);
			if(e != null){
				if(x+step==e.getX()&&y==e.getY()){
					return false;
				}
			}
		}
		
		
		
		
		
		return true;
	}
	
	public boolean canMoveUP(int step){
		for(int i=0;i<EntityManager.entitylist.size();i++){
			Entity e=EntityManager.entitylist.get(i);
			if(e != null){
				if(y-step==e.getY()&&x==e.getX()){
					return false;
				}
			}
		}
		
		for(int i=0;i<EntityManager.entitylistb1.size();i++){
			Entity e=EntityManager.entitylistb1.get(i);
			if(e != null){
				if(y-step==e.getY()&&x==e.getX()){
					return false;
				}
			}
		}
		
		for(int i=0;i<EntityManager.entitylistb2.size();i++){
			Entity e=EntityManager.entitylistb2.get(i);
			if(e != null){
				if(y-step==e.getY()&&x==e.getX()){
					return false;
				}
			}
		}
		
		
		
		return true;
	}
	
	public boolean canMoveDown(int step){
		for(int i=0;i<EntityManager.entitylist.size();i++){
			Entity e=EntityManager.entitylist.get(i);
			if(e != null){
				if(y+step==e.getY()&&x==e.getX()){
					return false;
				}
			}
		}
		
		for(int i=0;i<EntityManager.entitylistb1.size();i++){
			Entity e=EntityManager.entitylistb1.get(i);
			if(e != null){
				if(y+step==e.getY()&&x==e.getX()){
					return false;
				}
			}
		}
		
		for(int i=0;i<EntityManager.entitylistb2.size();i++){
			Entity e=EntityManager.entitylistb2.get(i);
			if(e != null){
				if(y+step==e.getY()&&x==e.getX()){
					return false;
				}
			}
		}
		
		
		return true;
	}
	

	
	
	
}
