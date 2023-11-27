package ro.fortech.practice;

public class Main {
    public static void main(String[] args) {
        String personName = "Yosemite Sam";
        GreetingMessageGenerator generator = new GreetingMessageGenerator();
        String greetingMessage = generator.generateGreetingMessage(personName);
        System.out.println(greetingMessage);
    }
}