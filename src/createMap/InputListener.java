package createMap;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class InputListener implements MouseListener {
	
	private int x;
	private int y;
	private boolean click=false;
	
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

	@Override
	public void mouseReleased(MouseEvent e) {
		setClick(false);
		
	}

	public boolean isClick() {
		return click;
	}

	public void setClick(boolean click) {
		this.click = click;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
