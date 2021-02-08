package thread;


// Runnable을 이용하여 쓰레드를 만드는 방법
public class RunnableEx implements Runnable {
    @Override
    public void run() {
        for(int i=0;i<1000000;i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
