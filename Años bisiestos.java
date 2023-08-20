import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("anno:");
        int year = input.nextInt();
        boolean isLeapYear;
        if (year < 1582) {
            isLeapYear = year % 4 == 0;
        } else {
            isLeapYear = year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
        }
        if (isLeapYear) {
            System.out.println(year + " es bisiesto");
        } else {
            System.out.println(year + " no es bisiesto");
        }
    }
}