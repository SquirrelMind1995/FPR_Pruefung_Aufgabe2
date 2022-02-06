import java.util.ArrayList;

public class MultithreadingAufgabe {

    public static synchronized void main(String[] args) {

        try {
            class Counter {
                private double c = 0.0;
                void up() {
                    for (int i = 0; i < 100; i++)
                        System.out.println(c++);
                }
                void down() {
                    for (int i = 0; i < 100; i++)
                        System.out.println(c--);
                }
                double getC() {
                    return c;
                }
            }

            ArrayList<Thread> threadList = new ArrayList<>();
            Counter count = new Counter();
            for (int i = 0; i < 10; i++) {
                Thread t = new Thread(() -> {
                    count.up();
                    count.down();
                });
                t.start();
                threadList.add(t);
            }
            for (Thread thread : threadList) {
                thread.join();
            }
            System.out.println("Schlusswert: " + count.getC());

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}