package refactor_32;

import java.util.Random;

public class SelectTransport {

    public String selectRandom() {
        Random rand = new Random();

        int num = rand.nextInt(3);
        
        Vehicle vehicle = new Vehicle(num);
        
        return vehicle.getVehicle();
    }
    
    
    
}
