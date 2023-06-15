import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Creates top pipe head to be instatiated in MyWorld.
 * @author (Ashkan Siassi) 
 * @version (a version number or a date)
 */
public class TopPipeHead extends Pipe
{
    /**
     * Act - do whatever the TopPipeHead wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        setLocation(getX() + pipeSpeed, getY());
    }
}
