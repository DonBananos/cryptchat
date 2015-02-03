/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author HM
 */
public class JohnPreusObj {
    private int numberOfSmokes = 1000;
    private final int kondiTal = 1;
    
    
    public JohnPreusObj(int numberOfSmokes)
    {
        this.setNumberOfSmokes(numberOfSmokes);
    }
    
    public int getNumberOfSmokes()
    {
        return this.numberOfSmokes;
    }
    
    private void setNumberOfSmokes(int newNumberOfSmokes)
    {
        this.numberOfSmokes = newNumberOfSmokes;
    }
}
