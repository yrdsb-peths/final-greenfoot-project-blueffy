import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public Score()
    {
        GreenfootImage newImage = new GreenfootImage(100, 50);
        newImage.setColor(Color.WHITE);
        
        newImage.setFont (new Font ("OCR A Extended", true, false, 40));

        setImage(newImage);
    }
    
    public void setScore(int score)
    {
        GreenfootImage newImage = getImage();
        newImage.clear();
        newImage.drawString("" + score, 30, 30);
        setImage(newImage);
    }
}
