package study;

import java.util.Stack;

public class MyStack {

    private Stack<Student> stack=new Stack<Student>();

    public void run(){
        stack.push(new Student("짱구",1,1,1));
        stack.push(new Student("철수",1,1,1));
        stack.push(new Student("맹구",1,1,1));
        stack.push(new Student("훈이",1,1,1));
        stack.push(new Student("유리",1,1,1));

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop()); //예외 발생
    }
}
