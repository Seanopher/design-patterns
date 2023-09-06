package strategy;
/*
 * @author seannary
 */

 // creates receiver utilizing super class constructor
public class Receiver extends Player{
    public Receiver(String firstName, String lastName, boolean offense)
    {
        super(firstName, lastName, offense);
    }
    // sets offensive behavior
    public void setOffenseBehavior()
    {
        offenseBehavior = new ReceiveBehavior();
    }
    // sets receiver behavior to null when on defense
    public void setDefenseBehavior()
    {
        defenseBehavior = null;
    }
}
