import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**.
 * Creates score to be instantiated in MyWorld.
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
    /**
     * Creates score object, font, location, and color. 
     */
    public Score()
    {
        GreenfootImage newImage = new GreenfootImage(100, 50);
        newImage.setColor(Color.WHITE);
        
        newImage.setFont (new Font ("OCR A Extended", true, false, 40));

        setImage(newImage);
    }
    /**
     * Sets score size.
     */
    public void setScore(int score)
    {
        GreenfootImage newImage = getImage();
        newImage.clear();
        newImage.drawString("" + score, 30, 30);
        setImage(newImage);
    }
}
