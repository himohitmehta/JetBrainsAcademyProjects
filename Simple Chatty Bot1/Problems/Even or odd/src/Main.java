import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int a;
        do {
            a = scanner.nextInt();
            if (a == 0) {
                break;
            }
            if (a % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        } while (a != 0);
    }
}