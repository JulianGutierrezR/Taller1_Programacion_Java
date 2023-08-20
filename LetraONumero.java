import java.util.Scanner;

public class LetraONumero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("caracter:");
        char ch = input.next().charAt(0);
        if (Character.isLetter(ch)) {
            if (Character.isUpperCase(ch)) {
                System.out.println("Es letra mayúscula");
            } else {
                System.out.println("Es letra minúscula");
            }
        } else if (Character.isDigit(ch)) {
            System.out.println("Es número");
        } else {
            System.out.println("No es letra ni número");
        }
    }
}