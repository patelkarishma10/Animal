
public class Mammal extends Animal {

	private String hairColour;

	public Mammal(double weight, String colour, int age, String haircolour) {
		super(weight, colour, age);
		this.hairColour = hairColour;

	}

	public String getHaircolour() {
		return hairColour;
	}

	public void setHairColour() {
		this.hairColour = hairColour;
	}
}
