package principal;

public class FicheroA {
    /** metodoA: simula el acceso al ficheroA con exclusion mutua. Duerme al hilo y después invoca al método que le
     * permitirá o intentará el acceso al ficheroB
     * @param fileB ficheroB */
    public synchronized void metodoA(FicheroB fileB) {
        // imprime el nombre del hilo que ejecuta el método
        System.out.println("Hilo " + Thread.currentThread().getName() + "entra en ficheroA");

        // duerme al hilo durante 1 segundo
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Hilo " + Thread.currentThread().getName() + "intentando acceder a ficheroB");
        fileB.metodoB(this);
    }

    public synchronized void syn2() {
        System.out.println("Dentro de A.syn2()");
    }
}
