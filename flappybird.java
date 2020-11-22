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
    ground ground;
    Pipe Pipe;
    int pipeCount=0;
    
    /**
     * Constructor for objects of class flappybird.
     * 
     */
    public flappybird()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
       super(600, 400, 1,false); 
       setBackground(bgImage);
       populate();
       setPaintOrder(ground.class,bird1.class,Pipe.class);
    }
    
    public void act() 
    {
        createPipe();
        createGround();
    } 

    public void populate()

    {
        
        bird1 bird1 = new bird1();
        addObject(bird1, 80, 200);
    
        bird2 bird2 = new bird2();
    
        bird3 bird3 = new bird3();
    
        ground = new ground();
        addObject(ground, 309, getHeight()-25);

    }
    
    private void createGround(){
        if(getObjects(ground.class).size()<3){
            ground additionalGround = new ground();
            addObject(additionalGround, 905, getHeight()-25);
        }
    }
    
    public void createPipe(){
        Pipe topPipe = new Pipe("top");
        Pipe botPipe = new Pipe("bottom");
        
        int pipeSpacing =150;
        
        GreenfootImage image = botPipe.getImage();
         
        int numofpipes= Greenfoot.getRandomNumber(10)+4;
        
        pipeCount++;
        
        if(pipeCount>50){
            if(getObjects(Pipe.class).size()<numofpipes){
                addObject(botPipe,getWidth(),getHeight()/2+image.getHeight()-Greenfoot.getRandomNumber(100)-10);
                addObject(topPipe,getWidth(),botPipe.getY()-image.getHeight()-pipeSpacing);
            }
            pipeCount=0;
        }
    }
 }