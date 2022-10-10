package car_race;

import car_race.vehicles.Car;
import car_race.vehicles.Motorcycle;
import car_race.vehicles.Truck;

import static car_race.util.Helper.simulateSimulation;

public class Main {



    private static void createVehicles(Race race) {

        for (int i = 0; i < 10; i++) {
            race.registerRacer(new Car());
            race.registerRacer(new Motorcycle());
            race.registerRacer(new Truck());
        }
        System.out.println("\033[1;94m" + "\nSimulating race laps..." + "\033[1;92m");
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("\n" + "\033[1;31m" +
                "┌─┐┌─┐┬─┐  ┬─┐┌─┐┌─┐┌─┐\n" +
                "│  ├─┤├┬┘  ├┬┘├─┤│  ├─ \n" +
                "└─┘┴ ┴┴└─  ┴└─┴ ┴└─┘└─┘");
        System.out.println("\033[4;34m" + "Gentlemen start your engines" + "\033[0m");

        Race race = new Race();

        createVehicles(race);

        simulateSimulation();

        race.simulateRace();

        race.printRaceResults();

    }

/*
    Where does Gentlemen start your engines come from?
    The first time that the term, “Gentlemen, start your engines”
    appeared in print on the race morning “countdown” schedule was in 1953,
    and while the claim in Wilbur Shaw's memoirs is that he had said it every year since 1946,
    it appears that he did not do so until 1953.
*/

}