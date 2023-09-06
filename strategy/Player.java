package strategy;

/**
 * An abstract football simulation player class
 * @author seannary
 * 
 */

 /**
  * Default constructor for player class
  */
public abstract class Player implements OffenseBehavior, DefenseBehavior
{
    private String firstName;
    private String lastName;
    private boolean offense;

    protected OffenseBehavior offenseBehavior;
    protected DefenseBehavior defenseBehavior;

/**
 *  Parameterized constructor for Player class
 * @param firstName imports player firstName
 * @param lastName imports player lastName
 * @param offense imports offense boolean value
 * 
 */
    public Player(String firstName, String lastName, boolean offense)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.offense = offense;
    }

    /**
     * sets defense and offense behavior via child class
     */
    public abstract void setDefenseBehavior();
    public abstract void setOffenseBehavior();


    /**
     * checks whether player is playing and returns their behavior
     */
    public String play()
    {
        setOffenseBehavior();
        setDefenseBehavior();
        if(offense)
        {
            if(offenseBehavior==null)
                return "Not playing";
            return offenseBehavior.play();
        }
        else
        {
            if(defenseBehavior==null)
                return "Not playing";
            return defenseBehavior.play();
        }
    }
    

    /**
     * changes turnover value on player input
     */
    public void turnover()
    {
        if(offense)
            offense=false;
        else
            offense = true;
    }
    /**
     * returns player first name and last name as one string
     */
    public String toString()
    {
        return(this.firstName+" "+this.lastName);
    }
}
