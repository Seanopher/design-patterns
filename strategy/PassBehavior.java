package strategy;

import java.util.Random;
/*
 * @author seannary
 */
public class PassBehavior implements OffenseBehavior 
{
    // randomly decides pass behavior for qb on offense
    public String play()
    {
        String[] behavior =  {"slant route", "out route", "seem route", "screen pass", "hail mary"};
        Random random = new Random();
        int upperBound = 5;
        int behaviorNum = random.nextInt(upperBound);
        return ("throws a "+behavior[behaviorNum]);
    }    
}
