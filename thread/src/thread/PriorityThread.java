package thread;

public class PriorityThread implements Comparable<PriorityThread>{
    private Thread thread;
    private int priority=5;

    @Override
    public int compareTo(PriorityThread o) {
        if(this.priority>=o.priority) return 1;
        return 0;
    }

    public void setThread(Runnable runnable){
        thread=new Thread(runnable);
    }

    public void setPriority(int priority){
        this.priority=priority;
    }

    public void start(){
        thread.start();
    }
}
