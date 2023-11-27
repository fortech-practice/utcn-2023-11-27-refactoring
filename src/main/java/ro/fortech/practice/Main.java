package ro.fortech.practice;

public class Main {
    public static void main(String[] args) {
        String greetingMessage = generateGreetingMessage("Yosemite Sam");
        System.out.println(greetingMessage);
    }

    private static String generateGreetingMessage(String personName) {
        return "Hello, " + personName + "!";
    }
}