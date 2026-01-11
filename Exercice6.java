import java.util.Scanner;

public class Exercice6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez la taille du tableau (n) et la taille de la fenêtre (k) : ");
        if (!scanner.hasNextInt())
            return;
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] T = new int[n];
        System.out.println("Entrez les " + n + " éléments du tableau :");
        for (int i = 0; i < n; i++) {
            T[i] = scanner.nextInt();
        }

        int[] freq = new int[100001];
        int distinctCount = 0;

        // Initial window
        for (int i = 0; i < k; i++) {
            if (freq[T[i]] == 0) {
                distinctCount++;
            }
            freq[T[i]]++;
        }
        System.out.print(distinctCount);

        // Slide window
        for (int i = k; i < n; i++) {
            // Remove out element
            int out = T[i - k];
            freq[out]--;
            if (freq[out] == 0) {
                distinctCount--;
            }

            // Add in element
            int in = T[i];
            if (freq[in] == 0) {
                distinctCount++;
            }
            freq[in]++;

            System.out.print(" " + distinctCount);
        }
        System.out.println();
        scanner.close();
    }
}
