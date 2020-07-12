import java.util.Scanner;

public class Main {

    public static boolean isComposite(long number) {
        // write your code here
        if (number <= 3) return false;
        for (long i = 1; i < number / 2; i = i + 6) {
            return i % 2 != 0;
        }
        return false;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final long number = scanner.nextLong();
        System.out.println(isComposite(number));
    }
}