package thread;

// 구현방식 2가지의 실행 방법
public class Ex1 {
    public void start(){
        ThreadEx1 threadEx1=new ThreadEx1();
        Thread threadEx2=new Thread(new RunnableEx());


        threadEx1.start();
        threadEx2.start();
    }
}
