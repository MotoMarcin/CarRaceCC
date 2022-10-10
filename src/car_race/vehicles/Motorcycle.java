package car_race.vehicles;

import car_race.Race;

import static car_race.util.Helper.randomIntInRange;

public class Motorcycle extends Vehicle {

    private static final int STANDARD_SPEED = 100;

    public Motorcycle() {
        super(STANDARD_SPEED);
    }

    private static int MotorcycleCounter = 0;

    @Override
    protected String createProperName() {
        MotorcycleCounter++;

        return " ─ Motorcycle " + MotorcycleCounter + " ─ ";

    }


    @Override
    public void prepareForLap(Race race) {
        actualSpeed = normalSpeed;
        int speedReduction = 0;
        if (race.rainy()) {
            speedReduction = randomIntInRange(5, 50);
            actualSpeed -= speedReduction;
        }

    }
}
