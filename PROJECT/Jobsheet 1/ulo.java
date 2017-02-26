import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ulo extends Actor
{
    /**
     * Act - do whatever the ulo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int score = 0;
    
    public void act() 
    {
        getWorld().showText("Score = "+score, 50, 20);
        move(2);
        
        if(Greenfoot.isKeyDown("right")){
            turn(2);
        }
        if(Greenfoot.isKeyDown("left")){
            turn(-2);
        }
        
        if(isTouching(kodok.class)){
            eat();
        }
    }
    
    public void eat(){
        removeTouching(kodok.class);
        score++;
    }
}
