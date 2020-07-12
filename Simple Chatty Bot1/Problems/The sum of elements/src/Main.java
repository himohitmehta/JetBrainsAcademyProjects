import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int a ;
        int sum = 0;
        do {
            a = scanner.nextInt();
            sum += a;
        } while (a != 0);
        System.out.println(sum);
        int n = 10;
        for (int i = 0; i < n; i++) {
            if (i * i < 36) {
                continue;
            }
            System.out.print(i + " ");
        }
        
    }
}
