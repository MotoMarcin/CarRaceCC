package car_race;

import car_race.*;
public class Main {

    private final static int LAPS = 50;
    private final static int RAIN_PROPABILITY = 30;
    private final static int LIMITED_SPEED = 70;
    private final static int LIMIT_PROPABILITY = 30;



    private static void createVehicles() {


    }












    public static void main(String[] args) {
        System.out.println("\n" +
                "┌─┐┌─┐┬─┐  ┬─┐┌─┐┌─┐┌─┐\n" +
                "│  ├─┤├┬┘  ├┬┘├─┤│  ├┤ \n" +
                "└─┘┴ ┴┴└─  ┴└─┴ ┴└─┘└─┘");
        System.out.println("Gentlemen start your engines");


        createVehicles();

        Race.simulateRace();

        Race.printRaceResults();

    }

/*
    Where does Gentlemen start your engines come from?
    The first time that the term, “Gentlemen, start your engines”
    appeared in print on the race morning “countdown” schedule was in 1953,
    and while the claim in Wilbur Shaw's memoirs is that he had said it every year since 1946,
    it appears that he did not do so until 1953.
*/

}