package generic;

import generic.genericclass.GenericClass;
import generic.enity.*;
import generic.genericclass.ImplMultipleGeneric;
import generic.genericmethods.MethodGeneric;

/**
 * <p>使用泛型的好处</p>
 * 消除类型转换
 * 在编译时进行更强的类型检查
 * 增加代码的复用性
 */
public class ScenarioMain {
    public static void main(String[] args) {
//        scenario1();
//        scenario2();
//        scenario4();
//        aGenericClassTest();
//        multipleGenericTest();
        methodGeneric();
    }


    public static void scenario1() {
        James james = new James();
        Lucy lucy = new Lucy();
        FruitPlate fruitPlate = james.getPlate();
        james.addFruit(fruitPlate, new Orange());
        lucy.eat((Orange) fruitPlate.get());
    }

    public static void scenario2() {
        James james = new James();
        Lucy lucy = new Lucy();
        AiFruitPlate<Orange> aiFruitPlate = james.getAiFruitPlate();
        james.add(aiFruitPlate, new Orange());
        lucy.eat(aiFruitPlate.get());

    }

    //编译报错
//    public static void scenario3() {
//        James james = new James();
//        Lucy lucy = new Lucy();
//        AiFruitPlate<Orange> aiFruitPlate = james.getAiFruitPlate();
//        james.add(aiFruitPlate, new Apple());
//        lucy.eat(aiFruitPlate.get());
//
//    }

    //java.lang.ClassCastException: generic.enity.Apple cannot be cast to generic.enity.Orange
    public static void scenario4() {
        James james = new James();
        Lucy lucy = new Lucy();
        FruitPlate fruitPlate = james.getPlate();
        james.addFruit(fruitPlate, new Apple());
        lucy.eat((Orange) fruitPlate.get());
    }


    public static void aGenericClassTest(){
        GenericClass<String> genericClass=new GenericClass<String>();
        genericClass.setT("zhangsan");
        System.out.println(genericClass.getT());

    }


    public static void multipleGenericTest(){
        ImplMultipleGeneric<String,Integer> integerImplMultipleGeneric=new ImplMultipleGeneric<String, Integer>("per",12);
        System.out.println("integerImplMultipleGeneric key and value is :"+integerImplMultipleGeneric.getKey()+","+integerImplMultipleGeneric.getValue());

        ImplMultipleGeneric<String,String> stringStringImplMultipleGeneric =new ImplMultipleGeneric<String, String>("per","rose");
        System.out.println("stringStringImplMultipleGeneric key and value is :"+stringStringImplMultipleGeneric.getKey()+","+stringStringImplMultipleGeneric.getValue());

    }


    public static void  methodGeneric(){
        MethodGeneric methodGeneric=new MethodGeneric();

        System.out.println(methodGeneric.genericMethod("zhansgan","ROSE","lUCY"));
        System.out.println(methodGeneric.genericMethod(1,3,"lUCY"));
    }
}
