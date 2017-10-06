/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/**
 *
 * @author wysom4034
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City Mexico = new City();
        Robot Dav = new Robot(Mexico,1,1, Direction.EAST);
        Mexico.showThingCounts(true);
        //create things
        new Thing (Mexico,1,2);
        new Thing (Mexico,1,2);
        new Thing (Mexico,1,2);
        new Thing (Mexico,1,2);
        new Thing (Mexico,1,2);
        new Thing (Mexico,1,2);
        new Thing (Mexico,1,2);
        new Thing (Mexico,1,2);
        new Thing (Mexico,1,2);
        new Thing (Mexico,1,2);
           Dav.move();
        // make Dav pick up each thing
       int pickThing = 10;
        for(int count = 0;count<10; count = count +1){
       while(pickThing<9);{
        Dav.pickThing();
        Dav.move();
        Dav.putThing();
        Dav.turnLeft();
        Dav.turnLeft();
        Dav.move();
        Dav.turnLeft();
        Dav.turnLeft();
        pickThing = pickThing+1;
        }
            
     
        }
    
}
}
