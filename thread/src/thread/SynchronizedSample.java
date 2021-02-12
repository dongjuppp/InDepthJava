package thread;

public class SynchronizedSample extends Thread{
    private int value;
    private Coin coin;
    private String name;

    public SynchronizedSample(String name){
        this.name=name;
    }

    public void setCoin(Coin coin){
        this.coin=coin;
    }

    public void setValue(int value){
        this.value=value;
    }

    @Override
    public void run(){
        synchronized (this){
            for(int i=0;i<300;i++){
                coin.setMoney(coin.getMoney()+value);
            }
        }
        System.out.println(name+"의 결과:"+coin.getMoney());
    }
}
