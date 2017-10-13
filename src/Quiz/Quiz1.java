/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author wysom4034
 */
public class Quiz1 {
    private static int moveThings;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // create city/robot
        City Mexico = new City();
        Robot Cole = new Robot(Mexico,1,1, Direction.EAST);
        //create walls
        new Wall(Mexico,1,3,Direction.NORTH);
        new Wall(Mexico,1,4,Direction.NORTH);
        new Wall(Mexico,1,5,Direction.NORTH);
        new Wall(Mexico,1,6,Direction.NORTH);
        new Wall(Mexico,1,7,Direction.NORTH);
        new Wall(Mexico,1,7,Direction.EAST);
        new Wall(Mexico,1,3,Direction.SOUTH);
        new Wall(Mexico,1,4,Direction.SOUTH);
        new Wall(Mexico,1,5,Direction.SOUTH);
        new Wall(Mexico,1,6,Direction.SOUTH);
        new Wall(Mexico,1,7,Direction.SOUTH);
        new Wall(Mexico,1,1,Direction.WEST);
        //create things
        new Thing(Mexico,1,3);
        new Thing(Mexico,1,4);
        new Thing(Mexico,1,5);
        new Thing(Mexico,1,6);
        new Thing(Mexico,1,7);
        //make robot pick up things 
        
        for (int moveThing = 0; moveThing < 6; moveThings = moveThing +1){
        while(Cole.frontIsClear()){
          Cole.move();
          
        
       
     if(Cole.canPickThing()){
        Cole.pickThing();
        Cole.turnLeft();
        Cole.turnLeft();
      
   
        }
         
     }
        
        while(!Cole.frontIsClear()){
            Cole.putThing();
            Cole.turnLeft();
            Cole.turnLeft();
        }
      
        }
        
   
       
        
        
        
        
        
        
        
        
      
        
        
    
      
      
      
    }
}
