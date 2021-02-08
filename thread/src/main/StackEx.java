package main;

public class StackEx {

    public void method1(){
        method2();
        System.out.println("메소드 2 실행!");
    }

    private void method2(){
        System.out.println("메소드 1 실행!");
    }
}
