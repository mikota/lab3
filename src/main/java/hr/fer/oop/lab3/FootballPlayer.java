package hr.fer.oop.lab3;

import hr.fer.oop.lab3.welcomepack.*;

public class FootballPlayer extends Person {
	private int playingSkill = 50;
	private PlayingPosition playingPosition = PlayingPosition.MF;
	
	public FootballPlayer() {
		super();
	}
	public FootballPlayer(String name, String country, int emotion, int playingSkill, PlayingPosition playingPosition) {
		super(name,country,emotion);
		setPlayingPosition(playingPosition);
		this.playingPosition = playingPosition;
	}
	
	public void setPlayingPosition(PlayingPosition playingPosition) {
		if (playingSkill > 100) {
			System.err.println("Igraceva vjestina ne moze biti veca od sto!");
		} else if (playingSkill < 0) {
			System.err.println("Igraceva vjestina ne moze biti manja od nula!");
		} else
			this.playingSkill = playingSkill;
	}
	public PlayingPosition getPlayingPosition() {
		return playingPosition;
	}
	public int getPlayingSkill() {
		return playingSkill;
	}
	public void setPlayingSkill(int playingSkill) {
		this.playingSkill = playingSkill;
	}
	
	
}
