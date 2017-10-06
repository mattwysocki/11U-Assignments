/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import java.awt.Color;

/**
 *
 * @author wysom4034
 */
public class A3Q3 {
    private static int putThing;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        City Mexico = new City();
        Robot Cole = new Robot(Mexico,1,1, Direction.EAST, 20);   
        Cole.setColor(Color.MAGENTA);
       
        
     while(Cole.frontIsClear()){  
        int putThing =1;
         for(int count = 3;count<4; count = count +1)
        while(putThing<4){
           
            Cole.putThing();
            Cole.move();
            Cole.putThing();
            Cole.move();
            Cole.putThing();
            Cole.move();
            Cole.putThing();
            Cole.move();
            Cole.putThing();
            
        if(Cole.getDirection()== Direction.EAST){
            Cole.turnLeft();
            Cole.turnLeft();
            Cole.turnLeft();
            Cole.move();
            Cole.turnLeft();
            Cole.turnLeft();
            Cole.turnLeft();
        }else{
            Cole.turnLeft();
            Cole.move();
            Cole.turnLeft();  
         if(Cole.countThingsInBackpack()==0){
             Cole.wait();
         }
        }
        
        }
   
    }
}
}