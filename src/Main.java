import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Tubo tubo;
        double altezza;
        double raggio;

        System.out.println("Inserisci il raggio del tubo");
        raggio = input.nextDouble();
        System.out.println("Inserisci l'altezza del tubo");
        altezza = input.nextDouble();

        tubo = new Tubo(altezza, raggio);
        System.out.println("La superficie del tubo è: " + tubo.calcSuperficie());
        System.out.println("Il volume del tubo è: " + tubo.calcVolume());

    }
}