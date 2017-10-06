/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author wysom4034
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         City Mexico = new City();
        
        //create robot
        Robot Tye = new Robot(Mexico,0,2,Direction. WEST);
                
        new Wall(Mexico,1,1,Direction.NORTH);
        new Wall(Mexico,1,2,Direction.NORTH);
        new Wall(Mexico,1,2,Direction.EAST);
        new Wall(Mexico,2,2,Direction.EAST);
        new Wall(Mexico,2,2,Direction.SOUTH);
        new Wall(Mexico,2,1,Direction.SOUTH);
        new Wall(Mexico,1,1,Direction.WEST);
        new Wall(Mexico,2,1,Direction.WEST);
       //make tye move
        Tye.move();
        Tye.move();
        Tye.turnLeft();
        
        int counter =0;
        while (counter<7){
       Tye.move();
       Tye.move();
       Tye.move();
       Tye.turnLeft();
        counter = counter+1;
}
        Tye.move();
        
        
        
        
       
      
      
              
              
    }
}
