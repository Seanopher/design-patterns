package strategy;

import java.util.Random;
/*
 * @author seannary
 */
public class BlockBehavior implements DefenseBehavior
{
    // function will randomly return what kind of block defender has made
    public String play()
    {
        String[] behavior =  {"kick", "punt", "pass", "catch"};
        Random random = new Random();
        int upperBound = 4;
        int behaviorNum = random.nextInt(upperBound);
        return ("blocks a "+behavior[behaviorNum]);
    }    
}
