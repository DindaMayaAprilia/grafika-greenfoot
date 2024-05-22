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
        super(300, 500, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        kodok kodok = new kodok();
        addObject(kodok,151,433);
        candy1 candy1 = new candy1();
        addObject(candy1,29,216);
        candy2 candy2 = new candy2();
        addObject(candy2,255,43);
        candy3 candy3 = new candy3();
        addObject(candy3,275,184);
        candy4 candy4 = new candy4();
        addObject(candy4,127,148);
        candy5 candy5 = new candy5();
        addObject(candy5,53,100);
        no1 no1 = new no1();
        addObject(no1,20,13);
        no2 no2 = new no2();
        addObject(no2,134,231);
        no3 no3 = new no3();
        addObject(no3,196,78);
        Counter counter = new Counter("");
        addObject(counter,54,475);
        Counter2 counter2 = new Counter2("HP :");
        addObject(counter2,242,476);
    }
}
