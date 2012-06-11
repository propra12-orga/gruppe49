import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class InputHandler implements KeyListener {
	public boolean up,down,left,right,aktion;
	private int k1,k2,k3,k4,k5;

	public InputHandler(int k1,int k2, int k3,int k4, int k5){
		this.k1=k1;
		this.k2=k2;
		this.k3=k3;
		this.k4=k4;
		this.k5=k5;
		
	}
	
	public void keyPressed(KeyEvent e) {
		int key=e.getKeyCode();
		if(key==k1){
			left=true;
		}
		if(key==k2){
			right=true;
		}
		if(key==k3){
			up=true;
		}
		if(key==k4){
			down=true;
		}
		if(key==k5){
			aktion=true;
		}
		
	}

	public void keyReleased(KeyEvent e) {
		int key=e.getKeyCode();
		if(key==k1){
			left=false;
		}
		if(key==k2){
			right=false;
		}
		if(key==k3){
			up=false;
		}
		if(key==k4){
			down=false;
		}
		if(key==k5){
			aktion=false;
		}
	}

	public void keyTyped(KeyEvent e) {

		
	}
 
	
}
