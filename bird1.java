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
   
    GreenfootImage bird_image_1 = new GreenfootImage("flappybird1.png");
    GreenfootImage bird_image_2 = new GreenfootImage("flappybird2.png");
    GreenfootImage bird_image_3 = new GreenfootImage("flappybird3.png");
    
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
        checkCollisions();
    }
    
    public void apllyGravity()
    {
        addBirdY((int)velocity);
        velocity +=Gravity;
        animateBird();
        setLocation(getBirdX(),getBirdY());
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
        if(velocity < 1){
            setRotation(-30); 
        }else if(velocity < 8){
            setRotation(0);
        }else if(velocity < 12){
            setRotation(30);
        }else if(velocity < 90){
            setRotation(90);
        }
    }  
    
    public void animateBird()
    {
        frame++;
        
        if(frame < 1 * animationDelay){
            setImage(bird_image_1);
        }
        else if(frame < 2 * animationDelay){
            setImage(bird_image_2);
        }
        else if(frame < 3 * animationDelay){
            setImage(bird_image_3);
            frame = 0; 
        }
        
    } 
    
    public void checkCollisions(){
        Actor ground = getOneIntersectingObject(ground.class);
        Actor Pipe = getOneIntersectingObject(Pipe.class);
        if(ground != null || Pipe != null){
            setLocation(getX(), 322);
            Greenfoot.stop();
        }
    } 
}
