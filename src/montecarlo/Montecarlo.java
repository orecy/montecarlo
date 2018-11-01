/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package montecarlo;
import java.math.*;
import java.lang.*;

/**
 *
 * @author ORECY
 */
public class Montecarlo {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        double x;
        
        double sum=0;
            
        for (int i=1; i<=1000; i++){
        
            x = Math.random () *Math.PI;
            
            double  y =Math.pow(Math.cos(x), 2) + Math.pow(Math.sin(x), 2);
            
            sum= sum + y;
            
    }
        double estimation =Math.PI * sum/1000;
     System.out.println("The likely estimation is"+estimation);
           
    }
    
    
}
