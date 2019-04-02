package hr.fer.oop.lab3;

import hr.fer.oop.lab3.welcomepack.SimpleFootballPlayerCollection;

public class SimpleFootballPlayerCollectionImpl implements SimpleFootballPlayerCollection {

	private FootballPlayer[] players;
    
	public SimpleFootballPlayerCollectionImpl(int size) {
        players = new FootballPlayer[size];
    }
	
	@Override
	public int size() {
		int i;
		for(i=0; players[i] != null; i++){
			if (i+1==players.length) break;
		}
		return i;
		
	}

	@Override
	public boolean contains(FootballPlayer player) {
		if (player == null) return false;
		else {
			for(FootballPlayer player_i : players) {
				if (player_i != null)
				if(player_i.equals(player)) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public boolean add(FootballPlayer player) {
		if (!contains(player)) {
			for(int i=0; i<players.length; i++) {
				if (players[i] == null) {
					players[i] = player;
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public void clear() {
		for(int i=0; i<players.length; i++)
			players[i] = null;
	}

	@Override
	public int getMaxSize() {
		return players.length;
	}

	@Override
	public int calculateEmotionSum() {
		int sum = 0;
		for(FootballPlayer player_i : players) {
			if (player_i !=null)
			sum += player_i.getEmotion();
		}
		return sum;
	}

	@Override
	public int calculateSkillSum() {
		int sum = 0;
		for(FootballPlayer player_i : players) {
			if (player_i != null)
			sum += player_i.getPlayingSkill();
		}
		return sum;
	}

	@Override
	public FootballPlayer[] getPlayers() {
		return players;
	}

}
