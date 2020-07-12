import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int a;
        int sum = 0;
        do {
            a = scanner.nextInt();
            sum += a;
            if (sum >= 1000) {
                sum -= 1000;
                break;
            }
        } while (a != 0);
        System.out.println(sum);

    }
}