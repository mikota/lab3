package hr.fer.oop.fer3;

import hr.fer.oop.lab3.welcomepack.Formation;

public class Coach extends Person {
	private int coachingSkill = 50;
	private Formation formation = Formation.F442;
	
	public Coach() {
		super();
	}
	public Coach(String name, String country, int emotion, int coachingSkill, Formation formation) {
		super(name,country,emotion);
		if (coachingSkill > 100) {
			System.err.println("Trenerova vjestina ne moze biti veca od sto!");
		} else if (coachingSkill < 0) {
			System.err.println("Trenerova vjestina ne moze biti manja od nula!");
		}
		this.coachingSkill = coachingSkill;
		this.formation = formation;
	}
	
	public Formation getFormation() {
		return formation;
	}
	public void setFormation(Formation formation) {
		this.formation = formation;
	}
	public int getCoachingSkill(){
		return coachingSkill;
	}
	void setCoachingSkill(int cs) {
		coachingSkill = cs;
	}
}
