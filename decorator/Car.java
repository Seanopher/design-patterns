package decorator;

import java.util.ArrayList;

public class Car extends Vehicle {
    public Car ()
    {
        super(FileReader.getLines("design-patterns/decorator/txt/rims.txt"));
    }
}
