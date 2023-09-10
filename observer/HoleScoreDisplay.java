package observer;

/**
 * This class calculates and displays the hole score
 * @author seannary
 * 
 */

public class HoleScoreDisplay implements Observer {
    private Subject golfer;
    private int strokes;
    private int par;
    
    public HoleScoreDisplay(Subject golfer)
    {
        this.golfer = golfer;
        golfer.registerObserver(this);
    }
    
    /** 
     * Updates player strokes and par then calls toString method
     * @param strokes - player strokes for that hole
     * @param par - the par value for that hole
     */
    public void update(int strokes, int par)
    {
        this.strokes = strokes;
        this.par = par;
        toString();
    }
    
    /** 
     * Creates a string representing the players current hole stats
     * @return String - a string representing the players current hole stats
     */
    public String toString()
    {
        if(strokes>par)
            return "Current Hole Stats: Par("+this.par+") Strokes ("+this.strokes+") "+(strokes-par)+" over par";
        else if (strokes<par)
            return "Current Hole Stats: Par("+this.par+") Strokes ("+this.strokes+") "+(par-strokes)+" under par";
        else
            return "Current Hole Stats: Par("+this.par+") Strokes ("+this.strokes+") making par";
    }
}
