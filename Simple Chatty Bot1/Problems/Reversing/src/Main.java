import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
//        int n = scanner.nextInt();
//        int reversed = 0;
//        for( ; n != 0; n /= 10) {
//            int digit = n % 10;
//            reversed = reversed * 10 + digit;
//        }
//        System.out.println(reversed);
        int n = 0;
        System.out.print(++n);
        System.out.print(n++);
        System.out.print(n++);
        char c = '1' + '3';
        System.out.println(c);
        String word = "All robots speak Java";
        System.out.println(word.length());
        System.out.println(1 + 1 + "2" + 2);
        System.out.println(2 + 2 + "2");
        System.out.println("2" + 2 + 2);
        System.out.println("2" + 2 + 1 + 1);
    }
}