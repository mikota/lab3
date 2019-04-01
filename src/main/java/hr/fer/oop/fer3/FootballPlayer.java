package hr.fer.oop.fer3;

import hr.fer.oop.lab3.welcomepack.*;

public class FootballPlayer extends Person {
	private int playingSkill = 50;
	private PlayingPosition playingPosition = PlayingPosition.MF;
	
	public FootballPlayer() {
		super();
	}
	public FootballPlayer(String name, String country, int emotion, int playingSkill, PlayingPosition playingPosition) {
		super(name,country,emotion);
		if (playingSkill > 100) {
			System.err.println("Igraceva vjestina ne moze biti veca od sto!");
		} else if (playingSkill < 0) {
			System.err.println("Igraceva vjestina ne moze biti manja od nula!");
		}
		this.playingSkill = playingSkill;
		this.playingPosition = playingPosition;
	}
	
	public int getPlayingSkill() {
		return playingSkill;
	}
	
	
}
