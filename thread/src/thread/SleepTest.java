package thread;

public class SleepTest {
    public void test(){
        Thread thread1=new Thread(()->{
           for(int i=0;i<100;i++){
               System.out.println("thread1");
           }
            System.out.println("thread1 종료");
        });

        Thread thread2=new Thread(()->{
            for(int i=0;i<100;i++){
                System.out.println("thread2");
            }
            System.out.println("thread2 종료");
        });

        thread1.start();
        thread2.start();

        for(int i=0;i<100;i++){
            System.out.println("main");
            if(i==0){
                try{
                    thread1.sleep(2000);
                }catch(InterruptedException e){}
            }
        }
        System.out.println("main 종료");
    }
}
