public class thread extends Thread {
    public static void main(String args[]){
        Thread t = new Thread(()->{
    });
    System.out.println("Thread State "+ t.getState());
    try{
        t.join();
    }
    catch(InterruptedException e){
        e.printStackTrace();
    }
    System.out.println("Thread State: "+ t.getState());
    }
}
