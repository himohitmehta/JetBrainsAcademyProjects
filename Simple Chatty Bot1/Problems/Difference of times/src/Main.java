import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int hour1 = scanner.nextInt();
        int minute1 = scanner.nextInt();
        int seconds1 = scanner.nextInt();
        int hour2 = scanner.nextInt();
        int minute2 = scanner.nextInt();
        int seconds2 = scanner.nextInt();
        int diffSeconds = seconds2 - seconds1;
        int diffMinutes = minute2 - minute1;
        int diffHours = hour2 - hour1;
        int hoursInSeconds = diffHours * 60 * 60;
        int minutesInSeconds = diffMinutes * 60;
        int secondsInSeconds = diffSeconds;
        int total = hoursInSeconds + minutesInSeconds + secondsInSeconds;
        System.out.println(total);
    }
}