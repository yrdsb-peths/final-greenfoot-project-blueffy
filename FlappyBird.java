import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FlappyBird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FlappyBird extends Actor
{
     double dy = 0;
     double gravity = 0.5;
     double launchSpeed = -8.5;
    /**
     * Act - do whatever the FlappyBird wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        setLocation(getX(), (int) (getY() + dy));
        
        // Changes the bird's angle depending on its velocity
        rotateFlappyBird();
                
        // Makes Flappy Bird fly with the click of up arrow
        if (Greenfoot.isKeyDown("up") == true)
        {
            dy = launchSpeed;
        }
        dy = dy + gravity;
        
    
        // Draws game over screen when flappy bird hits the ground
        MyWorld world = (MyWorld) getWorld();
        if (getY()+100 >= world.getHeight())
        {
            dy = 0;
            gravity = 0;
            Pipe.pipeSpeed = 0;
            MyWorld.counter = 0;
            world.gameOver();
        }
        //Draws game over screen flappy bird hits a pipe
        if (getOneIntersectingObject(Pipe.class) != null)
        {
            dy = 0;
            gravity = 0;
            Pipe.pipeSpeed = 0;
            MyWorld.counter = 0;
            world.gameOver();
        }
    }
    public void rotateFlappyBird()
        {
            if (dy < -5)
            {
                setRotation(-30);
            }
            else if (dy < -4 && dy > -5)
            {
                setRotation(-20);
            }
            else if (dy < -3 && dy > -4)
            {
                setRotation(-10);
            }
            else if (dy < -2 && dy > -3)
            {
                setRotation(0);
            }
            else if (dy < -1 && dy > -2)
            {
                setRotation(10);
            }
            else if (dy < 0 && dy > -1)
            {
                setRotation(20);
            }
            else if (dy < 1 && dy > 0)
            {
                setRotation(30);
            }
            else if (dy < 2 && dy > 1)
            {
                setRotation(40);
            }
            else if (dy < 3 && dy > 2)
            {
                setRotation(50);
            }
            else if (dy < 4 && dy > 3)
            {
                setRotation(60);
            }
            else if (dy < 5 && dy > 4)
            {
                setRotation(70);
            }
            else if (dy < 6 && dy > 5)
            {
                setRotation(80);
            }
        }
}
