package car_race.vehicles;

import car_race.Race;
import car_race.util.Helper;

public class Car extends Vehicle {

    public final int LIMITED_SPEED = 75;

    public Car() {
        super(carStandardSpeed());
    }

    private static int carStandardSpeed() {
        return Helper.randomIntInRange(80, 110);
    }

    @Override
    protected String createProperName() {

        final String[] CAR_MAKER = {
                "Oracle", "Mahogany", "Obey", "Progress", "Wildcat", "Galaxy", "Reigna", "Marvel", "Error", "FSO,",
                "Fastrack", "Dragon", "Patron", "Sentinel", "Ranger", "Olympian", "Formula", "Vagabond", "Null",
                "Eagle", "Hero", "Legend", "Albany", "Übermacht", "Nagasaki", "Declasse", "Benefactor", "Fiord",
                "Bürgerfahrzeug", "Bravado", "Kraken", "Mammoth", "Ocelot", "Pfister", "Willard", "Parser", "GMCM"
        };
        final String[] CAR_MODEL = {
                "Count", "Picador", "Habanero", "Turbo Mark 2", "Sentinel", "Union", "Insurgent", "Tailgater", "LPG",
                "Stallion", "Gauntlet", "Dominator", "Prodigy", "Ranger", "Brawler", "VooDoo", "Vagabond", "Scorcher",
                "Siren", "Siren Sport", "Turfer", "Gangsta", "Getaway", "Polonaise", "GT 2Xl", "Sedan Max", "NOS",
                "Hero", "Legend", "Banshee", "Coquette", "Mamba", "Bison", "Burrito", "Osiris", "Rapid", "Parsec",
                "Annihilator", "Hexer", "Ripley", "Tornado", "Faketaxi", "Zion", "Gomoku", "Mark IV", "Excepton", "Pb"
        };

        String carMaker = Helper.drawFromArray(CAR_MAKER);
        String carModel = Helper.drawFromArray(CAR_MODEL);

        return (" »» " + carMaker + " " + carModel + " «« ");


    }


    @Override
    public void prepareForLap(Race race) {
        if(race.isYellowFlagActive()) actualSpeed = LIMITED_SPEED;
        else actualSpeed = normalSpeed;
    }
}
