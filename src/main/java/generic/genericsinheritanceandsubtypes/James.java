package generic.genericsinheritanceandsubtypes;

import generic.enity.Person;

public class James extends Person {

//    public FruitPlateGen getAiFruitPlateGen(FruitPlateGen<Fruit> plateGen){
//        return new FruitPlateGen();
//    }


    public FruitPlateGen getAiFruitPlateGen(FruitPlateGen<? extends Fruit> plateGen){
        return plateGen;
    }
}
