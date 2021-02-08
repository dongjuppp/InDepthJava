package thread;

public class Ex2 {
    public void startEx1(){
        long start=System.currentTimeMillis();
        for(int i=0;i<100000;i++){
            System.out.println("hello");
        }

        for(int i=0;i<100000;i++){
            System.out.println("world");
        }

        System.out.println("작업 완료시간"+(System.currentTimeMillis()-start));
    }

    public void startEx2(){
        long start=System.currentTimeMillis();
        Thread thread1=new Thread(()->{
            for(int i=0;i<100000;i++){
                System.out.println("hello");
            }
            System.out.println("작업1 완료시간: "+(System.currentTimeMillis()-start));
        });

        Thread thread2=new Thread(()->{
            for(int i=0;i<100000;i++){
                System.out.println("world");
            }
            System.out.println("작업2 완료시간: "+(System.currentTimeMillis()-start));
        });

        thread1.start();
        thread2.start();
    }
}
