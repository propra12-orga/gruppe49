package netzwerkspieler;


public class Player {
	private String name;
	private InputHandler input;
	
	public Player(String name,InputHandler input){
		this.name=name;
		this.input=input;
	}
	
	public InputHandler getInputHandler(){
		return input;
	}
	
	public String getName(){
		return name;
	}
}
