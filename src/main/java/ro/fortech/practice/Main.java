package ro.fortech.practice;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        String greetingMessage = generateGreetingMessage("Yosemite Sam");
        System.out.println(greetingMessage);
    }

    private static String generateGreetingMessage(String personName) {
        int hourOfDay = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        String momentOfDay = "night";
        if (isBetween(hourOfDay, 6, 12)) {
            momentOfDay = "morning";
        }
        if (isBetween(hourOfDay, 12, 18)) {
            momentOfDay = "afternoon";
        }
        if (isBetween(hourOfDay, 18, 22)) {
            momentOfDay = "evening";
        }
        return "Good " + momentOfDay +  ", " + personName + "!";
    }

    private static boolean isBetween(int givenValue, int lowerLimit, int upperLimit) {
        return (lowerLimit <= givenValue) && (givenValue < upperLimit);
    }
}