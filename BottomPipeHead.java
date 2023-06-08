import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BottomPipeHead here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BottomPipeHead extends Pipe
{
    /**
     * Act - do whatever the BottomPipeHead wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        setLocation(getX() + Pipe.pipeSpeed, getY());
    }
}
