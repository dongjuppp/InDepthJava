package thread;

import java.util.concurrent.locks.ReentrantLock;

public class Sample extends Thread{
    private final ReentrantLock lock=new ReentrantLock();
    private int value;
    private Coin coin;

    public void setCoin(Coin coin){
        this.coin=coin;
    }

    public void setValue(int value){
        this.value=value;
    }

    @Override
    public void run(){
        coin.compute(value);
    }
}
