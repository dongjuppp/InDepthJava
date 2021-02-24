package study;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {
    Queue<Student> queue= new LinkedList<Student>();

    public void add(Student student){
        queue.add(student);
    }

    public Student get(){
        return queue.poll();
    }
}
