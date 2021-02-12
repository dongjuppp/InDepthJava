package thread;

public class Scheduling extends Thread{
    public void run(){
        while(!isInterrupted()){
            System.out.println("test run!");
        }
    }
}
