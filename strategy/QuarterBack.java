package strategy;
import java.util.Random;

/**
 * @author seannary
 */

 /* contstructor for quarterback .. utilizes parents super constructor
  * 
  */
public class QuarterBack extends Player{
    
    public QuarterBack(String firstName, String lastName, boolean offense)
    {
        super(firstName, lastName, offense);
       
    }
/*
 * randomly decides whether quarterback will be passing or running the ball
 */
    public void setOffenseBehavior()
    {
        Random rand = new Random();
        int decide = rand.nextInt(2);
        if(decide==1)
            offenseBehavior = new PassBehavior();
        else
            offenseBehavior = new RunBehavior();
    }
// sets qb behavior to null when on defense
    public void setDefenseBehavior()
    {
        defenseBehavior = null;
    }
}
