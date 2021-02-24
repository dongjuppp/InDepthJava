package study;

public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private int grade;
    private int score;

    public Student(String name,int age,int grade,int score){
        this.name=name;
        this.age=age;
        this.grade=grade;
        this.score=score;
    }


    public String toString(){
        return String.format("이름:%s 나이:%d 학년:%d 점수:%d \n",name,age,grade,score);
    }


    public int compareTo(Student o) {
        if(o.score>score) return 1;
        return -1;
    }
}
