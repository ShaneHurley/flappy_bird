import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pipe here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pipe extends SharedResources
{
    GreenfootImage top = new GreenfootImage("top_pipe.png");
    GreenfootImage bottom = new GreenfootImage("bottom_pipe.png");

    /**
     * Act - do whatever the Pipe wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveLeft();
        removePipe();
    }
    
    public Pipe(String sel) {
        this.xSpeed =4;
        if(sel == "top") {
            setImage(top);
        } else if(sel == "bottom") {
            setImage(bottom);
        }
    }
    
    public void moveLeft() {
        setLocation(getX() - xSpeed, getY());
    }
    
    public void removePipe() {
        if(getX() < -getImage().getWidth() / 2) {
            getWorld().removeObject(this);
        }
    }
}
