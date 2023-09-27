public class Tubo {
    private double altezza;
    private double raggio;

    public Tubo(double altezza, double raggio){
        this.altezza = altezza;
        this.raggio = raggio;
    }

    public double calcVolume(){
        double volume;
        volume = (3.14 * Math.pow(raggio, 2)) * altezza;
        return volume;
    }

    public double calcSuperficie(){
        double superficie;
        superficie = 2 * 3.14 * raggio * (raggio + altezza);
        return superficie;
    }


}
