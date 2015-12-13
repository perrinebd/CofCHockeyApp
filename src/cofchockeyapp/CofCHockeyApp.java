/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

This is an application for the College of Charleston Ice Hockey team

 */
package cofchockeyapp;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Brett Perrine
 */
public class CofCHockeyApp 
{
    
    public CofCHockeyApp()
    {
    }
    
    /**
     * Prints out the numbered menu of options via the console
     */
        public static void mainMenu()
    {
        System.out.println();
        System.out.println("-------------------------------------------------");
        System.out.println("Enter from the following options or -1 to quit. ");
        System.out.println();
        System.out.println("1: View Roster ");
        System.out.println("2: View Schedule ");
        System.out.println("3: View Staff ");
        System.out.println("4: Add player ");
        System.out.println("5: Add Game ");
        System.out.println("6: Add Staff Member ");
        System.out.println("7: Update Player Stats");
        System.out.println("8: Update Game Results");
        System.out.println("9: Save Roster");
        System.out.println("10: View Saved Information ");
        System.out.println("-------------------------------------------------");
        System.out.println();
        System.out.print("Enter here: ");
    }
   
    /**
     * Creates an empty ArrayList of OrgMember in Team class, populates it with
     * One Staff object and one Coach object.
     * 
     * @return new OrgMember of type Staff created by user input and adds it
     * to the ArrayList Team which is populated by Staff members
     */
    public static Team createStaff()
    {
        // new Team object, staff, which can be populated with any OrgMember
        Team staff = new Team(); 
        
        // Default Staff to populate ArrayList
        Staff jordynP = new Staff("Jordyn", "Pursell", 2016, 2000394,
                                    "Score keeper");
        
        // Default Coach to populate ArrayList
        Coach mikeH = new Coach("Dave", "Jarman", "Charleston StingRays");
        
        staff.addStaff(jordynP); // Staff to show up in testing
        staff.addCoach(mikeH); //Coach to show up in testing
        return staff;
    }
   
    /**
     * Creates an ArrayList of Game objects as well as the Game objects to
     * populate the list.
     * 
     * @return an ArrayList of Game objects
     */
    public static Schedule createSchedule()
    {
       // Createsm a Schedule object that is an ArrayList composed of Game objects
        Schedule schedule = new Schedule();
        
        // Three default Game Objects to populate ArrayList schedule
        Game citadel = new Game("Citadel", "Charleston, SC", "08/21/2015", 
                                "6:30 PM");
        Game FSU = new Game("Florida State University", "Tallahassee, FL", 
                            "09/24/2015", "7:30 PM");
        Game CCU = new Game("Coastal Carolina University", "Myrtle Beach, SC", 
                            "10/14/15", "8:00 PM",2, 1, "Win");
        
        // adding the three defaults to the ArrayList schedule
        schedule.addGame(citadel);
        schedule.addGame(FSU);
        schedule.addGame(CCU);
        
        return schedule;
    }
    
        /**
     * Creates an ArrayList of Player objects as well as two Player objects to
     * populate the list.
     * 
     * @return ArrayList of Player objects
     */
    public static Team createTeam()
    {
        // Creates a Team object that is an ArrayList of Player objects
        Team roster = new Team();

        // Two default Player Objects to populate the roster
        Player brettP = new Player("Brett", "Perrine", "Defense", 21, 2017, 
                    20064966);
         

        Player rileyK = new Player("Riley", "Krupen", "forward", 20, 2018, 
                20034567, 6, 1, 210, "L");
        
        Player artemiP = new Player("Artemi", "Panarin", "forward", 72, 2019, 
                                     20037408, 5, 1, 115, "L");
        
        Player jLeblanc = new Player("Justin", "LeBlanc", "Forward", 15, 2019, 
                                     20394884, 5, 11, 195, "R");
        
        brettP.setStats(5,8,2,17);
        rileyK.setStats(7,9,12,9);
        artemiP.setStats(3,7,4,5);
        
        // adding the two default Player objects to the ArrayList roster
        roster.addPlayer(brettP);
        roster.addPlayer(rileyK);
        roster.addPlayer(artemiP);
        roster.addPlayer(jLeblanc);

        return roster;
    }
    
    
    /**
     * Creates a new Player object by prompting user input using the console
     * and saves the new Player to an the parameter.
     * Allows user to choose to print out new player or call setPlayerStats()
     * to continue adding attributes.
     * 
     * @param roster an ArrayList of Player objects
     */
    public static void createPlayer(Team roster)
    {
        Scanner in = new Scanner(System.in);
        System.out.println();
        Player newPlayer;
        
        // gathering basic OrgMember information to pass to the super class
        System.out.print("Enter the players first name: ");
        String firstName = in.next();
        
        System.out.print("Enter the players last name: ");
        String lastName = in.next();
       
        System.out.print("Enter the players position:  ");
        String position = in.next();
        
        System.out.print("Enter the players number:  ");
        int num = in.nextInt();
        
        System.out.print("Enter the players graduation year:  ");
        int gY = in.nextInt();
        
        System.out.print("Enter the players student ID:  ");
        int iD = in.nextInt();
        
        // ensures the height of the player will be within a plausable range
        System.out.print("Enter the players height in FEET: ");
        int hF = in.nextInt();
  
        // ensures that the value of inches is legitimate
        System.out.print("Enter the players height (INCHES) left: ");
        int hI = in.nextInt();

        // ensures the weight of th eplayer is within a plausable range
        System.out.print("Enter the players weight: ");
        int w = in.nextInt();
        
        System.out.print("Enter the players shooting direction (L or R): ");
        String shot = in.next();
        
        
        newPlayer = new Player(firstName, lastName, position, num,  
                                      gY, iD, hF, hI, w, shot);
        roster.addPlayer(newPlayer);
        
                
    // asking the user if they would like to enter the statistics or view player
        System.out.println();
        System.out.println("Would you like to enter this players stats? ");
        System.out.println();
        System.out.println("1: Yes");
        System.out.println("2: No");
        System.out.println();
        System.out.print("Enter here: ");
        
        int stats;
        stats = in.nextInt();
        
        switch (stats) {
            case 1:
                setPlayerStats(newPlayer);
                break;
            case 2:
                System.out.println();
                System.out.println("Here is " + newPlayer.getName() + "'s "
                        + "information: ");
                System.out.println();
                System.out.println(newPlayer.toString());
                break;
            default:
                System.out.println();
                System.out.println(" | You were supposed to input an integer | ");                
                break;
        }
        

    }
    
    /**
     * Allows the user to create a new Staff of type OrgMember with a series of
     * prompts. Method also prints the new members information to the console
     * 
     * @param staff is an ArrayList of type Team
     * @return ArrayList staff with the new Staff Member added
     */
    public static Team createStaffMember(Team staff)
    {
        // building a new scanner to get user input
        Scanner in = new Scanner(System.in);
        System.out.println();
        
        // series of prompts to collect OrgMember information
        System.out.print("Enter the staff member's first name: ");
        String firstName = in.next();
        
        System.out.print("Enter the staff member's last name: ");
        String lastName = in.next();
        
        System.out.print("Enter the staff member's graduation year:  ");
        int gradYear = in.nextInt();
        

        System.out.print("Enter the staff member's student ID:  ");
        int iD = in.nextInt();
        
        System.out.print("Enter staff member's game day position: ");
        String gDPosition = in.next();
        
        //Passes newStaffMember information to constructor
        Staff newStaffMember = new Staff(firstName, lastName ,gradYear, iD, gDPosition);
        
        //Adds newStaffMEmber to ArrayList of OrgMember objects
        staff.addStaff(newStaffMember);  
        System.out.println();
        System.out.println("This is your new Staff Member: ");
            
        return staff;
    }
    

    /**
     * Sets the game statistics for the game object it is passed.
     * @param game object to update statistics for.
     */
    public static void setGameStats(Game game)
    {
            Scanner in = new Scanner(System.in);
            System.out.println();
            
            System.out.print("Enter the game result (Ex. C of C Wins): ");
            String outcome = in.nextLine();
            
            // ensures only positive input for the number of goals scored
            System.out.print("Enter the number of goals scored by C of C: ");
            int gF = in.nextInt();

            
            // ensures only positive input for the nubmer of goals against
            System.out.print("Enter the number of goals scored by the opponent: ");
            int gA = in.nextInt();
            
            
            game.setGameStats(gF, gA, outcome); // sets input to game object
            System.out.println();
            
            //prints out updated game
            System.out.println("Here is your updated game:");
            System.out.println();
            System.out.println(game.toString());
            
    }
    
    /**
     * Sets the statistics (goals, assists, games played and penalty minutes)
     * for the Player object passed as a parameter.
     * 
     * @param newPlayer a Player object to have its statistics updated.
     *  
     */
    public static void setPlayerStats(Player newPlayer) 
    {
        try {
            
            // Scanner object to get user input
            Scanner in = new Scanner(System.in);
            
           
            System.out.println();
            System.out.print("Enter the players goals: ");
            
            int g = in.nextInt();
            // ensuring goals cannot be negative, thows exception is otherwise.
            if (g < 0)
               throw new NegativeStatException("This cannot be a negative "
                                                   + "number...");
            
            
            // ensuring assists cannot be negative, thows exception is otherwise.
            System.out.print("Enter the players assists: ");
            int a = in.nextInt();
            if (a < 0)
                throw new NegativeStatException("This cannot be a "
                                                    + "negative integer...");
            
       // ensuring games played cannot be negative, thows exception is otherwise.
            System.out.print("Enter the players games played: ");
            int gP = in.nextInt();
            if (gP < 0)
                throw new NegativeStatException("This cannot be a "
                                                    + "negative integer...");
           
            // ensuring PIMS cannot be negative, thows exception is otherwise.
            System.out.print("Enter the players Penalty Minutes: ");
            int pIMS = in.nextInt();
            if (pIMS < 0)
                throw new NegativeStatException("This cannot be a "
                                                    + "negative integer...");
            
            
            newPlayer.setStats(gP, g, a, pIMS); //setting newPlayer's stats
          //  newPlayer.setAssists(6);
          //  System.out.println(checkPlayerStats(newPlayer, gP, g, a, pIMS));
           // assert checkPlayerStats(newPlayer, gP, g, a, pIMS) : "Test";
            
            
            // new menu to prompt if user wants to view completed player
            System.out.println();
            System.out.println("Would you like to view your updated player? ");
            System.out.println();
            System.out.println("3: View Player");
            System.out.println();
            System.out.print("Enter any other integer go back to the main menu: ");
            
            
            // if vP (view player)  = 3 the player is printed, if not switch 
            // breaks and returns to main menu.
            int vP = in.nextInt();
            switch (vP) {
                case 3:
                    System.out.println();
                    System.out.println("Here is " + newPlayer.getName() + "'s "
                            + "information:");
                    System.out.println();
                    System.out.println(newPlayer.toString());
                    break;
                default:
                    break;
            }
            
        } 
        
        catch (NegativeStatException e) {
            System.err.println("That Wasn't a valid statistic!");    
            setPlayerStats(newPlayer);
        }
        
    }
  
    /** Creates a new Game object by prompting the user for input and places it 
     * in an ArrayList, schedule, composed of Game objects.
     *
     * @param schedule
     * 
     */
    public static void createGame(Schedule schedule)
    {
     
            
            // scanner object for user input
            Scanner in = new Scanner(System.in);
            
            System.out.println();
            System.out.print("Enter the opponents name: ");
            String name = in.nextLine();
            
            System.out.print("Enter the location: ");
            String location = in.nextLine();
            
            System.out.print("Enter the date of the game in format XX/XX/XXXX: ");
            String day = in.nextLine();
            
            System.out.print("Enter the games start time: ");
            String start = in.nextLine();
            
            Game newGame = new Game(name, location, day, start);
            
            schedule.addGame(newGame);
            System.out.println("You have entered: ");
            System.out.println();
                
            System.out.println(newGame.toString());
    }
  
    /**
     * Prompts user for the jersey number (int) of the player they are searching
     * for.
     * 
     * @param roster is an ArrayList of game
     * @return Player the user was searching for with int(playerNumber)
     * @throws NegativeStatException, which ensures the user inputs a legitimate
     * numerical value to search.
     */
    public static Player findPlayer(Team roster)
    {
        
        try {
            
            //scanner for user input
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the number of the Player who's stats you'd");
            System.out.print("like to update update: ");
            
            int playerNum = in.nextInt();
            
            // ensuring the user inputs a valid player number
            if (playerNum <= 0 || playerNum >= 99)
                throw new NegativeStatException("There are only numbers between"
                                              + "1 and 99");
            System.out.println();
            
            // loops through the roster, returns the player with the same number
            // as user input
            for (int i = 0; i < roster.size(); i++)
            {
                Player current = roster.getPlayer(i);
                
                if (playerNum == current.getPlayerNum()) 
                {
                    System.out.println("Enter " + current.getName() + "'s stats");
                    return roster.getPlayer(i);
                }
            }
            
            return null;
        } catch (NegativeStatException e) {
            findPlayer(roster);
        }
        return roster.getPlayer(0);
    }
    
    /**
     * Finds a game within the schedule based on its numerical value (in order
     * of entry).
     * @param schedule
     * @return Game that the user was searching for
     */
    public static Game findGame(Schedule schedule)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the game number: ");
        
        int gameNum = in.nextInt();
        System.out.println();
        
        // calls findGame() which loops indexes the schedule with the number
        // of the game in order based on date
        Game game = schedule.findGame(gameNum -1);
        System.out.println("Enter the statistics for the game against " 
                            + game.getOpponent() + " on " + game.getDay());
        
        return game;
    }
    
    public static boolean checkPlayerStats(Player p, int gP, int g, int a, 
                                            int pIMS)
    {
         return !(p.getGamesPlayed() != gP || p.getGoals() != g || p.getAssists() != a
                 || p.getPenaltyMinutes() != pIMS);
    }
    
    /**
     * Prints out a welcome statement as well as creates instances of two teams
     * roster and staff as well as a schedule.  By calling mainMenu() the user 
     * is presented with options based on integer input to access the functions
     * they would like to perform.  All of this is within a try-catch which 
     * terminates the program, as will user input of -1.
     * 
     * @param args
     */
    
    
    public static void saveRoster(Team roster)
    {
        FileWriter myWriter = null;
        int length = roster.size();
        
        try {
            myWriter = new FileWriter("players.txt");
        
        for (int i = 0; i < length; i++)
        {
            Player p = roster.getPlayer(i); 
            
            System.out.println("***** IN WRITER CLASS ***** " + p);
            myWriter.write("Player: " + p.getName() + " | Position: " + 
                            p.getPosition() + "\n");
            
        } 
        
        }
        catch (IOException e) {
            System.err.println("IOException: " + "Something went wrong.");
        } 
        finally{
            try {
            myWriter.close();
        } catch (IOException e) {
            System.err.println("IOExcetion: " + "Couldn't close file.");
        }
        }
    }
    
    public static void readRoster(Team roster) 
    {
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader("players.txt"));
            String temp;     
            while ((temp = reader.readLine()) != null)
            {
                System.out.println("***** IN READER CLASS *****");
                String [] fields = temp.split("\\|");
                String [] playerNameFields = fields[0].split(":");
                String [] playerPosFields = fields[1].split(":");
                
                String name = playerNameFields[1];
                String pos = playerPosFields[1]; 
                
                System.out.println(name);
                System.out.println(pos);
                Player p = new Player(name, pos);
                roster.addPlayer(p);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.err.println("FileNotFoundException: " + "that file doesn't exist!");
        }
        catch (IOException e){
            System.err.println("File IO Exception");
        }
    }
    
    public static void main(String[] args) 
    {
        System.out.println("Welcome to the College of Charleston Men's Ice " +
                           " Hockey app!");
        System.out.println();
        
        Schedule schedule = createSchedule(); // creates an instance of schedule
        Team roster = createTeam(); // creates an instance of roster
        Team staff = createStaff(); // creates an instance of staff
        
        
         
        Scanner in = new Scanner(System.in);
        
       boolean carryOn = true; // allows while loop to continue until -1 is input
       
       try{
            while(carryOn)
            {
                mainMenu();
                int value = in.nextInt(); // user input

                if (value == 1)
                {
                 System.out.println(roster); // prints ArrayList roster 
                   
                }
                else if (value == 2)
                {
                   System.out.println(schedule); // prints ArrayList schedule
                }
                else if (value == 3)
                {
                    System.out.println(staff); // prints ArrayList staff
                }
                else if (value == 4)   
                {
                   createPlayer(roster); // allows user to create new player
                }

                else if (value == 5)
                {
                   createGame(schedule); // allows user to create new game
                }
                 
                else if (value == 6)
                {
                   createStaffMember(staff);  // allows user to create new staff member
                }
                
                else if (value == 7)
                {
                   Player p =findPlayer(roster); // finds player then updates player stats
                   setPlayerStats(p);         
                }
                
                else if (value == 8)
                {
                    setGameStats(findGame(schedule)); // finds game and updates its stats
                }
                
                else if (value == 9)
                {
                    saveRoster(roster);
                }
                
                else if (value == 10)
                {
                    readRoster(roster);
                }
                else if (value == -1)
                {
                    carryOn = false; // exits program
                }
                
                
                else
                {
                     System.out.println("That was not an option!!");
                }
            }
        }
        catch (InputMismatchException e) 
        {
            System.err.println("InputMismatchException: " + 
                               "You were told to enter an integer!");
        }

        System.out.println("Thank you for visiting, Go Cougars!");
    }
    
}

    

