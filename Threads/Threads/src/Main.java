public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Active thread count " + Thread.activeCount());
        System.out.println("Current thread name: " + Thread.currentThread().getName());
        System.out.println("Thread status: " + Thread.currentThread().getState());
        System.out.println("Check alive: " + Thread.currentThread().isAlive());
        System.out.println("Priority: " + Thread.currentThread().getPriority());

        Thread.currentThread().setName("dfasdf");
        /*Thread.currentThread().setPriority(1);*/
        System.out.println();
        System.out.println("Current thread name: " + Thread.currentThread().getName());
        System.out.println("Priority: " + Thread.currentThread().getPriority());
        System.out.println();
        /*for (int i = 5; i > 0; i--) {
            System.out.println("Count: " + i);
            Thread.sleep(500);
        }*/

        MyThread myThread = new MyThread();
        System.out.println("myThread name: " + myThread.getName());
        System.out.println("myThread priority: "+ myThread.getPriority());
        System.out.println("is alive: "+ myThread.isAlive());
        myThread.start();
        System.out.println("is alive: "+myThread.isAlive());

        MyDaemon myDaemon = new MyDaemon();
        System.out.println("myDaemon priority: "+myDaemon.getPriority());
        System.out.println("is daemon: "+myDaemon.isDaemon());
        myDaemon.setDaemon(true);
        System.out.println("is daemon: "+myDaemon.isDaemon());
        myDaemon.start();

    }
}
