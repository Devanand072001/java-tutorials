public class MyDaemon extends Thread{
    @Override
    public void run(){
        if (currentThread().isDaemon()){
            System.out.println("This is daemon Thread");
        }else {
            System.out.println("This a user thread");
        }
    }
}
