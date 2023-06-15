import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (Ashkan Siassi) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    int pipeCounter = 0;
    int flappyBirdCounter = 0;
    int pipeSpacing = 150;
    int score = 0;
    int firstPipe = 225;
    Score scoreObj = null;
    GreenfootSound pointSound = new GreenfootSound("point.mp3");
    /**
     * Constructor for objects of class MyWorld.
     * Creates and instantiates Flappy Bird along with a score label.
     * Sets object prioritization, essentially what should mask over the other. 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false);
        
        //Allows the following classes and objects to mask over the other based on priority order.
        setPaintOrder(Score.class, FlappyBird.class, Pipe.class);
        
        //Create Flappy Bird
        FlappyBird flappy = new FlappyBird();
        
        //Instantiate Flappy Bird into the world
        addObject(flappy, 100, getHeight()/2);
        
        //Create a score object
        scoreObj = new Score();
        scoreObj.setScore(0);
        
        addObject(scoreObj, getWidth()/2, 100);
    }
    public void act()
    {
        pipeCounter ++;
        if (pipeCounter % 100 == 0)
        {
            createPipes();
        }
        
        if (pipeCounter >= firstPipe)
        {
            if (flappyBirdCounter % 100 == 0)
            {
                score++;
                scoreObj.setScore(score);
                pointSound.play();
            }
            flappyBirdCounter++;
        }
    }
    public void createPipes()
    {
        Pipe thePipe = new Pipe();
        Pipe.pipeSpeed = -4;
            
        GreenfootImage image = thePipe.getImage();
            
        addObject(thePipe, getWidth(), getHeight()/2 + image.getHeight()/2 + Greenfoot.getRandomNumber(image.getHeight()/2 - 25));
            
        Pipe topPipe = new Pipe();
        addObject(topPipe, getWidth(), getHeight());
        topPipe.setLocation(thePipe.getX(), thePipe.getY() - thePipe.getImage().getHeight() - pipeSpacing);
            
        BottomPipeHead bottomPipeMouth = new BottomPipeHead();
        addObject(bottomPipeMouth, getWidth(), getHeight());
        bottomPipeMouth.setLocation(thePipe.getX(), thePipe.getY() + 138 - thePipe.getImage().getHeight());
            
        TopPipeHead topPipeMouth = new TopPipeHead();
        addObject(topPipeMouth, getWidth(), getHeight());
        topPipeMouth.setLocation(thePipe.getX(), thePipe.getY() + 9 - thePipe.getImage().getHeight()); 
    }
    public void gameOver()
    {
        GameOverLabel gg = new GameOverLabel();
        addObject(gg, getWidth()/2, getHeight()/2);
        pipeCounter = 0;
        Greenfoot.stop();
    }
}
