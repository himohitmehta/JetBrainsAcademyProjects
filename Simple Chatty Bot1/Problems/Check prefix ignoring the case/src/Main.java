import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
//        Scanner scanner = new Scanner(System.in);
//        String word = scanner.next();
//        if (word.toLowerCase().startsWith("j")) {
//            System.out.println("true");
//        } else {
//            System.out.println("false");
//        }
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = b1 || b2;
        System.out.println(b1 && !b2 && b3);
    }
}
