import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pasir here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pasir extends World
{

    /**
     * Constructor for objects of class pasir.
     * 
     */
    public pasir()
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
        kodok kodok = new kodok();
        kodok kodok2 = new kodok();
        kodok kodok3 = new kodok();
        kodok kodok4 = new kodok();
        ulo ulo = new ulo();

        addObject(kodok,90,215);
        addObject(kodok2,372,85);
        addObject(kodok3,474,339);
        addObject(kodok4,266,275);
        addObject(ulo,527,153);
    }
}
