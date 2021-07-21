class Count {
    int count;
//executes without the interruption of other threads.
    public synchronized void increment() {
        count++;
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Count c = new Count();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    c.increment();
                }
                System.out.println("Count in thread 1 : " + c.count);
            }
        });

        Thread thread2 = new Thread(new Runnable(){
            @Override
            public void run(){
                for (int i = 0; i < 100; i++) {
                    c.increment();
                }
                System.out.println("Count in thread 2 : " + c.count);
            }
        });
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
        System.out.println("Count: " + c.count);
    }
}
