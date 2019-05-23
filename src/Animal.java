
public class Animal {

	private double weight;
	private String colour;
	private int age;

	public Animal(double weight, String colour, int age) {
		this.weight = weight;
		this.colour = colour;
		this.age = age;
	}

	public String respires() {
		return "Breaths";
	}

	public double getWeight() {
		return weight;
	}

	public String getColour() {
		return colour;
	}

	public int getAge() {
		return age;
	}

	public void setWeight() {
		this.weight = weight;
	}

	public void setColour() {
		this.colour = colour;
	}

	public void setAge() {
		this.age = age;
	}
}
