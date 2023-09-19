package decorator;

public class Paint extends VehicleDecorator {
    
    public Paint(Vehicle vehicle, String color)
    {
        super(vehicle.lines);
        String black ="\u001B[0m"; String red = "\u001B[31m"; String green ="\u001B[32m"; String yellow = "\u001B[33m"; String blue = "\u001B[34m"; String purple = "\u001B[35m"; String cyan = "\u001B[36m";
        if(color.equalsIgnoreCase("Red"))
        {
            System.out.println(red);
        }
        else if(color.equalsIgnoreCase("Green"))
        {
            System.out.println(green);
        }
        else if(color.equals(yellow))
        {
            System.out.println(yellow);
        }
        else if(color.equals(blue))
        {
            System.out.println(blue);
        }
        else if(color.equals(purple))
        {
            System.out.println(purple);
        }
        else if(color.equals(cyan))
        {
            System.out.println(cyan);
        }
        integrateDecor(FileReader.getLines("design-patterns/decorator/txt/rims.txt"));
    }
}
