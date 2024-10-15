package task1;

public class Arrayy {
    public static void main(String[] args) {

        //int[] num1 = {3, 5, 7, 8, 9, 12, 14, 16, 17, 18};
        //System.out.println(num1[2]);

        int[] numere = new int[7];
        numere[0] = 10;
        numere[1] = 21;
        numere[2] = 32;
        numere[3] = 43;
        numere[4] = 54;
        numere[5] = 65;
        numere[6] = 76;

        System.out.println("Results :");
        for (int i = 0; i < numere.length; i++) {
            System.out.println(numere[i]);
        }
    }
}
