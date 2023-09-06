package strategy;

import java.util.Random;
/*
 * @author seannary
 */

 // function will randomly decide what route receiver will run
public class ReceiveBehavior implements OffenseBehavior 
{
       public String play()
    {
        String[] behavior =  {"slant route", "out route", "seem route", "screen pass", "hail mary"};
        Random random = new Random();
        int upperBound = 5;
        int behaviorNum = random.nextInt(upperBound);
        return ("runs a "+behavior[behaviorNum]);
    }    
}
