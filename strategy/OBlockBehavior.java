package strategy;
/*
 * @author seannary
 */
public class OBlockBehavior implements OffenseBehavior 
{
    //returns string for oblock offenisve behavior
    public String play()
    {
        return "blocks defenders.";
    }    
}
