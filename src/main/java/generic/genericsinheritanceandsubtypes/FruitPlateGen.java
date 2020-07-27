package generic.genericsinheritanceandsubtypes;

import generic.enity.Plate;

import java.util.ArrayList;
import java.util.List;

/**
 * 如果你只需要从集合中获得类型T , 使用<? extends T>通配符
 * 如果你只需要将类型T放到集合中, 使用<? super T>通配符
 * 如果你既要获取又要放置元素，则不使用任何通配符
 *
 * @param <Fruit>
 */
public class FruitPlateGen<Fruit> implements Plate<generic.genericsinheritanceandsubtypes.Fruit> {

    private List<generic.genericsinheritanceandsubtypes.Fruit> fruits = new ArrayList<generic.genericsinheritanceandsubtypes.Fruit>(6);

    public void set(generic.genericsinheritanceandsubtypes.Fruit fruit) {
        fruits.add(fruit);
    }

    public generic.genericsinheritanceandsubtypes.Fruit get() {
        int index = fruits.size() - 1;
        if (index >= 0) return fruits.get(index);
        return null;
    }


    public static void main(String[] args) {
        FruitPlateGen<generic.genericsinheritanceandsubtypes.Fruit> fruitFruitPlateGen = new FruitPlateGen<generic.genericsinheritanceandsubtypes.Fruit>();

        fruitFruitPlateGen.set(new Apple());
        fruitFruitPlateGen.set(new Orange());
        fruitFruitPlateGen.set(new IOrange());


        James james = new James();
        james.getAiFruitPlateGen(new FruitPlateGen<generic.genericsinheritanceandsubtypes.Fruit>());
        james.getAiFruitPlateGen(new FruitPlateGen<Orange>());

    }
}
