import java.awt.*;

/**
 * Created by chales on 11/6/2017.
 */
public class Astronaut {

    //VARIABLE DECLARATION SECTION
    //Here's where you state which variables you are going to use.
    public String name;                //holds the name of the hero
    public int xpos;                //the x position
    public int ypos;                //the y position
    public int dx;                    //the speed of the hero in the x direction
    public int dy;                    //the speed of the hero in the y direction
    public int width;
    public int height;
    public boolean isAlive;            //a boolean to denote if the hero is alive or dead.
    public Rectangle rec;
    public boolean isCrashing;

    public boolean isNorth;
    public boolean isSouth;
    public  boolean isLeft;
    public boolean isRight;


    // METHOD DEFINITION SECTION

    // Constructor Definition
    // A constructor builds the object when called and sets variable values.


    //This is a SECOND constructor that takes 3 parameters.  This allows us to specify the hero's name and position when we build it.
    // if you put in a String, an int and an int the program will use this constructor instead of the one above.
    public Astronaut(int pXpos, int pYpos) {
        xpos = pXpos;
        ypos = pYpos;
        dx =5;
        dy =2;
        width = 60;
        height =60;
        isAlive = true;
        rec = new Rectangle(xpos, ypos, width, height);
        isCrashing = false;
        isNorth = false;
        isSouth = false;
        isLeft = false;
        isRight = false;
    } // constructor

    //The move method.  Everytime this is run (or "called") the hero's x position and y position change by dx and dy
    public void move() {

        xpos = xpos + dx;
        ypos = ypos + dy;
        rec = new Rectangle(xpos, ypos, width, height);


    }

    public void bounce() {

        if(xpos < 0){ // bounce off the east wall
            dx = -dx;
        }
        //bounce west wall
        if(xpos > 1000-width){
            dx = -dx;
        }
        if(ypos < 0){ // bounce off the north wall
            dy = -dy;
        }
        //bounce south wall
        if(ypos > 700-height){
            dy = -dy;
        }
        xpos = xpos + dx;
        ypos = ypos + dy;
        rec = new Rectangle(xpos, ypos, width, height);


    }
    public void wrap(){

       // dy is 0
        if(isNorth == false && isSouth == false){
            dy = 0;
        } else if(isNorth){   //dy -3
            dy = -3;
        } else {   //dy 3
            dy = 3;
        }




//        if(isNorth == false){
//            dy = 0;
//        }

//        if(isSouth  == false){
//            dy = 0;
//        }
        //wrap west wall
        if(xpos < 0){
            xpos = 1000-width;
        }

        //wrap for east
        if(xpos > 1000-width){
            xpos = 0;
        }
        // wrap north
        if(ypos < 0){
            ypos = 700-height;
        }
        //south wall
        if(ypos >700-height){
            ypos = 0;
        }
        xpos = xpos + dx;
        ypos = ypos + dy;
        rec = new Rectangle(xpos, ypos, width, height);


    }

}






