package factory;
/**
 * @author seannary
 */

public class BikeStore {
    public BikeStore() {}
    /** 
     * This function initializes the bike and determines what type upon user input
     * @param type - the type of bike to be created
     * @return Bike - the new bike which has a type
     */
    public Bike createBike(String type)
    {
        Bike bike;

        if(type.equals("tricycle"))
        {
            bike = new Tricycle();
        }
        else if(type.equals("strider"))
        {
            bike = new Strider();
        }
        else
        {
            bike = new KidsBike();
        }
        
        return bike;
    }
}
