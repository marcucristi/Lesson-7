package task2;

public class Calculator {
    public static void main(String[] args) {

        int[] arrayUnidimensional = {10, 15, 20, 25, 30};

        int[][] arrayBidimensional = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        calculeazaUnidimensional(arrayUnidimensional);

        calculeazaBidimensional(arrayBidimensional);
    }

    public static void calculeazaUnidimensional(int[] array) {
        int suma = 0;
        int numarElemente = array.length;
        int numarPare = 0;
        int numarImpare = 0;

        for (int num : array) {
            suma += num;
            if (num % 2 == 0) {
                numarPare++;
            } else {
                numarImpare++;
            }
        }

        double media = (double) suma / numarElemente;
        System.out.println("Array Unidimensional:");
        System.out.println("Suma: " + suma);
        System.out.println("Media: " + media);
        System.out.println("Număr elemente pare: " + numarPare);
        System.out.println("Număr elemente impare: " + numarImpare);
        System.out.println();
    }

    public static void calculeazaBidimensional(int[][] array) {
        int suma = 0;
        int numarElemente = 0;
        int numarPare = 0;
        int numarImpare = 0;

        for (int[] subArray : array) {
            for (int num : subArray) {
                suma += num;
                numarElemente++;
                if (num % 2 == 0) {
                    numarPare++;
                } else {
                    numarImpare++;
                }
            }
        }

        double media = (double) suma / numarElemente;

        System.out.println("Array Bidimensional:");
        System.out.println("Suma: " + suma);
        System.out.println("Media: " + media);
        System.out.println("Număr elemente pare: " + numarPare);
        System.out.println("Număr elemente impare: " + numarImpare);
    }
}
