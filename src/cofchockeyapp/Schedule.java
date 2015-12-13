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
public class Schedule 
{ 
    private ArrayList<Game> gameSchedule;
    /**
     *
     * @param games an already existing ArrayList of games
     */
    public Schedule(ArrayList<Game> games)
    {
        this.gameSchedule = games;
    }
   
    /**
     * Constructs an empty ArrayList of type Game
     */
    public Schedule()
    {
        this.gameSchedule = new ArrayList<>();
    }
    
    /**
     * Creates a new ArrayList of type Game and adds newGame 
     * @param newGame is a new game to be added to the ArrayList of type Game
     */
    public Schedule(Game newGame)
    {
        this.gameSchedule = new ArrayList<>();
        gameSchedule.add(newGame);
        
    }
    
    /**
     *
     * @param newGame the new Game to be added to existing ArrayList 
     * gameSchedule
     */
    public void addGame(Game newGame)
    {
        gameSchedule.add(newGame);
    }
    
    
    public Game findGame(int index)
    {
        return gameSchedule.get(index);
    }
    
    public void removeGame(int index)
    {
        assert gameSchedule.size() >= 0: gameSchedule.remove(index);
    }
    
    @Override
    public String toString()
    {
       return gameSchedule.toString();
    }
}
