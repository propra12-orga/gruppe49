
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/*
 * Dies ist der Inputhandler die klasse implementier denn Keylistener 
 */
public class InputHandler implements KeyListener {
	public boolean up,down,left,right,aktion;
	private int k1,k2,k3,k4,k5;
	/**
	 * 
	 * @param k1 int k1
	 * @param k2 int k2
	 * @param k3 int k3
	 * @param k4 int k4
	 * @param k5 int k5
	 */
	public InputHandler(int k1,int k2, int k3,int k4, int k5){
		this.k1=k1;
		this.k2=k2;
		this.k3=k3;
		this.k4=k4;
		this.k5=k5;
		
	}
	/*
	 * Diese methode setzt boolen auf true falls der knopf gedrueckt wurde
	 * (non-Javadoc)
	 * @see java.awt.event.KeyListener#keyPressed(java.awt.event.KeyEvent)
	 */
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
	/*
	 * Diese Methide setzt boolean auf false als die taste wieder losgelassen wurde
	 * (non-Javadoc)
	 * @see java.awt.event.KeyListener#keyReleased(java.awt.event.KeyEvent)
	 */
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
