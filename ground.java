import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ground here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ground extends SharedResources
{
    /**
     * Act - do whatever the ground wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        moveLeft();
        removeGround();
    }
    
    public void removeGround() {
        if(getX() < -getImage().getWidth()/2) {
            getWorld().removeObject(this);
        }
    }

    public void moveLeft() {
        setLocation(getX() - xSpeed, getY());
    }
}

