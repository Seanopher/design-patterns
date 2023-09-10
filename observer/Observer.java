package observer;
/**
 * @author seannary
 * Interface utilized by all observer classes such as RoundScoreDisplay and HoleScoreDisplay
 */
public interface Observer {
    public void update(int strokes, int par);
    public String toString();
}
