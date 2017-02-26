import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class kapal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class kapal extends Actor
{
    /**
     * Act - do whatever the kapal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("up")){
            setLocation(getX(), getY()-5);
        }
        if(Greenfoot.isKeyDown("down")){
            setLocation(getX(), getY()+5);
        }
        if(isTouching(musuh.class)){
            Greenfoot.stop();
            getWorld().addObject(new kalah(), 300, 200);
            getWorld().showText("GAME OVER", 300, 250);
        }
    }    
}
