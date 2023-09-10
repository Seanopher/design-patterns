package observer;
/**
 * @author seannary
 * 
 */
import java.util.ArrayList;

public class Golfer implements Subject {
    private ArrayList<Observer> observers;
    private String name;

    public Golfer(String name)
    {
        this.name = name;
        observers = new ArrayList<Observer>();
    }
    
    /** 
     * @param observer - passes observer object to register in observer arraylist
     */
    public void registerObserver(Observer observer)
    {
        observers.add(observer);
    }
    /**
     * @param observer - passes observer object to remove from observer arraylist
     */
    public void removeObserver(Observer observer)
    {
        observers.remove(observer);
    }
    /**
     * 
     * @param strokes - passes stroke int to update golfers strokes for hole and round
     * @param par - passes par int to update course par for hole and round
     */
    public void notifyObservers(int strokes, int par)
    {
        for(Observer observer: observers)
        {
            observer.update(strokes, par);
        }
    }
    /**
     * 
     * @param strokes - passes stroke int to update golfers strokes for hole and round
     * @param par - passes par int to update course par for hole and round
     */
    public void enterScore(int strokes, int par)
    {
        notifyObservers(strokes, par);
    }

    /**
     * 
     * @return returns golfers name
     */
    public String getName()
    {
        return this.name;
    }
}
