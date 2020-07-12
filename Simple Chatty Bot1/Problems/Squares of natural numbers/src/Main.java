import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int square = 0;
        int x = 0;
        while (square < n) {
            x++;
            square = x * x;
            if (square <= n) {
                System.out.println(square);
            }
        }
    }
}
