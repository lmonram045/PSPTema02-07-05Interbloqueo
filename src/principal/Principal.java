package principal;

/** Programa ejemplo de interbloqueo o deadlock.
 * Supongamos dos hilos y que cada hilo necesita privilegios exclusivos de escritura en dos archivos distintos. El hilo1
 * podría abrir el archivoA de forma exclusiva y el hilo 2 hacer lo mismo con el archivoB.
 * Estando el hilo1 en el archivoA necesita acceso exclusivo al archivoB y estando el hilo 2 en el archivoB necesita
 * acceso exclusivo al archivoA. Ambos hilos están esperando a que el otro libere el archivo que necesitan. Esto es
 * un interbloqueo o deadlock. */

public class Principal {
    public static void main(String[] args) {
        // Declaramos dos objetos del tipo de cada fichero
        FicheroA fileA = new FicheroA();
        FicheroB fileB = new FicheroB();

        // Declaramos dos hilos
        Hilo1 hilo1 = new Hilo1(fileA, fileB);
        Hilo2 hilo2 = new Hilo2(fileA, fileB);

        // Iniciamos los hilos
        hilo1.start();
        hilo2.start();
    }
}

