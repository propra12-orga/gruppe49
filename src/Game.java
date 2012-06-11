
public class Game {

	/*
	*	Boolean variable um zu sehen ob das Spiel am laufen ist 
	*/
	public static boolean running=false;
	
	
	/*
	 * Setzt Das spiel auf laufen und šffnet ein neues SpielFenster
	 */
	public static void main(String[] args) {
		running=true;
		new GameWindow("Bomberman", 750, 572);

	}

}
