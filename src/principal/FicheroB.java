package principal;

public class FicheroB {
    /** metodoB: simula el acceso al ficheroB con exclusion mutua. Duerme al hilo y después invoca al método que le
     * permitirá o intentará el acceso al ficheroA
     * @param fileA ficheroA */
    public synchronized void metodoB(FicheroA fileA) {
        // imprime el nombre del hilo que ejecuta el método
        System.out.println("Hilo " + Thread.currentThread().getName() + "entra en ficheroB");

        // duerme al hilo durante 1 segundo
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Hilo " + Thread.currentThread().getName() + "intentando acceder a ficheroA");
        fileA.metodoA(this);
    }
}

