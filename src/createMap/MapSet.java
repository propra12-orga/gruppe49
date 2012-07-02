package createMap;

import javax.swing.JComponent;

public class MapSet implements Runnable{
	
	private InputListener input;
	private boolean b1;
	private boolean b2;
	private boolean s1;
	private boolean s2;
	private boolean fertig;
	private boolean reset;
	private JComponent comp;
	
	public MapSet(JComponent comp){
		this.input=MapField.input;
		b1=false;
		b2=false;
		s1=false;
		s2=false;
		fertig=false;
		reset=false;
		this.comp=comp;
	}
	
	
	
	
	public void run(){
		while(CMap.running && !fertig){
			try{
				if(MapField.input.isClick()){
					int x=MapField.input.getX();
					int y=MapField.input.getY();
					int ax=0,ay=0;
					MapField.input.setClick(false);
					if(x>=760&&x<=940&&y>=50&&y<=100){
						b1=true;
						b2=false;
						s1=false;
						s2=false;
						fertig=false;
						reset=false;
					}
					if(x>=760&&x<=940&&y>=150&&y<=200){
						b1=false;
						b2=true;
						s1=false;
						s2=false;
						fertig=false;
						reset=false;
					}
					
					if(x>=760&&x<=940&&y>=250&&y<=300){
						b1=false;
						b2=false;
						s1=true;
						s2=false;
						fertig=false;
						reset=false;
					}
					
					if(x>=760&&x<=940&&y>=350&&y<=400){
						b1=false;
						b2=false;
						s1=false;
						s2=true;
						fertig=false;
						reset=false;
					}
					
					if(x>=760&&x<=940&&y>=455&&y<=495){
						b1=false;
						b2=false;
						s1=false;
						s2=false;
						fertig=true;
						reset=false;
					}
					
					if(x>=760&&x<=940&&y>=505&&y<=545){
						b1=false;
						b2=false;
						s1=false;
						s2=false;
						fertig=false;
						EntityManager.entitylist.clear();
					}
					
					
					
				
					for(int i=50;i<=750;i=i+50){
						if(x<=i){
							ax=i-50;
							break;
						}
					}
					for(int i=50;i<=550;i=i+50){
						if(y<=i){
							ay=i-50;
							break;
						}
					}
					if(x<=750&&y<=550){
					if(b1){
						BombermanEntity spieler1=new BombermanEntity("src/createMap/Bomberman1.png",ax,ay,"Spieler1");
						EntityManager.entitylist.add(spieler1);
					}
					if(b2){
						BombermanEntity spieler2=new BombermanEntity("src/createMap/Bomberman2.png",ax,ay,"Spieler2");
						EntityManager.entitylist.add(spieler2);
					}
					if(s1){
						StoneEntity stone1=new StoneEntity("src/createMap/stone.png",ax,ay);
						EntityManager.entitylist.add(stone1);
					}
					if(s2){
						StoneEntity stone2=new StoneEntity("src/createMap/stone2.png",ax,ay);
						EntityManager.entitylist.add(stone2);
					}
					if(fertig){
						System.out.println("fertig");
					}

					}
				}
				
			comp.repaint();	
			Thread.sleep(20);
			}catch(Exception ex){
				
			}
		}
		
	}

}
