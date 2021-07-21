package SyncronizedMethod;

class Share {
    public synchronized void syncDown(String threadName) throws InterruptedException {
        System.out.println("This is  synchronized method:");
        for (int i = 0; i < 5; i++) {
            System.out.println("synchronized started: " + threadName);
            Thread.sleep(500);
        }
    }

    public void nonSyncDown(String threadName) throws InterruptedException {
        System.out.println("This is non synchronized method:");
        for (int i = 0; i < 5; i++) {
            System.out.println("non-Synchronized started: " + threadName);
            Thread.sleep(500);
        }
    }
}

class MyThread extends Thread {
    Share share;

    MyThread(Share share, String threadName) throws Exception {
        super(threadName);
        this.share = share;
        this.start();
//        this.join();
    }

    public void run() {
        try {
            share.syncDown(MyThread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       /* try {
            share.nonSyncDown(MyThread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();

        }*/
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        Share share = new Share();
        
        MyThread thread1 = new MyThread(share, "Thread1");
        thread1.join();
        System.out.println(thread1.getName()+ " Ended");
        MyThread thread2 = new MyThread(share, "Thread2");
        thread2.join();
        System.out.println(thread2.getName()+ " Ended");
        MyThread thread3 = new MyThread(share, "Thread3");
        thread3.join();
        System.out.println(thread3.getName()+ " Ended");
    }
}
