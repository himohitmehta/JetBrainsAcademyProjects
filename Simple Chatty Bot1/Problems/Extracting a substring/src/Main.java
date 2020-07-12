import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        String output = word.substring(start, end + 1);
        System.out.println(output);
    }
}