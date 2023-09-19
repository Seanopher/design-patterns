package decorator;

import java.util.ArrayList;

public abstract class VehicleDecorator extends Vehicle {
    
    public VehicleDecorator(ArrayList<String> lines)
    {
        super(lines);
    }

    protected void integrateDecor(ArrayList<String> decor)
    {
        for(int i=0; i<decor.size(); i++)
        {
            String[] carSplit = lines.get(i).split("");
            String[] decSplit = decor.get(i).split("");
            String newLine="";
            for(int j=0; j<carSplit.length; j++)
            {
                if(!decSplit[j].equals(carSplit[j]))
                {
                    carSplit[j]=decSplit[j];
                }
                newLine+=carSplit[j];
            }
            lines.set(i, newLine);
        }
    }
}
