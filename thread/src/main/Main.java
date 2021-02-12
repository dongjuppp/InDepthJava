package main;

import thread.*;

import javax.swing.*;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Sample sample=new Sample();
        Sample sample2=new Sample();
        Coin coin=new Coin();
        coin.setMoney(100);

        sample.setValue(1);
        sample2.setValue(-1);

        sample.setCoin(coin);
        sample2.setCoin(coin);

        sample.start();
        sample2.start();



    }
}
