package car_race.vehicles;

//import car_race.Race;

import car_race.Race;

import java.util.HashSet;
import java.util.Set;

import static car_race.util.Helper.randomIntInRange;

public class Truck extends Vehicle {

    private int brokenTrucks = 0;

    private int breakdownTurnsLeft = 0;


    private static final int STANDARD_SPEED = 100;
    public Truck() {super(STANDARD_SPEED);
    }


    // LEARN!
    // LEARN!
    // LEARN!
    // LEARN!
    public static Set<String> alreadyNamed = new HashSet<>();

    @Override
    protected String createProperName() {
        String possibleName;
        do {
            possibleName = "" + randomIntInRange(0, 1000);
        } while (alreadyNamed.contains(possibleName));
        alreadyNamed.add(possibleName);
        return " ░ " + possibleName + " ░ ";
    }

    private State state = State.OPERATIONAL;

    private enum State {
        OPERATIONAL,
        BROKEN_DOWN
    }

    public boolean isBrokenDown() {
        return state != State.OPERATIONAL;
    }

    private static final int BREAKDOWN_CHANCE = 5;
    private static final int TURNS_NEEDED_TO_FIX_TRUCK = 2;
    private State nextState() {
        switch (state) {
            case OPERATIONAL:
                if (randomIntInRange(0, 100)  < BREAKDOWN_CHANCE) {
                    breakdownTurnsLeft = TURNS_NEEDED_TO_FIX_TRUCK;
                    return State.BROKEN_DOWN;
                }
                break;
            case BROKEN_DOWN:
                if (breakdownTurnsLeft-- > 0) {
                    return State.BROKEN_DOWN;
                }
                break;
        }
        return State.OPERATIONAL;
    }




    @Override
    public void prepareForLap(Race race) {
        if (isBrokenDown()) actualSpeed = 0;
        else actualSpeed = STANDARD_SPEED;

        state = nextState();
    }


    }

