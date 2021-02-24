package main;

import study.MyList;
import study.MyQueue;
import study.Student;

import java.util.ArrayList;
import java.util.Collections;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        MyQueue queue=new MyQueue();

        queue.add(new Student("asdqwe",1,1,1));
        queue.add(new Student("asdasdqwe",1,1,3));
        queue.add(new Student("as22dasdqwe",1,1,3));

        System.out.println(queue.get());
        System.out.println(queue.get());
        System.out.println(queue.get());
        System.out.println(queue.get());

    }
}
