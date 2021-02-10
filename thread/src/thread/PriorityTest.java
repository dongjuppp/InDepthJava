package thread;

import java.util.PriorityQueue;

public class PriorityTest {

    public void test(){
        PriorityQueue<PriorityThread> queue=new PriorityQueue<>(); //우선순위 큐를 만든다.
        PriorityThread thread=new PriorityThread();
        PriorityThread thread2=new PriorityThread();

        thread.setThread(()->{
            for(int i=0;i<1000;i++){
                System.out.println("O");
            }
        });

        thread2.setThread(()->{
            for(int i=0;i<1000;i++){
                System.out.println("X");
            }
        });

        //각각의 우선순위를 정함
        thread.setPriority(1);
        thread2.setPriority(10);

        //우선순위 큐에 넣는다.
        queue.add(thread);
        queue.add(thread2);


        while(!queue.isEmpty()){
            queue.poll().start();
        }
    }
}
