import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        boolean cutWidth = k % n == 0;
        boolean cutHeight = k % m == 0;
        int chocSize = m * n;
        boolean cutSize = chocSize > k;
        if ((cutWidth || cutHeight) && cutSize) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        int x = 15, y = 20;
        System.out.println((x < y) ? (y + x) : (y - x));
        boolean b1 = false, b2 = false , b3 = true;
        boolean result = (b1 && b2) ? b1 : (b2 || b3) ? b2 : b3;
        System.out.println(result);
        int i = 0;
        for (int j = 0; j < 100; j++) {
            i = i++;
        }
        System.out.println(i);
    }
}