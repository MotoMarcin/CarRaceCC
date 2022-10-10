package car_race;

//import static car_race.util.Helper.randomIntInRange;

import static car_race.util.Helper.randomIntInRange;

public class Weather {

    private boolean rainy = false;
    private static final int RAIN_PROPABILITY = 30;


    public Weather() {
        checkForRain();
    }

        void checkForRain () {
            rainy = (randomIntInRange(0, 100) <= (RAIN_PROPABILITY));
        }

        public boolean rainy () {
            return rainy;
        }

    }

