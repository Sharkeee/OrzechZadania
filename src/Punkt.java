public class Punkt {

    private int cordX;
    private int cordY;

    public Punkt(int cordX, int cordY) {
        this.cordX = cordX;
        this.cordY = cordY;
    }

    public void getPunkt() {
        System.out.println("Wspolrzedne punktow to: X:" + this.cordX + " Y: " + this.cordY);
    }

}
