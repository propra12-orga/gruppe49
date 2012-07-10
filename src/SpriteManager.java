
import java.awt.Image;
import java.util.HashMap;

import javax.swing.ImageIcon;


public class SpriteManager {
	/*
	 * Dies ist des spritemanger wieder name sagt 
	 * organisiert es die sprites
	 */
	public static SpriteManager manager=new SpriteManager();
	private HashMap<String, Sprite> map=new HashMap<String,Sprite>();
	/**
	 * 
	 * @param src phad der datei
	 * @return gibt ein sprite zurueck
	 */
	public Sprite getSprite(String src){
		if(map.get(src)!=null)return map.get(src);
		ImageIcon icon = new ImageIcon(getClass().getResource(src));
		Image img=icon.getImage();
		Sprite s=new Sprite(img);
		map.put(src, s);
		return s;
	}
}
 