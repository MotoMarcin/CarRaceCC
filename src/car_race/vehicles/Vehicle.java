package car_race.vehicles;


import car_race.Race;

public abstract class Vehicle {
    protected final String name;
    protected final int normalSpeed;
    protected int actualSpeed;
    protected int distanceTraveled;

    protected abstract String createProperName() ;

    public abstract void prepareForLap(Race race);


    public final void moveForAnHour() {
        distanceTraveled += actualSpeed;
    }



    protected Vehicle(int normalSpeed) {
        this.name = createProperName();
        this.normalSpeed = normalSpeed;
    }


    @Override
    public String toString() {
        StringBuilder results = new StringBuilder(" - ")
                .append("Dist: ")
                .append("\t" + distanceTraveled)
                .append(" km, \t")
                .append("Racer: ")
                .append(name)
                .append(" (" + getClass().getSimpleName() + ")");



        return results.toString();
    }

}

