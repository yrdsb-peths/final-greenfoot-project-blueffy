import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BottomPipeHead here.
 * Creates bottom pipe head to be instatiated in MyWorld.
 * @author (Ashkan Siassi) 
 * @version (a version number or a date)
 */
public class BottomPipeHead extends Pipe
{
    public void act()
    {
        // Add your action code here.
        setLocation(getX() + Pipe.pipeSpeed, getY());
    }
}
