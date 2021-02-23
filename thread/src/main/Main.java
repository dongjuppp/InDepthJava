package main;

import thread.*;

import javax.swing.*;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Test test=new Test();
        new Thread(()->{
            test.foo();
        }).start();

        new Thread(()->{
            test.voo();
        }).start();

        new Thread(()->{
            test.zoo();
        }).start();
    }
}
