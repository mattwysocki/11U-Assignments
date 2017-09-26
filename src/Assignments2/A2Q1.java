/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignments2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import java.awt.Color;

/**
 *
 * @author wysom4034
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create City
        City Mexico = new City();
        // create Robot
              Robot Cole = new Robot(Mexico,1,1, Direction.EAST);
              Cole.setColor(Color.PINK);
              //create thing
              new Thing (Mexico,1,2);
              new Thing (Mexico,1,3);
              new Thing (Mexico,1,4);
              new Thing (Mexico,1,5);
              new Thing (Mexico,1,6);
              new Thing (Mexico,1,7);
              new Thing (Mexico,1,8);
              new Thing (Mexico,1,9);
              new Thing (Mexico,1,10);
              new Thing (Mexico,1,11);
              //make robot pick up 7 things
            while(Cole.countThingsInBackpack() < 7){
              Cole.move();
              Cole.pickThing();
            }
              Cole.move();
              Cole.move();
              Cole.move();
              Cole.move();

 
     
                      
                      
                      
    }
    
}
