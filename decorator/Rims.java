package decorator;

public class Rims extends VehicleDecorator {
    public Rims(Vehicle vehicle)
    {
        super(vehicle.lines);
        integrateDecor(FileReader.getLines("design-patterns/decorator/txt/rims.txt"));
    }
}
