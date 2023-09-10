package observer;

/**
 * This class calculates and displays the total score for the whole round
 * @author seannary
 * 
 */

public class RoundScoreDisplay implements Observer {
    private Subject golfer;
    private int strokesTotal;
    private int parTotal;

    public RoundScoreDisplay(Subject golfer)
    {
        this.golfer = golfer;
        golfer.registerObserver(this);
    }
    
    /** 
     * 
     * @param strokesTotal - passes strokes to keep adding to total
     * @param parTotal - passes par to continue adding to total
     */
    public void update(int strokesTotal, int parTotal)
    {
        this.strokesTotal += strokesTotal;
        this.parTotal += parTotal;
        toString();
    }

    /**
     * @return returns  round total for par and strokes
     */
    public String toString()
    {
        if(strokesTotal>parTotal)
            return "Overall stats: Par("+this.parTotal+") Strokes ("+this.strokesTotal+"), "+(strokesTotal-parTotal)+" over par";
        else if (strokesTotal<parTotal)
            return "Overall stats: Par("+this.parTotal+") Strokes ("+this.strokesTotal+"), "+(parTotal-strokesTotal)+" under par";
        else
            return "Overall stats: Par("+this.parTotal+") Strokes ("+this.strokesTotal+"), Making par";
    }
}
