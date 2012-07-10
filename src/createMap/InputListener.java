package createMap;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
/*
 * Dies ist der Inputhandler die klasse implementier denn MouseListener
 */
public class InputListener implements MouseListener {
	
	private int x;
	private int y;
	private boolean click=false;
	
	/*
	 * Wenn geklickt wurde wir die position gemerkt und klick auf true gesetzt 
	 */
	@Override
	public void mouseClicked(MouseEvent e) {
		setClick(true);
		setX(e.getX());
		setY(e.getY());
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	/*
	 * wenn losgelassen wurde wird klick auf false gesetzt
	 * (non-Javadoc)
	 * @see java.awt.event.MouseListener#mouseReleased(java.awt.event.MouseEvent)
	 */
	@Override
	public void mouseReleased(MouseEvent e) {
		setClick(false);
		
	}
	/**
	 * 
	 * @return gibt click zurueck 
	 */
	public boolean isClick() {
		return click;
	}
	/**
	 * 
	 * @param click setzt klick 
	 */
	public void setClick(boolean click) {
		this.click = click;
	}
	/**
	 * 
	 * @return gibt x position zurueck
	 */
	public int getX() {
		return x;
	}
	/**
	 * 
	 * @param x setzt x position
	 */ 
	public void setX(int x) {
		this.x = x;
	}
	/**
	 * 
	 * @return gibt y position zurueck
	 */
	public int getY() {
		return y;
	}
	/**
	 * 
	 * @param y setzt y position
	 */ 
	public void setY(int y) {
		this.y = y;
	}

}
