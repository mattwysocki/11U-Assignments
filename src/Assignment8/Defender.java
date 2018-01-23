/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment8;

import static Assignment8.Defender.HEIGHT;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;

/**
 *
 * @author wysom4034
 */
public class Defender extends JComponent {

    // Height and Width of our game
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    //Title of the window
    String title = "My Game";
    // sets the framerate and delay for our game
    // you just need to select an approproate framerate
    long desiredFPS = 60;
    long desiredTime = (1000) / desiredFPS;
    Rectangle[] Blocks = new Rectangle[7];
    // YOUR GAME VARIABLES WOULD GO HERE
    boolean startGame = true;
    //Font startGame = new Font ("arial",Font.BOLD, 65);
    Font endGame = new Font ("arial", Font.BOLD, 65);
    boolean Game = false;
    int paddleHeight = 60;
    int paddleWidth = 25;
    Rectangle player1 = new Rectangle(50, HEIGHT / 2 - paddleHeight / 2, paddleWidth, paddleHeight);
    Rectangle player2 = new Rectangle(WIDTH - 50 - paddleWidth, HEIGHT / 2 - paddleHeight / 2, paddleWidth, paddleHeight);
    int paddleSpeed = 5;
    boolean player1UP = false;
    boolean player1DOWN = false;
    boolean player2UP = false;
    boolean player2DOWN = false;
    int counter = 0;
    boolean playerMoving = false;
    // GAME VARIABLES END HERE  
    int player1Lives = 4;
    int player2Lives = 3;
    boolean trigger = false;
    int gunSize = 10;
    Rectangle gun = new Rectangle(paddleHeight, HEIGHT / 2 - gunSize / 2, gunSize, gunSize);
    int bulletXDirection = 1;
    int bulletYDirection = 1;
    int bulletSpeed = 15;
    boolean player2Moving = false;
    int counter2 = 0;
    boolean trigger2 = false;
    int gun2Size = 10;
    Rectangle gun2 = new Rectangle(paddleHeight, HEIGHT / 2 - gunSize / 2, gunSize, gunSize);
    int bullet2XDirection = -1;
    int bullet2YDirection = -1;

    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public Defender() {
        // creates a windows to show my game
        JFrame frame = new JFrame(title);

        // sets the size of my game
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        // adds the game to the window
        frame.add(this);

        // sets some options and size of the window automatically
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        // shows the window to the user
        frame.setVisible(true);

        // add listeners for keyboard and mouse
        frame.addKeyListener(new Defender.Keyboard());
        Defender.Mouse m = new Defender.Mouse();

        this.addMouseMotionListener(m);
        this.addMouseWheelListener(m);
        this.addMouseListener(m);
    }

    // drawing of the game happens in here
    // we use the Graphics object, g, to perform the drawing
    // NOTE: This is already double buffered!(helps with framerate/speed)
    @Override
    public void paintComponent(Graphics g) {
        // always clear the screen first!
        g.clearRect(0, 0, WIDTH, HEIGHT);

        // GAME DRAWING GOES HERE
        g.setColor(Color.LIGHT_GRAY);
        //draw black play surface
        g.fillRect(0, 0, WIDTH, HEIGHT);
        //switch to white
        g.setColor(Color.WHITE);
        //draw player1
        if (player1Lives > 0) {

            g.fillRect(gun2.x, gun2.y, gun2.width, gun2.height);
            g.fillRect(gun.x, gun.y, gun.width, gun.height);
        }
        
        g.drawString(""+ player1Lives, WIDTH/2 - 350, 75);
        g.drawString(""+ player2Lives, WIDTH/2 + 330, 75);
        g.setColor(Color.BLACK);
        //draw player2
        if (player2Lives > 0) {
            g.fillRect(player1.x, player1.y, player1.width, player1.height);
            g.fillRect(player2.x, player2.y, player2.width, player2.height);

            // GAME DRAWING ENDS HERE

        }
        g.setColor(Color.yellow);

        for (int i = 0; i < Blocks.length; i++) {
            g.fillRect(Blocks[i].x, Blocks[i].y, Blocks[i].width, Blocks[i].height);
            
        }
        
        //g.setColor (Color.CYAN)
        
        g.setColor(Color.CYAN);
        
        if(player1Lives ==0){
            g.setFont(endGame);
            g.drawString("end game",150,300);
        }
        
        if(player2Lives ==0){
            g.setFont(endGame);
            g.drawString("end game",150,300);
        }
        



    }

    // This method is used to do any pre-setup you might need to do
    // This is run before the game loop begins!
    public void preSetup() {
        // Any of your pre setup before the loop starts should go here
        int temp = 0;
        for (int i = 0; i < Blocks.length; i++) {
            Blocks[i] = new Rectangle(WIDTH/ 2, temp + 75, 15, 15);
            temp = Blocks[i].y;
        }





    }

    // The main game loop
    // In here is where all the logic for my game will go
    public void run() {
        // Used to keep track of time used to draw and update the game
        // This is used to limit the framerate later on
        long startTime;
        long deltaTime;

        preSetup();

        // the main game loop section
        // game will end if you set done = false;
        boolean done = false;
        while (!done) {
            // determines when we started so we can keep a framerate
            startTime = System.currentTimeMillis();

            // all your game rules and move is done in here
            // GAME LOGIC STARTS HERE 




            //shoot
            if (gun.x >= 800) {
                gun.x = player1.x + 25;
                gun.y = player1.y + 24;
                counter = 0;
                trigger = false;
            }

            if (trigger) {
                gun.x = gun.x + bulletXDirection * bulletSpeed;

            }

            if (!trigger) {
                if (playerMoving == true) {
                    gun.x = player1.x + 25;
                    gun.y = player1.y + 24;
                }
            }
            if (gun2.x <= 1) {
                gun2.x = player2.x - 10;
                gun2.y = player2.y + 25;
                counter2 = 0;
                trigger2 = false;
            }
            if (trigger2) {
                gun2.x = gun2.x + bullet2XDirection * bulletSpeed;

            }
            if (!(trigger2)) {
                if (player2Moving == true){
                gun2.x = player2.x - 10;
                gun2.y = player2.y + 24;
                }
            }
                


            //move player 1 (subtraction = UP)
            if (player1UP && player1.y > 0) {
                player1.y = player1.y - paddleSpeed;
            } else if (player1DOWN && player1.y + player1.height < HEIGHT) {
                player1.y = player1.y + paddleSpeed;

            }

            if (player2UP && player2.y > 0) {
                player2.y = player2.y - paddleSpeed;
            } else if (player2DOWN && player2.y + player2.height < HEIGHT) {
                player2.y = player2.y + paddleSpeed;
            }

            for (int i = 0; i < Blocks.length; i++){
            if (gun.intersects(Blocks[i])){
                Blocks[i].x = 999;
                trigger = false;
            }
         
            
        }

           for (int i = 0; i < Blocks.length; i++){
            if (gun2.intersects(Blocks[i])){
                Blocks[i].x = 999;
                trigger2 = false;
            }
           
           
        }
            // GAME LOGIC ENDS HERE 
            // update the drawing (calls paintComponent)
            repaint();

            // SLOWS DOWN THE GAME BASED ON THE FRAMERATE ABOVE
            // USING SOME SIMPLE MATH
            deltaTime = System.currentTimeMillis() - startTime;
            try {
                if (deltaTime > desiredTime) {
                    //took too much time, don't wait
                    Thread.sleep(1);
                } else {
                    // sleep to make up the extra time
                    Thread.sleep(desiredTime - deltaTime);
                }
            } catch (Exception e) {
            };

            if (gun.intersects(player2)) {
                gun.x = gun.x * 2000;
                player2Lives = player2Lives - 1;
                System.out.println(player2Lives);

            }

            if (gun2.intersects(player1)) {
                gun2.x = gun2.x * -2000;
                player1Lives = player1Lives - 1;
                System.out.println(player1Lives);
            
            }
           
            
        }
    }

    // Used to implement any of the Mouse Actions
    private class Mouse extends MouseAdapter {
        // if a mouse button has been pressed down

        @Override
        public void mousePressed(MouseEvent e) {
        }

        // if a mouse button has been released
        @Override
        public void mouseReleased(MouseEvent e) {
        }

        // if the scroll wheel has been moved
        @Override
        public void mouseWheelMoved(MouseWheelEvent e) {
        }

        // if the mouse has moved positions
        @Override
        public void mouseMoved(MouseEvent e) {
        }
    }

    // Used to implements any of the Keyboard Actions
    private class Keyboard extends KeyAdapter {
        // if a key has been pressed down

        @Override
        public void keyPressed(KeyEvent e) {
            //store the key being pressed
            int key = e.getKeyCode();
            //determine which key it is
            if (key == KeyEvent.VK_W) {
                player1UP = true;
                playerMoving = true;
            } else if (key == KeyEvent.VK_S) {
                player1DOWN = true;
                playerMoving = true;
            } else if (key == KeyEvent.VK_UP) {
                player2UP = true;
                player2Moving = true;
            } else if (key == KeyEvent.VK_DOWN) {
                player2DOWN = true;
                player2Moving = true;
            }
            if (key == KeyEvent.VK_SPACE) {
                    trigger = true;

            }
            if (key == KeyEvent.VK_L) { 
                    trigger2 = true;

            }
        }

        // if a key has been released
        @Override
        public void keyReleased(KeyEvent e) {
            int key = e.getKeyCode();
            //determine which key it is
            if (key == KeyEvent.VK_W) {
                player1UP = false;

            } else if (key == KeyEvent.VK_S) {
                player1DOWN = false;

            } else if (key == KeyEvent.VK_UP) {
                player2UP = false;

            } else if (key == KeyEvent.VK_DOWN) {
                player2DOWN = false;
            }
            
         
             if (key == KeyEvent.VK_SPACE) {
                //   trigger = false;
            }
            if (key == KeyEvent.VK_L) {
                //trigger2 = false;
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creates an instance of my game
        Defender game = new Defender();

        // starts the game loop
        game.run();
    }
}
