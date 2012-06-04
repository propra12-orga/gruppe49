
public class Entity {

	protected double x;
	protected double y;
	protected double mx;
	protected double my;
	protected Sprite sprite;
	
	public final static int Default_Movement_On_X =300;
	public final static int Default_Movement_On_Y =300;
	
	
	public Entity(String src, double x, double y){
		sprite = SpriteManager.manager.getSprite(src);
		this.x=x;
		this.y=y;
		mx=0;
		my=0;
	}
	
	public void setHorizontalMovement(int hm){
		mx=hm;
	}
	
	public void setVerticalMovement(int vm){
		my=vm;
	}
	
	public double getHorizontalMovement(){
		return mx;
	}
	
	public double getVerticalMovement(){
		return my;
	}
	
	public void moveOnX(long duration){
		double movement=duration*mx/1000;
		if(GamePanel.gp.getWidth() !=0){
			if(x+movement<0 )x=0;
			else if(x+movement>GamePanel.gp.getWidth()-sprite.getWidth())x=GamePanel.gp.getWidth()-sprite.getWidth();
			else x+=movement;
		}
	}
	
	public void moveOnY(long duration){
		double movement=duration*my/1000;
		if(GamePanel.gp.getHeight() !=0){
			if(y+movement<0 )y=0;
			else if(y+movement>GamePanel.gp.getHeight()-sprite.getHeight())y=GamePanel.gp.getHeight()-sprite.getHeight();
		//	else if(y+movement)
			else y+=movement;
		}
	}
	
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
