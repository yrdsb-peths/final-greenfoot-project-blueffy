import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Sets pipe image and location and speed to be used for later code.
 * @author (Ashkan Siassi) 
 * @version (a version number or a date)
 */
public class Pipe extends Actor
{
    public static int pipeSpeed = -4;
    /**
     * Sets a fixed pipe location.
     */
    public void act()
    {
        // Add your action code here.
        
        setLocation(getX() + pipeSpeed, getY());
    }
}
