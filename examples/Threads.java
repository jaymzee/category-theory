public class Threads {
    public static class Sleeper implements Runnable {
        public void run() {
            for (int i = 0; i < 4; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello");

        Thread t1 = new Thread(new Sleeper());
        t1.start();
        System.out.println("Goodbye");
    }
}
