package thread;

public class MyThreadGroup {
    public void test(){
        ThreadGroup group=new ThreadGroup("group1");

        ThreadGroup sonGroup=new ThreadGroup(group,"sonGroup");


        new Thread(group,()->{
            System.out.println(Thread.currentThread().getThreadGroup().getName());
            System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
        }).start();

        new Thread(()->{
            System.out.println(Thread.currentThread().getThreadGroup().getName());
            System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
        }).start();

        new Thread(sonGroup,()->{
            System.out.println(Thread.currentThread().getThreadGroup().getName());
            System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
        }).start();
    }
}
