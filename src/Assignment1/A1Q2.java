/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author wysom4034
 */
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create new city called Mexico
        City Mexico = new City();
        
        //create robot
        Robot Tye = new Robot(Mexico,1,2,Direction.SOUTH);
                
        new Wall(Mexico,1,1,Direction.NORTH);
        new Wall(Mexico,1,2,Direction.NORTH);
        new Wall(Mexico,1,2,Direction.SOUTH);
        new Wall(Mexico,1,1,Direction.WEST);
        new Wall(Mexico,2,1,Direction.SOUTH);
        new Wall(Mexico,2,1,Direction.WEST);
        new Wall(Mexico,1,2, Direction.EAST);
        new Thing(Mexico,2,2);
       //Make Tye move
        Tye.turnLeft();
        Tye.turnLeft();
        Tye.turnLeft();
        Tye.move();
        Tye.turnLeft();
        Tye.move();
        Tye.turnLeft();
        Tye.move();
        Tye.pickThing();
        Tye.turnLeft();
        Tye.turnLeft();
        Tye.move();
        Tye.turnLeft();
        Tye.turnLeft();
        Tye.turnLeft();
        Tye.move();
        Tye.turnLeft();
        Tye.turnLeft();
        Tye.turnLeft();
        Tye.move();
        
        
        
    }
}
