import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Thread> dragos = new ArrayList<>();
        for (int i = 0; (i < 3); i++) {
            Thread t = new Thread(new SPF(String.valueOf(i)));
            dragos.add(t);
        }
        Thread sangiorgio = new Thread(new Cavaliere("giorgio", dragos.get(1)));
        for (Thread t : dragos) {
            t.start();
        }
        System.out.println("i draghi sono partiti per distruggere i villaggi");
        sangiorgio.start();

        System.out.println("Giorgio si prepara anch'egli alla battaglia!");
        try {
            for (Thread t : dragos) {
                t.join();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("il cavaliere ha atterrato il drago");

    }
}