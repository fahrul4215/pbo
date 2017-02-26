import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        kapal kapal = new kapal();

        addObject(kapal, 20, 163);
        
        for(int i=0;i<5;i++){
            tambahMusuh();
        }
    }
    
    public void tambahMusuh(){
        musuh musuh = new musuh();
        addObject(musuh, 550+Greenfoot.getRandomNumber(50), Greenfoot.getRandomNumber(400));
    }
}
