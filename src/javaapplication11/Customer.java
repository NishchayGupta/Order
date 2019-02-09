/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

/**
 *
 * @author 1894832
 */
public class Customer {
    String name;
    String location;
    
    public String getName()
    {
        return name;
    }
    
    public String getLoaction()
    {
        return location;
    }
    
    public void setName(String newName)
    {
        name = newName;
    }
    
    public void setLocation(String newLocation)
    {
        location = newLocation;
    }
    
    public void sendOrder()
    {
        System.out.println("This method is to send order");
    }
    
    public void receiveOrder()
    {
        System.out.println("This method is to receive order");
    }
}
