import java.util.Scanner;

public class Exercice3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Combien de valeurs : ");
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            if (n > 0) {
                long[] carres = new long[n];
                for (int i = 0; i < n; i++) {
                    long odd = 2L * i + 1;
                    carres[i] = odd * odd;
                }

                for (int i = 0; i < n; i++) {
                    System.out.println((2 * i + 1) + " a pour carre " + carres[i]);
                }
            } else {
                System.out.println("Veuillez entrer un nombre positif.");
            }
        } else {
            System.out.println("Veuillez entrer un nombre entier valide.");
        }
        scanner.close();
    }
}
