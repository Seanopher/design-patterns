package factory;
/**
 * @author seannary
 */
public class KidsBike extends Bike {
    /**
     * This constructor sets all the variables for the kidsbike that were abstract in the bike class.
     */
    public KidsBike()
    {
        name = "kids bike";
        price = 150;
        numWheels = 2;
        hasPedals = true;
        hasTrainingWheels = true;
    }
}
