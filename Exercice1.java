import java.util.Scanner;

public class Exercice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez la valeur de n : ");
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            double somme = 0.0;
            for (int i = 1; i <= n; i++) {
                somme += 1.0 / i;
            }
            System.out.println("La somme des " + n + " premiers termes est : " + somme);
        } else {
            System.out.println("Veuillez entrer un nombre entier valide.");
        }
        scanner.close();
    }
}
