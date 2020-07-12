import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        boolean divBy4 = year % 4 == 0;
        boolean divBy400 = year % 400 == 0;
        boolean divBy100 = year % 100 == 0;
        System.out.println(divBy100+" " + divBy4 +" " + divBy400);

        boolean leap = (divBy4 || divBy400) ;
        boolean leap2 = divBy400 && !divBy100;
        boolean leap3  = year % 100 == 0 && year % 400 == 0;

        if (leap) {
            System.out.println("Leap");
        } else {
            System.out.println("Regular");
        }
    }
}