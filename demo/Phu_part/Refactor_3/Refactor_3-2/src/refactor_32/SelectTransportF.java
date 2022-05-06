package refactor_32;

import java.util.Random;

public class SelectTransportF {

    public String selectRandom() {
        Random rand = new Random();

        int num = rand.nextInt(3);
        VehicleFactory vehicle = VehicleFactory.create(num);
        return vehicle.getVehicle();

    }
}
