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
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       City Mexico = new City();
        
        //create robot
        Robot Tye = new Robot(Mexico,0,1,Direction.WEST);
        Robot Matt = new Robot(Mexico,3,3,Direction.EAST);
        
        new Wall(Mexico,2,3, Direction.EAST);
        new Wall(Mexico,3,3, Direction.EAST);
        new Wall(Mexico,2,3, Direction.NORTH);
        new Wall(Mexico,2,3, Direction.WEST);
        new Wall(Mexico,3,3, Direction.SOUTH);
        
        new Thing (Mexico,2,2);
        new Thing (Mexico,1,2);
        new Thing (Mexico,1,1);
        new Thing (Mexico,0,0);
        new Thing (Mexico,1,0);
        
        Tye.move();
        Tye.pickThing();
        Matt.turnLeft();
        Matt.turnLeft();
        Matt.move();
        Matt.turnLeft();
        Matt.turnLeft();
        Matt.turnLeft();
        Matt.move();
        Matt.pickThing();
        Tye.turnLeft();
        Tye.move();
        Tye.pickThing();
        Matt.move();
        Matt.pickThing();
        Tye.turnLeft();
        Tye.move();
        Tye.pickThing();
        Matt.turnLeft();
        Matt.move();
        
        
    }
}
