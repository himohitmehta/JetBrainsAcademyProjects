import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int busHeight = scanner.nextInt();
        int numBridges = scanner.nextInt();
        int bridgeHeight = 0;
        int i = 0;
        while (i < numBridges) {
            i++;
            bridgeHeight = scanner.nextInt();
            System.out.println(i);
            System.out.println(bridgeHeight > busHeight);
        }
        if (bridgeHeight > busHeight) {
            System.out.println("Will not crash");
        } else {
            System.out.println("Will crash on bridge "+ i);
        }
    }
}