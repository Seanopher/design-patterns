package strategy;

import java.util.Random;
/*
 * @author seannary
 */
public class Lineman extends Player{
    // creates lineman object 
    public Lineman(String firstName, String lastName, boolean offense)
    {
        super(firstName, lastName, offense);
    }
    // sets offense behavior for oline
    public void setOffenseBehavior()
    {
        offenseBehavior = new OBlockBehavior();
    }
    // randomizes defensive behavior for lineman
    public void setDefenseBehavior()
    {
        Random rand = new Random();
        int decide = rand.nextInt(3);
        if(decide==0)
            defenseBehavior = new BlockBehavior();
        else if (decide==1)
            defenseBehavior = new StripBehavior();
        else
            defenseBehavior = new SackBehavior();
    }
}
