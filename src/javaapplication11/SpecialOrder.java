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
public class SpecialOrder 
{
    Date date;
    String number;
   
    public Date getDate() {
        return date;
    }

    public String getNumber() {
        return number;
    }

    public void setDate(Date newDate) {
        date = newDate;
    }

    public void setNumber(String newNumber) {
        number = newNumber;
    }
    
    
    public void confirm()
    {
        System.out.println("This is method of Confirm");
    }
    
    public void close()
    {
        System.out.println("This is method of Close");
    }
    
    public void dispatch()
    {
        System.out.println("This is method of Dispatch");
    }
}