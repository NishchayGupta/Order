/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

import java.util.Date;

/**
 *
 * @author 1895269
 */
public class Order {
    
    Date date;
    String number;
    public Date getDate() {
        return date;
    }

    public String getNumber() {
        return number;
    }

    public void setDate(Date date) {
        date = date;
    }

    public void setNumber(String number) {
        number = number;
    }
    
    private void Confirm()
    {   
        System.out.println("confirm ");
    }
    private void close()
    {
         System.out.println("close");
    }
    
}
