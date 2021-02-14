package main;

import iterator.Apple;
import iterator.Fruit;
import iterator.FruitShop;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        FruitShop<Apple> appleFruitShop=new FruitShop<>();

        appleFruitShop.addFruit(new Apple());
        appleFruitShop.addFruit(new Apple());
        appleFruitShop.addFruit(new Apple());
        appleFruitShop.addFruit(new Apple());
        appleFruitShop.addFruit(new Apple());
        appleFruitShop.addFruit(new Apple());


        Iterator<Apple> itr=appleFruitShop.iterator(); // 일회용이다!

        while(itr.hasNext()){
            System.out.println(itr.next().getName());
        }

        System.out.println();

        appleFruitShop.forEach(apple -> System.out.println(apple.getName())); //forEach 로 만들 수 있다.
    }
}
