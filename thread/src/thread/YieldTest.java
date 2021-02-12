package thread;

public class YieldTest extends Thread {
    private boolean key;

    public void setKey(boolean key){
        this.key=key;
    }
    @Override
    public void run(){
        while(true){
            if(key){
                System.out.println("유의미한 작업중!");
            }
            else{
                yield();
            }
            System.out.println("무의미한 작업중!");
        }

    }
}
