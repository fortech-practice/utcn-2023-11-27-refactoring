package ro.fortech.practice;

public class Main {
    public static void main(String[] args) {
        String personName = "Yosemite Sam";
        Clock clock = new FixedClock();
        GreetingMessageGenerator generator = new GreetingMessageGenerator(clock);
        String greetingMessage = generator.generateGreetingMessage(personName);
        System.out.println(greetingMessage);
    }
}