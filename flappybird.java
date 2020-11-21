import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class flappybird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class flappybird extends World
{
    GreenfootImage bgImage = new GreenfootImage("background.png");
    GreenfootImage bird1 = new GreenfootImage("flappybird1.png");
    GreenfootImage bird2 = new GreenfootImage("flappybird2.png");
    GreenfootImage bird3 = new GreenfootImage("flappybird3.png");
    GreenfootImage ground = new GreenfootImage("ground.png");

    /**
     * Constructor for objects of class flappybird.
     * 
     */
    public flappybird()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
       super(600, 400, 1); 
       setBackground(bgImage);
       populate();
    }
    

    public void populate()

    {
        
    bird1 bird1 = new bird1();
    addObject(bird1, 80, 200);
    
    bird2 bird2 = new bird2();
    
    bird3 bird3 = new bird3();

    bottomPipe bp = new bottomPipe();
    addObject(bp, 200, 375);
    
    topPipe tp = new topPipe();
    addObject(tp, 200, 0);
    
    ground g = new ground();
    addObject(g, 300, 375);

    }
 }