package main;

import thread.*;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        WordThread thread=new WordThread();
        thread.startBackground();
        thread.start();
    }
}
