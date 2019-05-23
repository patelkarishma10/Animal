
public class Dolphin extends Mammal {

	private int numberOfFins;

	public Dolphin(double weight, String colour, int age, String haircolour, int numberOfFins) {
		super(weight, colour, age, haircolour);
		this.numberOfFins = numberOfFins;
	}

	// public String dolphinDetails() {
	// // System.out.println("Name: " + name + "\n" + "Age: " + age + "\n" + "Job
	// // title: " + jobTitle);
	// return weight + " " + colour + " " + age + " " + haircolour + " " +
	// numberOfFins;
	// }
	//
	// public String toString() {
	//
	// return weight + " " + colour + " " + age + " " + haircolour + " " +
	// numberOfFins;
	// }

	public int getNumberOfFins() {
		return numberOfFins;
	}

	public void setNumberOfFins() {
		this.numberOfFins = numberOfFins;
	}

}
