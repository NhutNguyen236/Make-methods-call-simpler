/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package refactor_32;

public class VehicleFactory {

    private int _type;

    private VehicleFactory(int type) {
        _type = type;
    }

    static VehicleFactory create(int type) {
        switch (type) {
            case 0:
                return new VehicleFactory(0);
            case 1:
                return new VehicleFactory(1);
            case 2:
                return new VehicleFactory(2);
            default:
                throw new IllegalArgumentException("Incorrect type");
        }
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
