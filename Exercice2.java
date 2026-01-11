import java.util.Scanner;

public class Exercice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez la hauteur du triangle : ");
        if (scanner.hasNextInt()) {
            int h = scanner.nextInt();
            for (int i = 1; i <= h; i++) {
                // Print leading spaces
                for (int j = 0; j < h - i; j++) {
                    System.out.print(" ");
                }
                // Print stars
                for (int j = 0; j < 2 * i - 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else {
            System.out.println("Veuillez entrer un nombre entier valide.");
        }
        scanner.close();
    }
}
