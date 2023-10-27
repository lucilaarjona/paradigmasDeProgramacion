public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Camion DeCocaCola = new Camion("Scania", 15,"Juan Perez");
        Camion otroCamion = new Camion("Ford",13,"Maria Gomez");
       // Camion tercerCamion = new Camion(otroCamion);
       // Camion cuartoCamion = DeCocaCola;
        DeCocaCola.arrancar();
        otroCamion.arrancar();
    }
}