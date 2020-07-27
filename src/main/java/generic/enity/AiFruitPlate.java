package generic.enity;

import java.util.ArrayList;
import java.util.List;

public class AiFruitPlate<T> implements Plate<T> {

    private List<T> fruits=new ArrayList<T>(6);


    public void set(T t) {
        fruits.add(t);
    }

    public T get() {
        int index = fruits.size()-1;

        if (index>=0) return fruits.get(index);
        return null;
    }
}
