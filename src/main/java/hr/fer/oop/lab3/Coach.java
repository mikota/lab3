package hr.fer.oop.lab3;

import hr.fer.oop.lab3.welcomepack.*;
import hr.fer.oop.lab3.welcomepack.Formation;
import hr.fer.oop.lab3.welcomepack.ManageableTeam;

public class Coach extends Person implements Manager {
	private int coachingSkill = Constants.DEFAULT_COACHING_SKILL;
	private Formation formation = Constants.DEFAULT_FORMATION;
	private ManageableTeam managingTeam;
	
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
	
	public void setManagingTeam(ManageableTeam team) {
		managingTeam = team;
	}
	
	public void forceMyFormation() {
		managingTeam.setFormation(formation);
	}
	public void pickStartingEleven(){
        int gk = managingTeam.getFormation().getNoGK();
        int df = managingTeam.getFormation().getNoDF();
        int mf = managingTeam.getFormation().getNoMF();
        int fw = managingTeam.getFormation().getNoFW();

        managingTeam.clearStartingEleven();
        for(FootballPlayer player : managingTeam.getRegisteredPlayers().getPlayers()){

            if(player != null && managingTeam.getStartingEleven().size() != managingTeam.getStartingEleven().getMaxSize()){
                switch (player.getPlayingPosition()){
                    case GK:
                        if(gk>0){
                            managingTeam.addPlayerToStartingEleven(player);
                            gk--;
                        }
                        break;
                    case DF:
                        if(df>0){
                            managingTeam.addPlayerToStartingEleven(player);
                            df--;
                        }
                        break;
                    case MF:
                        if(mf>0){
                            managingTeam.addPlayerToStartingEleven(player);
                            mf--;
                        }
                        break;
                    case FW:
                        if(fw>0){
                            managingTeam.addPlayerToStartingEleven(player);
                            fw--;
                        }
                        break;
                    default:
                        break;
                }
            }
        }		
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
	public void setCoachingSkill(int cs) {
		coachingSkill = cs;
	}
}
