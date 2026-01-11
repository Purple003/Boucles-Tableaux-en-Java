import java.util.Scanner;

public class Exercice5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez la taille de la matrice carrée (N) : ");
        if (!scanner.hasNextInt())
            return;
        int N = scanner.nextInt();
        int[][] A = new int[N][N];
        System.out.println("Entrez les " + (N * N) + " éléments de la matrice :");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Matrice originale :");
        printMatrix(A);

        rotate90ClockwiseInPlace(A);
        System.out.println("Après rotation 90° horaire :");
        printMatrix(A);

        // Reset and test other rotations for demo
        // (Not strictly required to run all at once, but good for completeness)
    }

    public static void rotate90ClockwiseInPlace(int[][] A) {
        int N = A.length;
        // Step 1: Transpose
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }
        // Step 2: Reverse each row
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N / 2; j++) {
                int temp = A[i][j];
                A[i][j] = A[i][N - 1 - j];
                A[i][N - 1 - j] = temp;
            }
        }
    }

    public static void rotate90CounterClockwiseInPlace(int[][] A) {
        int N = A.length;
        // Step 1: Transpose
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }
        // Step 2: Reverse each column
        for (int j = 0; j < N; j++) {
            for (int i = 0; i < N / 2; i++) {
                int temp = A[i][j];
                A[i][j] = A[N - 1 - i][j];
                A[N - 1 - i][j] = temp;
            }
        }
    }

    public static void rotate180InPlace(int[][] A) {
        int N = A.length;
        // Reverse rows
        for (int i = 0; i < N / 2; i++) {
            int[] temp = A[i];
            A[i] = A[N - 1 - i];
            A[N - 1 - i] = temp;
        }
        // Reverse elements in each row (cols)
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N / 2; j++) {
                int temp = A[i][j];
                A[i][j] = A[i][N - 1 - j];
                A[i][N - 1 - j] = temp;
            }
        }
    }

    private static void printMatrix(int[][] A) {
        for (int[] row : A) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
