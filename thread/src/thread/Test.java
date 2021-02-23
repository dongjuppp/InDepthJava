package thread;

public class Test {
    private final Integer num=0;

    public void foo(){
        synchronized(num){
            for(int i=0;i<10000;i++){
                System.out.println(Thread.currentThread().getName());
            }
        }
    }

    public  void voo(){
        synchronized(this){
            for(int i=0;i<10000;i++){
                System.out.println(Thread.currentThread().getName()+" "+num);
            }
        }
    }

    public void zoo(){
        synchronized(num){
            for(int i=0;i<10000;i++){
                System.out.println(Thread.currentThread().getName());
            }
        }
    }
}
