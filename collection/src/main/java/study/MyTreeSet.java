package study;

import java.util.TreeSet;

public class MyTreeSet {
    TreeSet<Student> students=new TreeSet<Student>();

    public void run(){
        Student student=new Student("짱구",1,1,1);
        Student student1=new Student("철수",1,1,2);
        Student student2=new Student("훈이",1,1,5);
        Student student3=new Student("맹구",1,1,3);
        Student student4=new Student("유리",1,1,2);

        students.add(student);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student);

        for(Student s:students){
            System.out.println(s);
        }
    }
}
