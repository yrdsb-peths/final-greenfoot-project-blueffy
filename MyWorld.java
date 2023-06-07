import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (Ashkan Siassi) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public static int counter = 0;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false);
        
        //Create Flappy Bird
        FlappyBird flappy = new FlappyBird();
        
        //Instantiate Flappy Bird into the world
        addObject(flappy, 100, getHeight()/2);
    }
    public void act()
    {
        counter ++;
        if (counter == 100)
        {
            Pipe thePipe = new Pipe();
            Pipe.pipeSpeed = -4;
            GreenfootImage image = thePipe.getImage();
            
            addObject(thePipe, getWidth(), getHeight()/2);
            counter = 0;
        }
    }
    public void gameOver()
    {
        GameOverLabel gg = new GameOverLabel();
        addObject(gg, getWidth()/2, getHeight()/2);
    }
}
