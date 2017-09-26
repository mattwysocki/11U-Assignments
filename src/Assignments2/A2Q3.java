/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignments2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import java.awt.Color;

/**
 *
 * @author wysom4034
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create City
        City Mexico = new City();
        // create Robot
              Robot Cole = new Robot(Mexico,17,10, Direction.EAST);
              Cole.setColor(Color.PINK);
              
              
       while(Cole.getDirection()!= Direction.NORTH)
                  
                   Cole.turnLeft();
             
              while(Cole.getAvenue()!=0 
                      && Cole.getStreet()!=0){
                  
               Cole.move();
              }
              
                  if(!Cole.frontIsClear());{
                     
                      Cole.turnLeft();
    }
                  
                  while(Cole.getAvenue()!=0){
                      Cole.move();
                  }
                  
                  
                  
    }
}
