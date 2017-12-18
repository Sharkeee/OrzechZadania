import javax.swing.JOptionPane;
public class Punkt {

    private int cordX;
    private int cordY;

    public Punkt(int cordX, int cordY) {
        this.cordX = cordX;
        this.cordY = cordY;
    }

    public void ustawWspolrzedne(int X, int Y) {
        int inputX = Integer.parseInt(JOptionPane.showInputDialog("Podaj wspolrzedna X"));
        this.cordX = inputX;
        int inputY = Integer.parseInt(JOptionPane.showInputDialog("Podaj wspolrzedna X"));
        this.cordY = inputY;
        System.out.println("Wspolrzednie pomyslnie ustawiono");
    }

    public void getPunkt() {
        System.out.println("Wspolrzedne punktow to: X:" + this.cordX + " Y: " + this.cordY);
    }

}
