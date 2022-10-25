package principal;

public class Hilo1 extends Thread {
    // Declaramos dos objetos del tipo de cada fichero
    private FicheroA fileA;
    private FicheroB fileB;

    /** Constructor de la clase Hilo1
     * @param fileA: ficheroA
     * @param fileB: ficheroB */
    public Hilo1(FicheroA fileA, FicheroB fileB) {
        this.fileA = fileA;
        this.fileB = fileB;
    }

    /** Método que se ejecuta al iniciar el hilo. Invoca al método que le permitirá o intentará el acceso al ficheroA */
    @Override
    public void run() {
        fileA.metodoA(fileB); // el hilo1 intenta acceder al ficheroA
    }
}
