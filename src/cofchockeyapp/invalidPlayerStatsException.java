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
public class invalidPlayerStatsException extends Exception 
{
    public invalidPlayerStatsException(String message)throws invalidPlayerStatsException
    {
        System.err.println(message);
    }
}
