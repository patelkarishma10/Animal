
public class Bird extends Animal {

	private double wingspan;
	private String wingColour;

	public Bird(double weight, String colour, int age, double wingspan, String wingColour) {
		super(weight, colour, age);
		this.wingspan = wingspan;
		this.wingColour = wingColour;

	}

	public double getWingspan() {
		return wingspan;
	}

	public String getWingColour() {
		return wingColour;
	}

	public void setWingspan() {
		this.wingspan = wingspan;
	}

	public void setWingColour() {
		this.wingColour = wingColour;
	}
}
