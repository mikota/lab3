package hr.fer.oop.lab3;

import hr.fer.oop.lab3.welcomepack.*;


public class ClubTeam extends Team {
	private int reputation = Constants.DEFAULT_REPUTATION;
	
	public ClubTeam(String name, Formation formation, int reputation) {
		super(name,formation,Constants.MAX_NO_PLAYERS_CLUB);
		this.reputation = reputation;
	}
	public ClubTeam() {
		super(Constants.MAX_NO_PLAYERS_CLUB);
	};
	public int getReputation() {
		return reputation;
	}
	public void setReputation(int rep) {
		if (rep<=100 && rep>=0)
		reputation = rep;
	}
	public boolean registerPlayer(FootballPlayer player) {
		if (player.getPlayingSkill() >= getReputation()) {
			return getRegisteredPlayers().add(player);
		}
		return false;
	}
}
