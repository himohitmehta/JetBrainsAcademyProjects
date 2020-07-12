import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int a  = scanner.nextInt();
        int b = a;
        int count = 0;
        for (int i = 1; i <= a; i++) {
            for (int j = 0; j < i; j++) {
                count++;
                System.out.print(i + " ");
                if (count == b) break;
            }
            if (count == b) break;
        }
    }
}