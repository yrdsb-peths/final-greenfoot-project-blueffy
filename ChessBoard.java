import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
/**
 * Write a description of class ChessBoard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ChessBoard extends World
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setBounds(10, 10, 512, 512);
        JPanel pn = new JPanel()
        {
            public void paint(Graphics g)
            {
                boolean white = true;
                for (int i=0; i<8; i++)
                {
                    for (int r=0; r<8; r++)
                    {
                        if (white)
                        {
                            g.setColor(Color.white);
                        }
                        else
                        {
                            g.setColor(Color.black);
                        }
                        g.fillRect(i*64, r*64, 64, 64);
                        white =! white;
                    }
                    white =! white;
                }
                    
            }
        };
        frame.add(pn);
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);
    }
    /**
     * Constructor for objects of class ChessBoard.
     * 
     */
    public ChessBoard()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
    }
}
