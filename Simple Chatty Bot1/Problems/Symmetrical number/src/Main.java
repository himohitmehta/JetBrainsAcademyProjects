import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num = n;
        int reversed = 0;
        for( ; n != 0; n /= 10) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
        }
        boolean check = num == reversed;
        if (check) {
            System.out.println("1");
        } else {
            System.out.println("37");
        }

    }
}