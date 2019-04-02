package hr.fer.oop.lab3;

import hr.fer.oop.lab3.welcomepack.Constants;
import hr.fer.oop.lab3.welcomepack.Formation;

public class NationalTeam extends Team {
	private String country = Constants.DEFAULT_COUNTRY;
	private SimpleFootballPlayerCollectionImpl registeredPlayers = new SimpleFootballPlayerCollectionImpl(23);
	
	public NationalTeam(String name, Formation formation, String country) {
		super(name,formation,Constants.MAX_NO_PLAYERS_NATIONAL);
		this.country = country;
	}
	public NationalTeam() {
		super(Constants.MAX_NO_PLAYERS_NATIONAL);
	}
	
	public boolean registerPlayer(FootballPlayer player) {
		if (player.getCountry().contentEquals(getCountry())) {
			return registeredPlayers.add(player);
		}
		return false;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		if (country == null) System.err.println("Country je null, a ne smije biti.");
		else
		this.country = country;
	}
}
