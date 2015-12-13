/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cofchockeyapp;

/**
 *
 * @author Brett Perrine
 */
public class Coach extends OrgMember{
    
    private int wins;
    private int losses;
    private int games;
    private String previousTeam;
    
    /**
     * Constructs an OrgMember object of type Coach which represents the head
     *  coach of the team.  
     * 
     * @param fN - first name of the Coach 
     * @param lN - last name of the coach
     * @param prevT - Coach's previous team
     */
    public Coach(String fN, String lN, String prevT)
    {
        super(fN, lN, "Coach");
        this.wins = 0;
        this.losses = 0;
        this.games = 0;
        this.previousTeam = prevT;
    }
    
    /**
     * Allows all coach statistics to be updated at once
     * 
     * @param w - number of wins the coach has
     * @param l - number of losses the coach has
     * @param g - number of games total the coach has competed in 
     */
    public void setStats(int w, int l, int g)
    {
        try{
            if (w < 0 || l < 0 || g < 0)
                throw new IllegalArgumentException();
            this.wins = w;
            this.losses = l;
            this.games = g;
        } catch (IllegalArgumentException e)
        {
            System.err.println("IllegalArgumentException: " + "You must enter"
                             + " positive integers for game statistics!");
        }
            
    }

    /**
     * Gets the number of wins the coach has
     * 
     * @return the coach's wins
     */
    public int getWins() 
    {
        return wins;
    }

    /**
     * Sets the number of wins the coach has
     * 
     * @param w - number of wins the coach has 
     */
    public void setWins(int w) 
    {
        try{
        if (w < 0)
            throw new IllegalArgumentException();
        
        }
        catch (IllegalArgumentException e)
        {
            System.err.println("IllegalArgumentException: " + "You must enter a "
                             + "positive integer for wins!");
        }
        this.wins = w;
    }

    /**
     * Gets the number of losses the coach has
     * 
     * @return the coach's losses
     */
    public int getLosses() 
    {
        return losses;
    }

    /**
     * Sets the number of losses the coach has
     * 
     * @param l - number of losses the coach has 
     */
    public void setLosses(int l) 
    {
        try{
        if (l < 0)
            throw new IllegalArgumentException();
        this.losses = l;
        }
        catch (IllegalArgumentException e)
        {
            System.err.println("IllegalArgumentException: " + "You must enter a "
                             + "positive integer for losses!");
        }
    }

    /**
     * Gets the number of games the coach has competed in
     * 
     * @return the coach's total games 
     */
    public int getGames() 
    {
        return games;
    }
    
    /**
     * Sets the number of games the coach has
     * 
     * @param g - number of games the coach has competed in
     */
    public void setGames(int g) 
    {
        try{
        if (g < 0)
            throw new IllegalArgumentException();
        this.games = g;
        }
        catch (IllegalArgumentException e)
        {
            System.err.println("IllegalArgumentException: " + "You must enter a "
                             + "positive integer for Games Played!");
        }
    }

    /** 
     * Gets the name of the coach's previous tam
     * 
     * @return the Coach's previous team name
     */
    public String getPreviousTeam() 
    {
        return previousTeam;
    }
    
    /**
     *
     * @param pT is a String containing the name of the coaches prior team.
     */
    public void setPreviousTeam(String pT)
    {
        this.previousTeam = pT;
    }
    
    @Override
    public String toString()
    {
        String output = " | Coach | " + "Name: " + getName() + 
                        " | Previous Team: " + getPreviousTeam() +
                        " | Games: " + getGames() + " | Wins: " + getWins() +
                        " | Losses: " + getLosses();       
        
        return output;
    }
    
    /**
     * Creates three different Coach objects in order to show the exception handling
     * @param args
     */
    public static void main(String [] args)
    {
        
        Coach tippy = new Coach("Tippy", "Galore", "Charlotte Checkers");
        tippy.setStats(1, 1, 3);
        System.out.println(tippy.toString());
        
        Coach duner = new Coach("Dale", "Hladun", "100 Mile House Wranglers");
        duner.setGames(-4);
        duner.setWins(-1);
        duner.setLosses(-1);
        System.out.println(duner.toString());
        
        Coach watson = new Coach("Jim", "Watson", "Philadelphia Flyers");
        watson.setGames(100);
        watson.setWins(45);
        watson.setLosses(34);
        System.out.println(watson.toString());
        
        Coach guadreau = new Coach("Guy", "Guadreau", "Hollydell Hurricanes");
        guadreau.setStats(-1, 2, 3);
        System.out.println(guadreau.toString());
        guadreau.setStats(1,2,3);
        System.out.println(guadreau.toString());

    }
}
