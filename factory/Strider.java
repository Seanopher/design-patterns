package factory;
/**
 * @author seannary
 */
public class Strider extends Bike {
    /**
     * This constructor sets all the variables for the strider that were abstract in the bike class.
     */
    public Strider()
    {
        name = "strider";
        price = 100;
        numWheels = 2;
        hasPedals = false;
        hasTrainingWheels = false; 
    }
}
