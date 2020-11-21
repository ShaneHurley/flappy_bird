import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SharedResources here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SharedResources extends Actor
{
    protected  int BirdX = 80;
    protected  int BirdY = 200;
    protected  int animationDelay = 4;
    protected  int frame = 0;
    
    /**
     * Act - do whatever the SharedResources wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }
    
     protected int getBirdX(){
        return BirdX;
    }
    
     protected int getBirdY(){
        return BirdY;
    }
    
     protected void addBirdY(double x){
         BirdY += (int)x;
    }
    
     
}
