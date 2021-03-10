package main;

public class StringTest {
    public static void run(){
        String str="asd";
        String nullStr=null;
        String str2="dsa";

        System.out.println(str+nullStr+str2); //asdnulldsa

        String str3="asd";

        System.out.println(str==str3); //true
        System.out.println(str.equals(str3)); //true

    }
}
