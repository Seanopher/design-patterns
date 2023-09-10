package observer;
/**
 * Interface class utilized by the Golfer class
 * @author seannary
 */
public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers(int strokes, int par);
}
