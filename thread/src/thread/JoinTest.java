package thread;

public class JoinTest extends Thread {
    private Thread main;
    private boolean key;

    public void setMainThread(Thread main){
        this.main=main;
    }

    public void setKey(boolean key){
        this.key=key;
    }

    @Override
    public void run(){
        while(true){
            if(key){
                System.out.println("필요한 작업");
            }
            else{
                try{
                    main.join();
                }catch (InterruptedException e){
                }
            }
            System.out.println("무의미한 작업");
        }
    }
}
