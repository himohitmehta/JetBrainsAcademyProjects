//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        System.out.println(2 + 4 * 5 - 10 / (2 + 1));
        System.out.println((3 + 4) * (5 / 2));
        System.out.println(2 + (-3) + 5 + (-8));
        int number = 12241;
        int digit = ((number % 100) / 10) % 10;
        System.out.println(digit);
//        Scanner scanner = new Scanner(System.in);
//        String firstName = scanner.next();
//        String age = scanner.next();
//        String education = scanner.next();
//        String experience = scanner.next();
//        String cuisine = scanner.next();
//        System.out.println( "The form for " + firstName + " is completed. We will contact you if we need a chef that cooks " + cuisine +" dishes.");
    }
}