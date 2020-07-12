import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        int one = 1;
        int two = 2;
        int three = 3;
        int four = 4;
        int five = 5;
        int six = 6;
        int seven = 7;
        int eight = 8;
        int nine = 9;

        switch (input) {
            case "one" :
                System.out.println(one);
                break;
            case "two" :
                System.out.println(two);
                break;
            case "three":
                System.out.println(three);
                break;
            case "four":
                System.out.println(four);
                break;
            case "five":
                System.out.println(five);
                break;
            case "six":
                System.out.println(six);
                break;
            case "seven":
                System.out.println(seven);
                break;
            case "eight":
                System.out.println(eight);
                break;
            case "nine":
                System.out.println(nine);
                break;
        }
    }
}