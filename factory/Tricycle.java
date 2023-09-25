package factory;
/**
 * @author seannary
 */
public class Tricycle extends Bike {
    /**
     * This constructor sets all the variables for the tricycle that were abstract in the bike class.
     */
    public Tricycle()
    {
        name = "tricycle";
        price = 125;
        numWheels = 3;
        hasPedals = true;
        hasTrainingWheels = false;
    }
}
