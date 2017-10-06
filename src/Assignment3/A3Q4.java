 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;
import java.awt.Color;

/**
 *
 * @author wysom4034
 */
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        City Mexico = new City();
        Robot Cole = new Robot(Mexico,3,3, Direction.SOUTH);
        Cole.setColor(Color.MAGENTA);
        
       //create 4 2by2 squares
        new Wall(Mexico,2,2,Direction.EAST);
        new Wall(Mexico,1,2,Direction.EAST);
        new Wall(Mexico,1,2,Direction.NORTH);
        new Wall(Mexico,1,1,Direction.NORTH);
        new Wall(Mexico,1,1,Direction.WEST);
        new Wall(Mexico,2,1,Direction.WEST);
        new Wall(Mexico,2,2,Direction.SOUTH);
        new Wall(Mexico,2,1,Direction.SOUTH);
        
        new Wall(Mexico,2,4,Direction.SOUTH);
        new Wall(Mexico,2,5,Direction.SOUTH);
        new Wall(Mexico,2,4,Direction.WEST);
        new Wall(Mexico,1,4,Direction.WEST);
        new Wall(Mexico,1,4,Direction.NORTH);
        new Wall(Mexico,1,5,Direction.NORTH);
        new Wall(Mexico,1,5,Direction.EAST);
        new Wall(Mexico,2,5,Direction.EAST);
        
        new Wall(Mexico,5,4,Direction.SOUTH);
        new Wall(Mexico,5,5,Direction.SOUTH);
        new Wall(Mexico,5,4,Direction.WEST);
        new Wall(Mexico,4,4,Direction.WEST);
        new Wall(Mexico,4,4,Direction.NORTH);
        new Wall(Mexico,4,5,Direction.NORTH);
        new Wall(Mexico,4,5,Direction.EAST);
        new Wall(Mexico,5,5,Direction.EAST);
       
        new Wall(Mexico,5,2,Direction.EAST);
        new Wall(Mexico,4,2,Direction.EAST);
        new Wall(Mexico,4,2,Direction.NORTH);
        new Wall(Mexico,4,1,Direction.NORTH);
        new Wall(Mexico,5,1,Direction.WEST);
        new Wall(Mexico,4,1,Direction.WEST);
        new Wall(Mexico,5,2,Direction.SOUTH);
        new Wall(Mexico,5,1,Direction.SOUTH);
        //making robot cycle around the 4 squares
        int passedCenter =1;
         for(int passed = 4;passed<5; passed = passed +1)
        while(passedCenter<2){
        
        Cole.move();
        Cole.move();
        Cole.move();
        Cole.turnLeft();
        Cole.move();
        Cole.move();
        Cole.move();
        Cole.turnLeft();
        Cole.move();
        Cole.move();
        Cole.move();
        Cole.turnLeft();
        Cole.move();
        Cole.move();
        Cole.move();
        
        }
        
    }
}
