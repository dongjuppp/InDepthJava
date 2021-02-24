package study;

import java.util.Collections;
import java.util.LinkedList;

public class MyList {
    LinkedList<Student> list=new LinkedList<Student>();

    public void add(Student student){
        list.add(student);
    }

    public void sort(){
        Collections.sort(list);
    }

    public String toString(){
        StringBuilder builder=new StringBuilder();
        for(Student student:list){
            builder.append(student);
        }
        return builder.toString();
    }

    public LinkedList<Student> getList(){
        return list;
    }
}
