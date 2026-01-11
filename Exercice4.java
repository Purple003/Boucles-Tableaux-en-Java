public class Exercice4 {

    public static void affiche(double[][] t) {
        if (t == null) {
            System.out.println("Le tableau est null.");
            return;
        }
        for (double[] ligne : t) {
            for (double val : ligne) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static boolean regulier(double[][] t) {
        if (t == null || t.length == 0)
            return true;
        int size = t[0].length;
        for (int i = 1; i < t.length; i++) {
            if (t[i].length != size)
                return false;
        }
        return true;
    }

    public static double[] sommeLignes(double[][] t) {
        if (t == null)
            return null;
        double[] sums = new double[t.length];
        for (int i = 0; i < t.length; i++) {
            double sum = 0;
            for (double val : t[i]) {
                sum += val;
            }
            sums[i] = sum;
        }
        return sums;
    }

    public static double[][] somme(double[][] t1, double[][] t2) {
        if (t1 == null || t2 == null)
            return null;
        if (!regulier(t1) || !regulier(t2))
            return null;
        if (t1.length != t2.length)
            return null;
        if (t1.length == 0)
            return new double[0][0]; // Case for empty arrays
        if (t1[0].length != t2[0].length)
            return null;

        int rows = t1.length;
        int cols = t1[0].length;
        double[][] res = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                res[i][j] = t1[i][j] + t2[i][j];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        double[][] m1 = {
                { 1.0, 2.0, 3.0 },
                { 4.0, 5.0, 6.0 }
        };
        double[][] m2 = {
                { 10.0, 20.0, 30.0 },
                { 40.0, 50.0, 60.0 }
        };
        double[][] irrégulier = {
                { 1.0, 2.0 },
                { 3.0, 4.0, 5.0 }
        };

        System.out.println("Affichage de m1 :");
        affiche(m1);

        System.out.println("m1 est régulier ? " + regulier(m1));
        System.out.println("irrégulier est régulier ? " + regulier(irrégulier));

        double[] sums = sommeLignes(m1);
        System.out.print("Sommes des lignes de m1 : ");
        for (double s : sums)
            System.out.print(s + " ");
        System.out.println();

        System.out.println("Somme de m1 et m2 :");
        double[][] res = somme(m1, m2);
        affiche(res);

        System.out.println("Somme de m1 et irrégulier (doit être null) :");
        double[][] resErr = somme(m1, irrégulier);
        if (resErr == null)
            System.out.println("Résultat null comme attendu.");
    }
}
