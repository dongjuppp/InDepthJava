package main;

import thread.*;

import javax.swing.*;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SynchronizedSample sample1=new SynchronizedSample("t1");
        SynchronizedSample sample2=new SynchronizedSample("t2");
        Coin coin=new Coin();
        coin.setMoney(1000);

        sample1.setCoin(coin);
        sample2.setCoin(coin);
        sample1.setValue(1);
        sample2.setValue(-1);

        sample1.start();
        sample2.start();

    }
}
