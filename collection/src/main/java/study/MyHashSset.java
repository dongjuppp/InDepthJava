package study;

import java.util.HashSet;

public class MyHashSset {
    HashSet<Student> hashSet=new HashSet<Student>();

    public void run(){
        Student student=new Student("짱구",1,1,1);
        Student student1=new Student("철수",1,1,2);
        Student student2=new Student("맹구",1,1,3);
        Student student3=new Student("유리",1,1,4);

        hashSet.add(student);
        hashSet.add(student); // 중복
        hashSet.add(student1);
        hashSet.add(student2);
        hashSet.add(student3);

        for(Student s:hashSet){
            System.out.println(s);
        }
    }
}
