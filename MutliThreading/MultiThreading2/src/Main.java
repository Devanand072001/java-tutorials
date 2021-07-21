class Hi implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + ")" + " " + " Hello");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class Hello implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + ")" + " " + " Hi");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Hi hi = new Hi();
        Hello hello = new Hello();

        Thread hiThread = new Thread(hi);
        Thread helloThread = new Thread(hello);

        hiThread.setPriority(6);
        helloThread.setPriority(7);

        hiThread.start();
        helloThread.start();
    }
}
