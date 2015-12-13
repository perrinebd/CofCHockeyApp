/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cofchockeyapp;
/**
 *
 * @author Brett 
 */
public class Player extends OrgMember{
    private String shot;
    private int inches;
    private int feet;
    private int playerNum;
    private int weight;
    private int gamesPlayed;
    private int goals;
    private int assists;
    private int penaltyMinutes;
    
    /**
     *
     * @param fN OrgMember first name
     * @param lN OrgMember last name / together they make OrgMember name
     * @param pos OrgMmeber position / player position or Org position
     * @param gY OrgMember graduation year
     * @param sID   OrgMember studentID number 
     * @param num Players number
     */
    public Player(String fN, String lN, String pos, int num,
                  int gY, int sID)
    {

        super(fN,lN, pos, gY, sID);
        if (num <=0 || num >= 100)
            throw new IllegalArgumentException();
        this.playerNum = num;
        
    }
    
    public Player(String name, String pos, int num, int gY, int sID)
    {
        super(name, pos, gY, sID);
        this.playerNum = num;
    }
    
    public Player(String name, String pos)
    {
        super(name, pos, 00, 2006000);
        this.playerNum = 0;
    }
    
    /**
     *
     * @param firstName OrgMember first name
     * @param lastName OrgMember last name / together they make OrgMember name
     * @param position OrgMmeber position / player position
     * @param gradYear OrgMember graduation year
     * @param studentID   OrgMember studentID number 
     * @param w Player's weight
     * @param shot the direction the Player shoots, either R (Right) or L (Left)
     */
    
    public Player(String firstName,String lastName, String position, int num,
                 int gradYear, int studentID, int hF, int hI, int w, 
                 String shot)
    {
        
        super(firstName,  lastName,  position,
             gradYear, studentID);
        try{
        if (num < 0 || num > 99)
            throw new IllegalArgumentException();
        }
        catch (IllegalArgumentException e )
        {
            System.err.println("IllegalArgumentExeption: " + "only integers "
                            +  " between 1-99 are valid!");
            this.playerNum = 0;
        }
        try{
        if(hF < 0 || hF > 8)        
            throw new IllegalArgumentException();
        }
        catch (IllegalArgumentException e )
        {
            System.err.println("IllegalArgumentExeption: " + "Only integers "
                              + "between 0-8 are valid for feet!");
            feet = 0;
        }
        try{
        if(hI < 0 || hI > 12)
            throw new IllegalArgumentException();
        }
        catch (IllegalArgumentException e )
        {
            System.err.println("IllegalArgumentExeption: " + "Anything over 11 "
                             + "would be another foot!");
            inches = 0;
        }
        try{
        if(w < 0 || w > 1000)
           throw new IllegalArgumentException("Weight cannot be negative.. or"
                                            +" maybe your entry it too high! ");                                           
        }
        catch (IllegalArgumentException e )
        {
            System.err.println("IllegalArgumentExeption: " + "Only positive"
                             + " integers <1000 are valid!");
            weight = 0;
        }
        
        feet = hF;
        inches = hI;
        this.weight = w;
        this.shot = shot;
        this.playerNum = num;
        
        
        
    }
    
    public void setStats(int gP,int g, int a, int pims)
    {

        this.gamesPlayed = gP;
        this.goals = g;
        this.assists = a;
        this.penaltyMinutes = pims;
    }
    
    /**
     * Sets the players number of feet (height)
     * 
     * @param ft is the number of feet tall the player is
     */
    public void setFeet(int ft)
    {
        feet = ft;
        
    }
    
    /**
     * Gets the number of feet tall the player is
     * @return Player height as a string
     */
    public int getFeet()
    {
        
        return feet;
    }

    /**
     * @return the weight
     */
    public int getWeight() 
    {
        return weight;
    }

    /**
     * @param weight the weight to set for the Player
     */
    public void setWeight(int weight) 
    {
        this.weight = weight;
    }

    /**
     * @return the shot
     */
    public String getShot() 
    {
        return shot;
    }

    /**
     * @param shot the shot to set
     */
    public void setShot(String shot) 
    {
        this.shot = shot;
    }

    /**
     * @return the gamesPlayed
     */
    public int getGamesPlayed() 
    {
        return gamesPlayed;
    }

    /**
     * @param gamesPlayed the gamesPlayed to set
     */
    public void setGamesPlayed(int gamesPlayed) 
    {
        this.gamesPlayed = gamesPlayed;
    }
    
    /**
     *
     * @param numGames to add to the Player's existing total of games played
     */
    public void addGamesPlayed(int numGames)
    {
        this.gamesPlayed += numGames;
    }

    /**
     * @return the goals
     */
    public int getGoals() 
    {
        return goals;
    }

    /**
     * @param goals the goals to set
     */
    public void setGoals(int goals) 
    {
        this.goals = goals;
    }
    
    /**
     *
     * @param goal number of goals to add to Player's goal total
     */
    public void addGoals(int goal)
    {
        this.goals += goal;
    }

    /**
     * @return the assists
     */
    public int getAssists() 
    {
        return assists;
    }

    /**
     * @param assists the assists to set
     */
    public void setAssists(int assists) 
    {
        this.assists = assists;
    }
    
    /**
     *
     * @param assist number of assist to add to Player's assist total
     */
    public void addAssist(int assist)
    {
        this.assists += assist;
    }

    /**
     * @return the Player's penaltyMinutes
     */
    public int getPenaltyMinutes() 
    {
        return penaltyMinutes;
    }

    /**
     * @param penaltyMinutes the penaltyMinutes to set
     */
    public void setPenaltyMinutes(int penaltyMinutes) 
    {
        this.penaltyMinutes = penaltyMinutes;
    }
    
    /**
     * Adds an integer onto the existing number of penalty minutes the player
     * has.
     * @param pM the number of penalty minutes to add to the players total
     */
    public void addPenaltyMinutes(int pM)
    {
        this.penaltyMinutes += pM;
    }
    
    /**
     * Gets the player's game number
     * 
     * @return the playerNum
     */
    public int getPlayerNum() 
    {
        return playerNum;
    }

    /**
     * @param pN the player's Nnmber to set
     */
    public void setPlayerNum(int pN) 
    {
        this.playerNum = pN;
    }
   
    @Override
    public String toString()
    {
        String nameString = "Name: " + super.getName();
        String heightString = " | Height: " + feet + "'" + inches + "\"";
        String weightString = " | Weight: " + weight;
        String numString = " | Number: " + playerNum;
        String shotString = " | Shot: " + shot;
        String gPString = " | Games Played: " + gamesPlayed;
        String goalString = " | Goals: " + goals;
        String assistString =  " | Assists: " + assists;
        String outcomeString = " | PIMS: " + penaltyMinutes;
        
        String playerInfo = nameString + numString + heightString +  
                            weightString + shotString + gPString 
                             + goalString + assistString + outcomeString;
        
        return "Player Info: " + playerInfo + "\n";
    }

    /**
     * Returns the number of inches (ex. 6'1" returns 1)
     * 
     * @return the players inches in height
     */
    public int getInches() {
        return inches;
    }

    /**
     * Sets the number of inches to the player object.
     * 
     * @param inches - the inches to set
     * @throws IllegalArgumentException if number is negative or greater than 11
     */
    public void setInches(int inches) {
        if (inches < 0 || inches > 12)
            throw new IllegalArgumentException();
        
        this.inches = inches;
    }
}
