package psp9;

/**
 *
 * @author Pablo
 */
public class PSP9 {

    public static void main(String[] args) {
        Thread hilo1 = new hilo1();
        hilo1.start();
         Thread hilo2 = new hilo2();
        hilo2.start();
         Thread hilo3 = new hilo3();
        hilo3.start();
         Thread hilo4 = new hilo4();
        hilo4.start();
           }
    
}
