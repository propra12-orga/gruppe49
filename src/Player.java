

public class Player {
	private String name;
	private InputHandler input;
	/*
	 * Die spieler klasse ist fuer die zuordnung der inputhandler zusteandig 
	 */
	/**
	 * 
	 * @param name name des spielers
	 * @param input der inputhandler
	 */
	public Player(String name,InputHandler input){
		this.name=name;
		this.input=input;
	}
	
	/**
	 * 
	 * @return gibt den Inputhandler zuruck
	 */
	public InputHandler getInputHandler(){
		return input;
	}
	/**
	 * 
	 * @return gibt den namen des spielers zurueck
	 */
	public String getName(){
		return name;
	}
}
