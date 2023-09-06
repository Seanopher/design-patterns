package strategy;
/*
 * @author seannary
 */
public class StripBehavior implements DefenseBehavior
{
    // returns string dependant upon defender stripping ball
    public String play()
    {
        return "strips a ball from runners hands.";
    }      
}
