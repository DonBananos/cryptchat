package startApp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import model.JohnPreusObj;

/**
 *
 * @author Mike
 */
public class CryptChat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        theMethod();
        theSecondMethod();
        createAJohn();
    }
    
    public static void theMethod(){
        System.out.println("Mike, Heini and Chris rocks!!!!!!");
    }
    
    public static void theSecondMethod()
    {
        System.out.println("Oh, they really rock hard!");
    }
    
    public static void createAJohn()
    {
        JohnPreusObj john = new JohnPreusObj(5000);
        System.out.print(john.getNumberOfSmokes());
        System.out.println(" smokes a day!");
    }
    
}
