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
public class NegativeStatException extends Exception 
{
    public NegativeStatException(String message)throws NegativeStatException
    {
          System.err.println(message);
    }
}