package main;

public class Main {
    public static void main(String[] args) {
        String str="a";

        for(int i=0;i<10;i++){
            str+="a";  // 컴파일시 new StringBuilder(str).append("a")로 바뀐다.
        }

        System.out.println(str);

        //////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////

        StringBuilder builder=new StringBuilder("a");

        for(int i=0;i<10;i++){
            builder.append("a");
        }

        System.out.println(builder.toString());
    }
}
