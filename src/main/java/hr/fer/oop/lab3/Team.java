package hr.fer.oop.lab3;

import hr.fer.oop.lab3.welcomepack.Constants;
import hr.fer.oop.lab3.welcomepack.*;

public abstract class Team implements ManageableTeam {
	private String name = Constants.DEFAULT_TEAM_NAME;
	private Formation formation = Constants.DEFAULT_FORMATION;
	private SimpleFootballPlayerCollectionImpl registeredPlayers;
	private SimpleFootballPlayerCollectionImpl startingEleven = new SimpleFootballPlayerCollectionImpl(Constants.STARTING_ELEVEN_SIZE);
	
    public Team(int registeredPlayersSize){
        this.registeredPlayers = new SimpleFootballPlayerCollectionImpl(registeredPlayersSize);
    }
	public Team(String name, Formation formation, int regPlayersSize) {
		if (name != null)
			this.name = name;
		setFormation(formation);
		this.registeredPlayers = new SimpleFootballPlayerCollectionImpl(regPlayersSize);
	}
	public String getName() {
		return name;
	}
	@Override
	public Formation getFormation() {
		return formation;
	}
	public void setFormation(Formation formation) {
		if (formation == null) System.err.println("Formacije je null a ne smije biti.");
		else
			this.formation = formation;
	}
	@Override
	public boolean addPlayerToStartingEleven(FootballPlayer player) {
		if (registeredPlayers.contains(player) && !startingEleven.contains(player)) {
			startingEleven.add(player);
			return true;
		}
		return false;
	}
	@Override
	public double calculateRating() {
		double perc = 0.7;
		if (this instanceof NationalTeam) {
			perc = 1 - perc;
		}
		return this.registeredPlayers.calculateSkillSum()*perc + this.registeredPlayers.calculateEmotionSum()*(1-perc);		
	}
	@Override
	public void clearStartingEleven() {
		this.startingEleven.clear();
	}
	public SimpleFootballPlayerCollection getRegisteredPlayers() {
		return registeredPlayers;
	}
	public SimpleFootballPlayerCollection getStartingEleven() {
		return startingEleven;
	}
	public boolean isPlayerRegistered(FootballPlayer player) {
		return registeredPlayers.contains(player);
	}
	public abstract boolean registerPlayer(FootballPlayer player);
}
