package thread;

//Thread를 상속하여 쓰레드를 구현하는 방법
public class ThreadEx1 extends Thread{

    //Thread의 run 메소드를 구현한다.
    @Override
    public void run(){
        for(int i=0;i<1000000;i++){
            System.out.println(getName()); //현재 스레드의 이름을 출력
        }
    }
}
