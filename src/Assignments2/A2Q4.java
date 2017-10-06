/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignments2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author wysom4034
 */
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create City
        City Mexico = new City();
        // create robot
        Robot Cole = new Robot(Mexico, 0, 0, Direction.EAST);
        //create outer towers
        new Wall(Mexico, 1, 1, Direction.WEST);
        new Wall(Mexico, 1, 1, Direction.NORTH);
        new Wall(Mexico, 1, 1, Direction.EAST);
        new Wall(Mexico, 1, 1, Direction.SOUTH);
        new Wall(Mexico, 1, 4, Direction.WEST);
        new Wall(Mexico, 1, 4, Direction.SOUTH);
        new Wall(Mexico, 1, 4, Direction.NORTH);
        new Wall(Mexico, 1, 4, Direction.EAST);
        new Wall(Mexico, 4, 4, Direction.WEST);
        new Wall(Mexico, 4, 4, Direction.NORTH);
        new Wall(Mexico, 4, 4, Direction.EAST);
        new Wall(Mexico, 4, 4, Direction.SOUTH);
        new Wall(Mexico, 4, 1, Direction.WEST);
        new Wall(Mexico, 4, 1, Direction.EAST);
        new Wall(Mexico, 4, 1, Direction.SOUTH);
        new Wall(Mexico, 4, 1, Direction.NORTH);
        // create inner walls
        new Wall(Mexico, 2, 2, Direction.NORTH);
        new Wall(Mexico, 2, 3, Direction.NORTH);
        new Wall(Mexico, 2, 3, Direction.EAST);
        new Wall(Mexico, 3, 3, Direction.EAST);
        new Wall(Mexico, 3, 2, Direction.SOUTH);
        new Wall(Mexico, 3, 3, Direction.SOUTH);
        new Wall(Mexico, 2, 2, Direction.WEST);
        new Wall(Mexico, 3, 2, Direction.WEST);
        // make robot move

        while (true) {

            if (Cole.getDirection() == Direction.EAST
                    || Cole.getDirection() == Direction.WEST) {
                Cole.move();
                Cole.move();
                Cole.turnLeft();
                Cole.turnLeft();
                Cole.turnLeft();
                Cole.move();
                Cole.turnLeft();
                Cole.move();
                Cole.turnLeft();
                Cole.move();
                Cole.turnLeft();
                Cole.turnLeft();
                Cole.turnLeft();
                Cole.move();
                Cole.move();
                Cole.turnLeft();
                Cole.turnLeft();
                Cole.turnLeft();
            }
            if (Cole.getDirection() == Direction.NORTH
                    || Cole.getDirection() == Direction.SOUTH) {
                Cole.move();
                Cole.move();
                Cole.turnLeft();
                Cole.turnLeft();
                Cole.turnLeft();
                Cole.move();
                Cole.turnLeft();
                Cole.move();
                Cole.turnLeft();
                Cole.move();
                Cole.turnLeft();
                Cole.turnLeft();
                Cole.turnLeft();
                Cole.move();
                Cole.move();
                Cole.turnLeft();
                Cole.turnLeft();
                Cole.turnLeft();
       
                
                
            }
        }


    }
}
