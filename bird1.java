import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bird1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bird1 extends SharedResources
{
    
    int velocity2 = 0;
       private static final double boostSpeed = -6;
   
    static final private double Gravity = .5;
    private double velocity = 0;
    
    /**
     * Act - do whatever the bird1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        apllyGravity();  
        checkKeys();
        rotateBird();
      
    }
    
    public void apllyGravity()
    {
        if(getBirdY() >= 375){
        
        }else{
        addBirdY((int)velocity);
        }
        velocity +=Gravity;
        animateBird();
    }    
    
    public void checkKeys()
    {
        if(Greenfoot.isKeyDown("space") || Greenfoot.mouseClicked(null))
        {
            velocity = boostSpeed;
        }
    }  
    
    public void rotateBird()
    {
        setLocation(getBirdX(),getBirdY());
    }  
    
    public void animateBird()
    {
        frame++;
        if(frame < 1 * animationDelay){
            setImage(bird1);
        }
        /*if(frame < 2 * animationDelay){
            setImage("flappybirdbird2.png");
        }
        if(frame < 3 * animationDelay){
            setImage("flappybirdbird3.png");
            frame = 0; 
        }*/
        
    } 
}
