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
public class Game {
    
    private String opponent;
    private String day;
    private String location;
    private String gameTime;
    private int goalsFor;
    private int goalsAgainst;
    private String outcome;
    private int numTickets;
    private double ticketPrice;
    private int gameNum;
    
    public Game(String opponent, String location, String day, String gameTime, 
                 int gF, int gA, String outcome)
    {
        
        if (gF < 0)
                throw new IllegalArgumentException("goalsFor cannot be a "
                                                    + "negative integer...");
        if (gA < 0)
                throw new IllegalArgumentException("This cannot be a "
                                                    + "negative integer...");
        this.opponent = opponent;
        this.location = location;
        this.day = day;    
        this.gameTime = gameTime;
        this.goalsFor = gF;
        this.goalsAgainst = gA;
        this.outcome = outcome;
        this.gameNum = 0;
    }
    
    public Game(String opponent, String location, String day, String gameTime)
    {
        this.opponent = opponent;
        this.location = location;
        this.day = day;    
        this.gameTime = gameTime;
        this.goalsFor = 0;
        this.goalsAgainst = 0;
        this.outcome = "N/A";
   
    }

    /**
     * @return the opponent
     */
    public String getOpponent() 
    {
        return opponent;
    }

    /**
     * @return the day of the game
     */
    public String getDay() 
    {
        return day;
    }

    /**
     * @return the location of the game
     */
    public String getLocation() 
    {
        return location;
    }

    /**
     * @return the game's start time
     */
    public String getGameTime() 
    {
        return gameTime;
    }

    /**
     * @param opponent the opponent to set
     */
    public void setOpponent(String opponent) 
    {
        this.opponent = opponent;
    }

    /**
     * @param day the day to set
     */
    public void setDay(String day) 
    {
        this.day = day;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) 
    {
        this.location = location;
    }

    /**
     * @param gameTime the gameTime to set
     */
    public void setGameTime(String gameTime) 
    {
        this.gameTime = gameTime;
    }
    
    /**
     * @return the outcome
     */
    public String getOutcome() 
    {
        return outcome;
    }

    /**
     * @param outcome the outcome to set
     */
    public void setOutcome(String outcome) 
    {
        this.outcome = outcome;
    }

    /**
     * @return the goalsFor
     */
    public int getGoalsFor() 
    {
        return goalsFor;
    }

    /**
     * @param gF the goalsFor to set
     */
    public void setGoalsFor(int gF) 
    {
        if (gF < 0)
                throw new IllegalArgumentException("goalsFor cannot be a "
                                                    + "negative integer...");
        this.goalsFor = gF;
    }

    /**
     * @return the goalsAgainst
     */
    public int getGoalsAgainst() 
    {
        return goalsAgainst;
    }

    /**
     * @param gA the goalsAgainst to set
     */
    public void setGoalsAgainst(int gA) 
    {
        if (gA < 0)
                throw new IllegalArgumentException("This cannot be a "
                                                    + "negative integer...");
        this.goalsAgainst = gA;
    }
    
    public void sellTicket()
    {
        numTickets -= 1;
    }
    
    public void setGameStats(int goalsFor, int goalsAgainst, String outcome)
    {
        if (goalsFor < 0)
                throw new IllegalArgumentException("goalsFor cannot be a "
                                                    + "negative integer...");
        this.goalsFor = goalsFor;
        this.goalsAgainst = goalsAgainst;
        this.outcome = outcome;
    }
    
    
    @Override
    public String toString()
    {
        String opponentString = "Opponent: " + getOpponent();
        String locationString = " | Location: " + getLocation();
        String dayString = " | Day: " + getDay();
        String gameTimeString = " | Time: " + getGameTime();
        String goalsForString = " | GF: " + getGoalsFor();
        String GoalsAgainstString = " | GA:" + getGoalsAgainst();
        String outcomeString = " | Winner: " + getOutcome();
  //      String ticketsLeft = " | Tickets Left: " + 
        
        
        String currentGame =  opponentString + locationString  + dayString 
                              + gameTimeString + goalsForString 
                              + GoalsAgainstString + outcomeString;
        
            return "Game Info: || " + currentGame + "\n";
    }
}
