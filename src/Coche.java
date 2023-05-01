public class Coche {
    public int numPuertas = 4;

    public void addPuerta() {
        numPuertas++;
    }

    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.numPuertas = 4;
        miCoche.addPuerta();
        System.out.println("Numero de puertas: " + miCoche.numPuertas);
    }
}
