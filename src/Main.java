import javax.swing.JOptionPane;
public class Main {

    public static void main(String[] args) {

        int[] tablica = new int[9];

        for(int i=0; i<=tablica.length;i++) {
             int x = Integer.parseInt(JOptionPane.showInputDialog("Wprowadz wartosc elementu ["+(i)+"]"));
             tablica[i] = x;
            System.out.println("Wartosc elementu [" + (i) + "]:" + x);
        }

    }
}
