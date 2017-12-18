import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        int[] tablica = new int[21];
        for(int i = 20; i>=1; i--) {
            tablica[i] = i;
            System.out.println("Wartosc elementu ["+i+"]:" + i);
        }


    }
}
