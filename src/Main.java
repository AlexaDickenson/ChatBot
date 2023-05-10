import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        greetUser();
        String name = askName();
        int age = guessAge();
        countNumber();
        testProgrammingKnowledge();
    }

    public static void greetUser() {
        System.out.println("Hello! Welcome.");
    }

    public static String askName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = scanner.nextLine();
        System.out.println("Nice to meet you, " + name + "!");
        return name;
    }

    public static int guessAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's play a game. I'm going to guess your age.");
        System.out.println("Please tell me the year you were born:");
        int birthYear = scanner.nextInt();
        int age = 2023 - birthYear;
        System.out.println("You are " + age + " years old!");
        return age;
    }

    public static void countNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What number would you like me to count to?");
        int countTo = scanner.nextInt();
        System.out.println("Okay, I'm going to count to " + countTo + " now.");
        for (int i = 1; i <= countTo; i++) {
            System.out.println(i);
        }
    }

    public static void testProgrammingKnowledge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's test your programming knowledge.");
        System.out.println("Which of the following is not a programming language?");
        System.out.println("a) Java");
        System.out.println("b) Python");
        System.out.println("c) JavaScript");
        System.out.println("d) CarrotScript");
        String answer = scanner.nextLine();
        while (!answer.equals("d")) {
            System.out.println("Incorrect, please try again.");
            answer = scanner.nextLine();
        }
        System.out.println("Correct! CarrotScript is not a real programming language.");
    }
}