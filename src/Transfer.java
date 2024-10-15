public class Transfer {
    public static void main(String[] args) {
        // Definirea array-ului sursă
        int[] arraySursa = {0, 2, 3, 4, 5, 6, 3};

        // Crearea unui nou array pentru a copia elementele
        int[] arrayDestinatie = new int[arraySursa.length];

        // Copierea elementelor din array-ul sursă în array-ul destinație
        for (int i = 0; i < arraySursa.length; i++) {
            arrayDestinatie[i] = arraySursa[i];
        }

        // Afișarea elementelor din array-ul destinație
        System.out.println("Elementele array-ului destinatie:");
        for (int num : arrayDestinatie) {
            System.out.print(num + " ");
        }
    }
}
