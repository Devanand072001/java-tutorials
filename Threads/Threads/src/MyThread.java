public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread started.");
        for (int i = 5; i > 0; i--) {
            System.out.println("Count: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
                System.out.println("Thread interrupted");
            }
        }
        System.out.println("Thread ended.");
    }
}
