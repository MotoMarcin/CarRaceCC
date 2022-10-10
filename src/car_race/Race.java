package car_race;

import car_race.vehicles.Truck;
import car_race.vehicles.Vehicle;

import java.util.LinkedList;
import java.util.List;


public class Race {


    private final List<Vehicle> vehicles = new LinkedList<>();

    private boolean brokenTruck;

    public boolean isYellowFlagActive() {
        return brokenTruck;
    }

    public void registerRacer(Vehicle racer) {

//        Vehicle racer = this.Vehicle();

        vehicles.add(racer);

    }

    static final int LAPS = 50;
    public void simulateRace() {
        final int LAPS = 50;
        for (int i = 0; i < 50; i++) {
            for (Vehicle vehicle : vehicles) {
                vehicle.prepareForLap(this);
                vehicle.moveForAnHour();
            }
            weather.checkForRain();
            brokenTruck = getBrokenTruckStatus();
        }
    }
    private boolean getBrokenTruckStatus() {
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Truck) {
                Truck truck = (Truck) vehicle;
                if (truck.isBrokenDown()) {
                    return true;
                }
            }
        }
        return false;
    }

    public void printRaceResults() {
        System.out.println("\033[1;34m" + "\n R A C E   R E S U L T S :" +  "\033[0;33m");


        for (int i = 0; i < vehicles.size(); i++) System.out.println(vehicles.get(i));

    }




    private Weather weather = new Weather();

    public boolean rainy() {
        return weather.rainy();
    }

}
