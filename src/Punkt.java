import javax.swing.JOptionPane;

public class Punkt {

    private int cordX;
    private int cordY;

    public Punkt() {
    }

    public Punkt(int cordX, int cordY) {
        this.cordX = cordX;
        this.cordY = cordY;
    }

    public void ustawWspolrzedne() {
        int inputX = Integer.parseInt(JOptionPane.showInputDialog("Podaj wspolrzedna X"));
        this.cordX = inputX;
        int inputY = Integer.parseInt(JOptionPane.showInputDialog("Podaj wspolrzedna Y"));
        this.cordY = inputY;
        System.out.println("Wspolrzednie pomyslnie ustawiono");
    }

    public void pobierzPunkt() {
        if (this.cordX == 0 || this.cordX == 0) {
            JOptionPane.showMessageDialog(null, "Jedna ze wspolrzednych jest pusta");
        }
        System.out.println("Wspolrzedna X: " + this.cordX);
        System.out.println("Wspolrzedna Y: " + this.cordY);
    }

}
