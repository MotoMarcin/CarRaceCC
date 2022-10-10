package car_race.util;

import java.util.Random;

public class Helper {

    private static final Random DRAWN = new Random();
    public static int randomIntInRange(int lowlim, int upplim) {
        int lottery = DRAWN.nextInt((upplim - lowlim) + 1) + lowlim;
        // range limits are now inclusive here ;)
    return lottery;}

    public static String drawFromArray(String[] input) {
        if (input != null || input.length > 0) {
         // LEARN!
         // LEARN!
         // LEARN!
         //   final String msg =
         //           "Possibilities should be a non-empty array of strings.";
         //   throw new IllegalArgumentException(msg);
        }

        return input[DRAWN.nextInt(input.length)];
    }
//
//    public static int nextInt(int upper) {
//        Random random = new Random();
//        return random.nextInt(upper);
//    }
private String lastLine = "";
    public void print(String line) {
        //clear the last line if longer
        if (lastLine.length() > line.length()) {
            String temp = "";
            for (int i = 0; i < lastLine.length(); i++) {
                temp += " ";
            }
            if (temp.length() > 1)
                System.out.print("\r" + temp);
        }
        System.out.print("\r" + line);
        lastLine = line;
    }
    private byte anim;
    public void animate(String line) {
        switch (anim) {
            case 1:
                print("[ \\ ] " + line);
                break;
            case 2:
                print("[ | ] " + line);
                break;
            case 3:
                print("[ / ] " + line);
                break;
            default:
                anim = 0;
                print("[ - ] " + line);
        }
        anim++;
    }

    public static void simulateSimulation() throws InterruptedException {
        Helper consoleHelper = new Helper();
        for (int i = 0; i < 51; i++) {
            consoleHelper.animate(i + "");
            //simulate a piece of task
            Thread.sleep(79);
        }
    }

}

