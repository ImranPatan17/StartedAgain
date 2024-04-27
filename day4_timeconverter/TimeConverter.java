package day4_timeconverter;
import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int t = sc.nextInt();

        while (t-- > 0) {
            
            String s = sc.next();

            int hours = Integer.parseInt(s.substring(0, 2));
            int minutes = Integer.parseInt(s.substring(3));

            String period = (hours >= 12) ? "PM" : "AM";

            hours %= 12;
            if (hours == 0) {
                hours = 12;
            }

            String formattedTime = String.format("%02d:%02d %s", hours, minutes, period);
            System.out.println(formattedTime);
        }

        sc.close();
    }
}
