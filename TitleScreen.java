import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{

    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    public void act()
    {
        if (Greenfoot.isKeyDown("up"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        GetReadyLabel getReadyLabel = new GetReadyLabel();
        addObject(getReadyLabel,300,92);
        InstructionLabel instructionLabel = new InstructionLabel();
        addObject(instructionLabel,301,201);
        InstructionLabel2 instructionLabel2 = new InstructionLabel2();
        addObject(instructionLabel2,311,299);
        instructionLabel2.setLocation(253,304);
        instructionLabel2.setLocation(393,270);
        instructionLabel2.setLocation(229,287);
        instructionLabel2.setLocation(391,335);
        instructionLabel2.setLocation(287,248);
        instructionLabel.setLocation(338,280);
        instructionLabel.setLocation(295,163);
        instructionLabel.setLocation(300,182);
        instructionLabel2.setLocation(311,284);
        instructionLabel.setLocation(292,191);
        instructionLabel.setLocation(309,207);
        instructionLabel.setLocation(292,184);
        instructionLabel2.setLocation(300,287);
        instructionLabel.setLocation(292,199);
        instructionLabel.setLocation(302,200);
        instructionLabel.setLocation(289,187);
        instructionLabel.setLocation(307,187);
    }
}
