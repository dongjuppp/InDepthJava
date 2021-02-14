package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class FruitShop<T extends Fruit> implements Iterable<T> {
    private ArrayList<T> basket;

    public FruitShop(){
        basket=new ArrayList<>();
    }

    public void addFruit(T fruit){
        basket.add(fruit);
    }

    @Override
    public Iterator<T> iterator() {
        return new FruitBasket();
    }

    private class FruitBasket implements Iterator<T>{
        private int cursor=0;
        @Override
        public boolean hasNext() {
            return cursor<basket.size();
        }

        @Override
        public T next() {
            int i=cursor;
            cursor++;
            return basket.get(i);
        }
    }
}
