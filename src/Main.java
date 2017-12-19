import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        int[] tablica = new int[20];
        String[] opcje = {"FOR", "WHILE"};
        int choice = JOptionPane.showOptionDialog(
                null,
                "Ktorej petli chcesz uzyc?",
                "Zadanie 5 //Mateusz Orzeszyna",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcje,
                opcje[1]);

        switch (choice) {

            case 0:
                System.out.println("Zastosowano petle: " + opcje[choice]);
                for (int i = 19; i >= 0; i--) {
                    tablica[i] = i;
                    System.out.println("Wartosc elementu [" + i + "]:" + i);
                }

            case 1:
                System.out.println("Zastosowano petle: " + opcje[choice]);
                int i = 19;
                while (i >= 0) {
                    tablica[i] = i;
                    System.out.println("Wartosc elementu [" + i + "]: " + i);
                    i--;
                }
        }
    }
}