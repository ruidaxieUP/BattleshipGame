package battleship;

public class Battleship extends Ship {
	public Battleship() {
		super(4);
	}
	
	public String getShipType() {
		return "b";
	}
}