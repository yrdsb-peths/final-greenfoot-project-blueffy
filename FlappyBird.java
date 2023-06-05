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
     double gravity = 1.3;
    /**
     * Act - do whatever the FlappyBird wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        setLocation(getX(), (int) (getY() + dy));
        
        // Makes Flappy Bird fly with the click of up arrow
        if (Greenfoot.isKeyDown("up") == true)
        {
            dy = -15;
        }
        dy = dy + gravity;
        
        // Draws game over screen when flappy bird hits the ground
        MyWorld world = (MyWorld) getWorld();
        if (getY()+100 >= world.getHeight())
        {
            dy = 0;
            gravity = 0;
            world.gameOver();
        }
    }
}
