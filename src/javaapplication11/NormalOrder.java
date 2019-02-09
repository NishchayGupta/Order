/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

import java.util.Date;

/**
 *
 * @author 1895314
 */
public class NormalOrder extends Order{
    Date date;
    String number;
    
    public Date getDate() {
        return date;
    }

    public void setDate(Date newDate) {
        date = newDate;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String newNumber) {
        number = newNumber;
    }
    
    public void confirm()
    {
        System.out.println("This method is of Confirm");
    }
    
    public void close()
    {
        System.out.println("This method is of Close");
    }
    
    public void dispatch()
    {
        System.out.println("This method is of Dispatch");
    }
    
    public void receive()
    {
        System.out.println("This method is of Receive");
    }
}
