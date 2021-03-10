package main;

public class StringBuilerTest {
    public static void run(){
        StringBuilder builder=new StringBuilder("hello world!");
        StringBuilder builder2=new StringBuilder("hello world!");

        System.out.println(builder.equals(builder2)); // false
    }
}
