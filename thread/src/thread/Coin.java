package thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Coin {
    private final ReentrantLock lock=new ReentrantLock();
    private final Condition condition=lock.newCondition();
    private int money;

    public void setMoney(int money){
        this.money=money;
    }

    public int getMoney(){
        return money;
    }

    public void compute(int value){
        lock.lock();
        try{
            for(int i=0;i<10000;i++){
                money+=value;
            }

            condition.await();
            condition.signal();
            condition.signalAll();

            System.out.println(money);
        }catch (Exception e){}
        finally {
            lock.unlock();
        }
    }


    public void foo1(){
        lock.lock();
    }

    public void foo2(){
        lock.unlock();
    }
}
