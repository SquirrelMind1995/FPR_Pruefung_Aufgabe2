public class MultithreadingAufgabe {
    public static void main(String[] args) {
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
        Counter count = new Counter();
        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(() -> {
                count.up();
                count.down();
            });
            t.start();
        }
        System.out.println("Schlusswert: " + count.getC());
    }
}
