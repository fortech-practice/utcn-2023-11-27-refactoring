package ro.fortech.practice;

public class GreetingMessageGenerator {
    private Clock clock = new InternalClock();

    public String generateGreetingMessage(String personName) {
        int hourOfDay = clock.getHourOfDay();
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

    private boolean isBetween(int givenValue, int lowerLimit, int upperLimit) {
        return (lowerLimit <= givenValue) && (givenValue < upperLimit);
    }
}