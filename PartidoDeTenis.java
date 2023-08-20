import java.util.Scanner;

public class PartidoDeTenis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Juegos ganados por A: ");
        int a = input.nextInt();
        System.out.print("Juegos ganados por B: ");
        int b = input.nextInt();
        if (a >= 6 && a - b >= 2) {
            System.out.println("Ganó A");
        } else if (b >= 6 && b - a >= 2) {
            System.out.println("Ganó B");
        } else if (a == 5 && b == 5) {
            System.out.println("Aún no termina");
        } else if (a == 6 && b == 6) {
            System.out.println("Aún no termina");
        } else if (a == 7 && b == 6) {
            System.out.println("Ganó A");
        } else if (a == 6 && b == 7) {
            System.out.println("Ganó B");
        } else {
            System.out.println("Inválido");
        }
    }
}