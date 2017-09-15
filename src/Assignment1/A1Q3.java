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
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          City Mexico = new City();
        
        //create robot
        Robot Tye = new Robot(Mexico,3,0,Direction.EAST);
        // create Walls
        new Wall(Mexico,3,2, Direction.WEST);
        new Wall(Mexico,3,2, Direction.NORTH);
        new Wall(Mexico,2,3, Direction.WEST);
        new Wall(Mexico,1,3, Direction.WEST);
        new Wall(Mexico,1,3, Direction.NORTH);
        new Wall(Mexico,1,3, Direction.EAST);
        new Wall(Mexico,2,4, Direction.NORTH);
        new Wall(Mexico,2,4, Direction.EAST);
        new Wall(Mexico,3,4, Direction.EAST);
        // Create thing
        new Thing(Mexico,0,3);
        Tye.move();
        Tye.turnLeft();
        Tye.move();
        Tye.turnLeft();
        Tye.turnLeft();
        Tye.turnLeft();
        Tye.move();
        Tye.turnLeft();
        Tye.move();
        Tye.move();
        Tye.turnLeft();
        Tye.turnLeft();
        Tye.turnLeft();
        Tye.move();
        Tye.pickThing();
        Tye.move();
        Tye.turnLeft();
        Tye.turnLeft();
        Tye.turnLeft();
        Tye.move();
        Tye.turnLeft();
        Tye.move();
        Tye.turnLeft();
        Tye.turnLeft();
        Tye.turnLeft();
        Tye.move();
        Tye.move();
        Tye.turnLeft();
        
        
        
        
        
        
        
    }
}
