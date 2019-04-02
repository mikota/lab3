package hr.fer.oop.lab3;
import hr.fer.oop.lab3.welcomepack.*;

public class Person {
	private String name = "John Doe";
	private String country = "Noland";
	private int emotion = 50;
	
	public Person(){}
	public Person(String name, String country, int emotion){
		this();
		this.name = name;
		this.country = country;
		setEmotion(emotion);

	}
	public String getName() {
		return name;
	}
	public String getCountry() {
		return country;
	}
	public int getEmotion() {
		return emotion;
	}
	public void setEmotion(int emotion) {
		if (emotion > 100) {
			System.err.println("Emocija osobe ne moze biti veca od sto!");
		} else if (emotion < 0) {
			System.err.println("Emocija osobe ne moze biti manja od nula!");
		} else
			this.emotion = emotion;
	}
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Person)) return false;
		Person x = (Person) obj;
		return (x.country == this.country && x.name == this.name);
	}
}
