import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dividendo:");
        int dividend = input.nextInt();
        System.out.print("Divisor:");
        int divisor = input.nextInt();
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;
        if (remainder == 0) {
            System.out.println("La división es exacta. Cociente:" + quotient);
        } else {
            System.out.println("La división no es exacta. Cociente:" + quotient + " Residuo:" + remainder);
        }
    }
}