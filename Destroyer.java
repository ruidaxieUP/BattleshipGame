package battleship;

public class Destroyer extends Ship{
	public Destroyer() {
		super(2);
	}
	
	public String getShipType() {
		return "d";
	}
}