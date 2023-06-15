import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Flappy Bird's object mechanics and world physics.
 * @author (Ashkan Siassi) 
 * @version (a version number or a date)
 */
public class FlappyBird extends Actor
{
     double dy = 0;
     double gravity = 0.4;
     double launchSpeed = -7;
     int imageIndex = 0;
     GreenfootImage[] anim = new GreenfootImage[5];
     GreenfootSound flapSound = new GreenfootSound("flap.mp3");
     GreenfootSound hitSound = new GreenfootSound("hit.mp3");
    /**
     * Sets Flappy Bird's starting position in addition to creating all of its mechanics
     * and animations which utilizes the world's physics values like gravity and launch
     * speed.
     * Includes a death mechanic where game ends on Flappy Bird contact with pipe or ground.
     */
    public void act()
    {
        // Add your action code here.
        setLocation(getX(), (int) (getY() + dy));
        
        // Changes the bird's angle depending on its velocity
        rotateFlappyBird();
                
        // Makes Flappy Bird fly with the click of up arrow
        if (Greenfoot.isKeyDown("up"))
        {
            dy = launchSpeed;
            flapSound.play();
            for (int i = 0; i < anim.length; i++)
            {
                anim[i] = new GreenfootImage("images/flappybird_anim/tile00" + i + ".png");
            }
            setImage(anim[imageIndex]);
            imageIndex = (imageIndex + 1) % anim.length;
        }
        dy = dy + gravity;
        
    
        // Draws game over screen when flappy bird hits the ground
        MyWorld world = (MyWorld) getWorld();
        if (getY()+100 >= world.getHeight())
        {
            world.gameOver();
            hitSound.play();
        }
        //Draws game over screen flappy bird hits a pipe
        if (getOneIntersectingObject(Pipe.class) != null)
        {
            world.gameOver();
            hitSound.play();
        }
    }
    public void rotateFlappyBird()
        {
            if (dy < -5)
            {
                setRotation(-30);
            }
            else if (dy < -4 && dy > -5)
            {
                setRotation(-20);
            }
            else if (dy < -3 && dy > -4)
            {
                setRotation(-10);
            }
            else if (dy < -2 && dy > -3)
            {
                setRotation(0);
            }
            else if (dy < -1 && dy > -2)
            {
                setRotation(10);
            }
            else if (dy < 0 && dy > -1)
            {
                setRotation(20);
            }
            else if (dy < 1 && dy > 0)
            {
                setRotation(30);
            }
            else if (dy < 2 && dy > 1)
            {
                setRotation(40);
            }
            else if (dy < 3 && dy > 2)
            {
                setRotation(50);
            }
            else if (dy < 4 && dy > 3)
            {
                setRotation(60);
            }
            else if (dy < 5 && dy > 4)
            {
                setRotation(70);
            }
            else if (dy < 6 && dy > 5)
            {
                setRotation(80);
            }
        }
}
