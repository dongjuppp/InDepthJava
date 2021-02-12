package thread;

import java.util.ArrayList;

public class Table {
    private ArrayList<String> food=new ArrayList<>();
    private final int MAX=6;

    public synchronized void addFood(String foodName){
        while(food.size()>MAX){
            System.out.println("table max");
            try{
                wait();
            }catch (InterruptedException e){}
        }
        while(true){
            food.add(foodName);
            System.out.println("Add food");
            notify();
            if(food.size()>MAX) break;
        }
    }

    public void eatFood(Person person){
        synchronized(this){
            while(food.size()==0){
                System.out.println(person.getPersonName()+" wait food11");
                try{
                    wait();
                }catch (InterruptedException e){}
            }
            while(true){
                while(food.size()>0){
                    System.out.println(person.getPersonName()+" eat "+food.get(0));
                    food.remove(0);
                    notify();
                }

                System.out.println(person.getPersonName()+" wait food22");
                try{
                    wait();
                }catch (InterruptedException e){}
            }
        }
    }
}
