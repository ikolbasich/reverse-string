import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        System.out.print("Please input string -> ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        reverse(1000, input);
        reverse(10_000, input);
        reverse(100_000, input);

        scanner.close();
    }

    private static void reverse(int times, String input) {
        String reverse = "";
        System.out.println("Start reversing " + times + " times...");
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < times; i++) {
            reverse = reverse(input);
        }
        System.out.println("Reverse string -> " + reverse + " Time -> " + (System.currentTimeMillis() - startTime));
    }

    private static String reverse(String input) {
        StringBuilder inputLine = new StringBuilder(input);
        return inputLine.reverse().toString();
    }
}
