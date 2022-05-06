package refactor_32;

public class Vehicle {

    private int _type;
    final static int BICYCLE = 0;
    final static int MOTOCYCLE = 1;
    final static int CAR = 2;

    public Vehicle(int type) {
        _type = type;
    }

    public String getVehicle() {
        switch (_type) {
            case 0:
                return "New Bycicle";
            case 1:
                return "New Motorcycle";
            case 2:
                return "New Car";
        }
        return null;
    }

}
