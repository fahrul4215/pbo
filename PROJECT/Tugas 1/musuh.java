import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class musuh here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class musuh extends Actor
{
    /**
     * Act - do whatever the musuh wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move(-10);
        
        if(isAtEdge()){
            setLocation(400+Greenfoot.getRandomNumber(200), Greenfoot.getRandomNumber(400));
        }
    }    
}
