package Game;

public class Dog extends Animal {
	
	private String race;
	
	public Dog (String name, String color, int points, String race){
		super(name, color, points);
		this.race = race;
	}
	
	public void setPoint(){
		this.points = 5;
	}
	
	public String toString() {
	    String str = super.toString() + " - RACE : " + this.race;
	    return str;
	}

}
