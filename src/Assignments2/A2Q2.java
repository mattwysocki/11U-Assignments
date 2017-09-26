/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignments2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/**
 *
 * @author wysom4034
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create City
        City Mexico = new City();
        // create Robot
              Robot Cole = new Robot(Mexico,4,1, Direction.EAST);
              Cole.setColor(Color.PINK);
              // create wall
              new Wall (Mexico,4,1, Direction.SOUTH);
              new Wall (Mexico,4,2, Direction.SOUTH);
              new Wall (Mexico,4,3, Direction.SOUTH);
              new Wall (Mexico,4,4, Direction.SOUTH);
              new Wall (Mexico,4,5, Direction.SOUTH);
              new Wall (Mexico,4,6, Direction.SOUTH);
              new Wall (Mexico,4,7, Direction.SOUTH);
              new Wall (Mexico,4,8, Direction.SOUTH);
              new Wall (Mexico,4,9, Direction.SOUTH);
              new Wall (Mexico,4,1, Direction.EAST);
              new Wall (Mexico,4,2, Direction.EAST);
              new Wall (Mexico,4,4, Direction.EAST);
              new Wall (Mexico,4,7, Direction.EAST);
              new Thing (Mexico,4,9);
             //make robot run "race"
              Cole.turnLeft();
              Cole.move();
              Cole.turnLeft();
              Cole.turnLeft();
              Cole.turnLeft();
              Cole.move();
              Cole.turnLeft();
              Cole.turnLeft();
              Cole.turnLeft();
              Cole.move();
              Cole.turnLeft();
              Cole.turnLeft();
              Cole.move();
              Cole.turnLeft();
              Cole.turnLeft();
              Cole.turnLeft();
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
              Cole.turnLeft();
              Cole.turnLeft();
              Cole.turnLeft();
              Cole.move();
              Cole.turnLeft();
              Cole.move();
              Cole.move();
              Cole.turnLeft();
              Cole.move();
              Cole.turnLeft();
              Cole.turnLeft();
              Cole.turnLeft();
              Cole.move();
              Cole.turnLeft();
              Cole.turnLeft();
              Cole.turnLeft();
              Cole.move();
              Cole.turnLeft();
              Cole.move();
              
              
    }
}
