package strategy;

import java.util.Random;
/*
 * @author seannary
 */

 
public class RunBehavior implements OffenseBehavior 
{
    // function randomly decides what run play will be chosen
   public String play()
    {
        String[] behavior =  {"drive(up the gut)", "draw", "pitch", "reverse"};
        Random random = new Random();
        int upperBound = 4;
        int behaviorNum = random.nextInt(upperBound);
        return ("runs a "+behavior[behaviorNum]);
    }    
}