package factory;
/**
 * @author seannary
 */
public abstract class Bike {
    protected String name;
    protected double price;
    protected int numWheels;
    protected boolean hasPedals;
    protected boolean hasTrainingWheels;

    /** 
     * This function creates a string representation of all the processes that go into assembling a bike.
     * @return String - list of the processes that take place for that specific type of bike
     */
    public String assembleBike()
    {
        if(hasPedals)
            return "Creating a "+this.name+"\n"+createFrame()+"\n"+addWheels()+"\n"+addPedals();
        else
            return "Creating a "+this.name+"\n"+createFrame()+"\n"+addWheels();
    }

    
    /** 
     * This function creates a string represenation of the specific bikes frame.
     * @return String - the assembly for that specific bike 
     */
    private String createFrame()
    {
        return "- Assembling "+name+" frame.";
    }
    
    
    /** 
     * Decides whether bike has training wheels and returns both fields of information
     * @return String - number of wheels and if bike has training wheels
     */
    private String addWheels()
    {
        if(hasTrainingWheels)
        {
            return "- Adding "+numWheels+" wheel(s).\n- Adding training wheels";
        }
        else
            return "- Adding "+numWheels+" wheel(s).";
    }

    
    /** 
     * If called in assembleBike will add pedals
     * @return String - adds pedals
     */
    private String addPedals()
    {
        return "- Adding pedals.";
    }

    
    /** 
     * Returns price of the bike depending on bike model
     * @return double - bike price
     */
    public double getPrice()
    {
        return this.price;
    }
}
