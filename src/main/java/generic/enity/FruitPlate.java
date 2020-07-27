package generic.enity;

import java.util.ArrayList;
import java.util.List;

public class FruitPlate implements Plate {

    private List items =new ArrayList(6);

    public void set(Object o) {
        items.add(o);
    }

    public Fruit get() {
        int index = items.size()-1;
        if (index>=0) return (Fruit) items.get(index);
        return null;
    }
}
