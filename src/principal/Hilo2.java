package principal;

public class Hilo2 extends Thread {
    // Declaramos dos objetos del tipo de cada fichero
    private FicheroA fileA;
    private FicheroB fileB;

    /** Constructor de la clase Hilo2
     * @param fileA: ficheroA
     * @param fileB: ficheroB */
    public Hilo2(FicheroA fileA, FicheroB fileB) {
        this.fileA = fileA;
        this.fileB = fileB;
    }

    /** Método que se ejecuta al iniciar el hilo. Invoca al método que le permitirá o intentará el acceso al ficheroB */
    @Override
    public void run() {
        fileB.metodoB(fileA); // el hilo2 intenta acceder al ficheroB
    }
}

