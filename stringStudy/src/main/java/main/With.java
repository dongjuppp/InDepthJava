package main;

public class With {
    public static void run(){
        String str="hello";
        StringBuilder builder=new StringBuilder("hello");

        System.out.println(str.equals(builder)); //false
    }
}
