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
public class Staff extends OrgMember{
    private String gameDayPosition;
  
    /**
     * Creates a new OrgMember object of type Staff which has a specific game
     * day position (ex. Score Keeper).
     * 
     * @param fN OrgMembers first name
     * @param lN OrgMembers last name
     * @param gY OrgMembers year of graduation
     * @param sID OrgMembers student ID 
     * @param gDP Staff specific position for games
     * 
     */
    public Staff(String fN,String lN,int gY,
            int sID, String gDP)
    {
        super(fN, lN, "Manager", gY,sID);
        this.gameDayPosition = gDP;
    }

    /**
     *  Gets the specific position of the manager on game days
     * 
     * @return the position of which the Staff Member holds in on game day
     */
    public String getGameDayPosition() 
    {
        return gameDayPosition;
    }

    /**
     * Sets the param to game day position of OrgMember object 
     * 
     * @param gDP the position of which the Staff Member hold on
     * game day
     */
    public void setGameDayPosition(String gDP) 
    {
        this.gameDayPosition = gDP;
    }
    
    @Override
    public String toString()
    {
        String nameString = "Name: " + super.getName();
        String positionString = " | Position: " + super.getPosition();
        String gradYearString = " | Graduation Year: " + super.getGradYear();
        String studentIDString = " | Student ID: " + super.getStudentID();
        String gameDayPosString = " | Game Day Position: " + gameDayPosition;
        
        String output = nameString + positionString + gradYearString +
                        studentIDString + gameDayPosString;
        return output;
    }
    
    
}
