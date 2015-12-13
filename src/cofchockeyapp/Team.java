/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cofchockeyapp;
import java.util.ArrayList;
/**
 *
 * @author Brett
 */
public class Team {
    private ArrayList<Player> teamRoster;
    private ArrayList<OrgMember> staff;
    private int wins;
    private int losses;
    private int ties;
    private int gamesPlayed;
    private double goalsForAverage;
    //private double goalsAgainstAverage;
    private double winPercentage;
    
    
    public Team()
    {
        teamRoster = new ArrayList();
        staff = new ArrayList();
    }
    
    public Team(Player player)
    {
        this.teamRoster = new ArrayList<>();
        teamRoster.add(player);
    }
    
    public Team(ArrayList<Player> players)
    {
        this.teamRoster = players;
        
    }
    
    public Team(OrgMember member)
    {
        this.staff = new ArrayList<>();
        staff.add(member);
    }
    
    /**
     *
     * @param player is an OrgMember of type Player to add to the ArrayList 
     * of type Team
     */
    public void addPlayer(Player player)
    {
        getTeamRoster().add(player);
    }
    
    /**
     *
     * @param coach is an OrgMember of type Coach to add to the ArrayList of
     * type Team
     */
    public void addCoach(Coach coach)
    {
        getStaff().add(coach);
    }
    
    /**
     *
     * @param member
     */
    public void addStaff(Staff member)
    {
        getStaff().add(member);
    }
    
    public void addOrgMember(OrgMember member)
    {
        getStaff().add(member);
    }
    
    public ArrayList<OrgMember> getStaff()
    {
        return staff;
    }
    
    public Player getPlayer(int index)
    {
        return teamRoster.get(index);
    }
    
    public OrgMember getOrgMember(int index)
    {
        return staff.get(index);
    }

    /**
     * @return the teamRoster
     */
    public ArrayList<Player> getTeamRoster() {
        return teamRoster;
    }

    /**
     * @param teamRoster the teamRoster to set
     */
    public void setTeamRoster(ArrayList<Player> teamRoster) {
        this.teamRoster = teamRoster;
    }

    /**
     * @return the wins
     */
    public int getWins() {
        return wins;
    }

    /**
     * @param wins the wins to set
     */
    public void setWins(int wins) {
        this.wins = wins;
    }

    /**
     * @return the losses
     */
    public int getLosses() {
        return losses;
    }

    /**
     * @param losses the losses to set
     */
    public void setLosses(int losses) {
        this.losses = losses;
    }

    /**
     * @return the ties
     */
    public int getTies() {
        return ties;
    }

    /**
     * @param ties the ties to set
     */
    public void setTies(int ties) {
        this.ties = ties;
    }

    /**
     * @return the gamesPlayed
     */
    public int getGamesPlayed() {
        return gamesPlayed;
    }

    /**
     * @param gamesPlayed the gamesPlayed to set
     */
    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    /**
     *
     * @return the goalsPerGame
     */
    public double getGoalsForAverage() 
    {
        return goalsForAverage;
    }

    /**
     * @return the winPercentage
     */
    public double getWinPercentage() 
    {
        
        return winPercentage;
    }

    public int size()
    {
        int size = teamRoster.size();
        return size;
    }
    
    @Override
    public String toString()
    {
        return teamRoster.toString() + staff.toString();
    }
}
