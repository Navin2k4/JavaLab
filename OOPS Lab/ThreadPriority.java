public class ThreadPriority implements Runnable {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadPriority());
        t1.setName("High Proiority thread");
        t1.setPriority(Thread.MAX_PRIORITY);
        Thread t2 = new Thread(new ThreadPriority());
        t2.setName("Low Priority Thread");
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
    }
    public void run(){
        try{
            for (int i = 1; i <= 5; i++) {
            System.out.println("Thread "+Thread.currentThread().getName()+" with priority "
                                +Thread.currentThread().getPriority()+" is Running in iteration "
                                +i);
            Thread.sleep(2000);
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}