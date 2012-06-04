import java.awt.Image;
import java.util.HashMap;

import javax.swing.ImageIcon;


public class SpriteManager {

	public static SpriteManager manager=new SpriteManager();
	private HashMap<String, Sprite> map=new HashMap<String,Sprite>();
	
	public Sprite getSprite(String src){
		if(map.get(src)!=null)return map.get(src);
		ImageIcon icon = new ImageIcon(getClass().getResource(src));
		Image img=icon.getImage();
		Sprite s=new Sprite(img);
		map.put(src, s);
		return s;
	}
}
 