import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class no1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class no1 extends no
{
    /**
     * Act - do whatever the no1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
      void cetakbaru(){
        no1 no1=new no1();
        getWorld().addObject(no1,Greenfoot.getRandomNumber(300),0);
    }
    void maju(){
        setLocation(getX(),getY()+2);
    }
    public void act()
    {
        super.act();
    }
}
