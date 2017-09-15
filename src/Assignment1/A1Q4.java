/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author wysom4034
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City Mexico = new City();
        
        //create robot
        Robot Tye = new Robot(Mexico,0,0,Direction.SOUTH);
        Robot Matt = new Robot(Mexico,0,1,Direction.SOUTH);
        
        new Wall(Mexico,0,1, Direction.WEST);
        new Wall(Mexico,1,1, Direction.WEST);
        new Wall(Mexico,1,1, Direction.SOUTH);
        
        Tye.move();
        Matt.move();
        Tye.move();
        Matt.turnLeft();
        Matt.move();
        Matt.turnLeft();
        Matt.turnLeft();
        Matt.turnLeft();
        Matt.move();
        Tye.turnLeft();
        Matt.turnLeft();
        Matt.turnLeft();
        Matt.turnLeft();
        Tye.move();
        Matt.move();
        
        
        
        
        
    }
}
