import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        long firstNum = scanner.nextLong();
        String operation = scanner.next();
        long secondNum = scanner.nextLong();
        long output;
        switch (operation) {
            case "+":
                output = firstNum + secondNum;
                System.out.println(output);
                break;
            case "-":
                output = firstNum - secondNum;
                System.out.println(output);
                break;
            case "/":
                try {
                    if (secondNum == 0) {
                        System.out.println("Division by 0!");
                    } else {
                        output = firstNum / secondNum;
                        System.out.println(output);

                    }
                } catch (ArithmeticException e) {
                    System.err.println(e);
                }
                break;
            case "*":
                output = firstNum * secondNum;
                System.out.println(output);
                break;
            default:
                System.out.println("Unknown operator");

        }
    }
}