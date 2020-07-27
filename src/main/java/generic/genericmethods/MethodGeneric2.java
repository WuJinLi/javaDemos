package generic.genericmethods;

/**
 * 范型类里边定义范型方法
 */
public class MethodGeneric2 {
    static class Fruit {
        @Override
        public String toString() {
            return "fruit";
        }
    }


    static class Apple extends Fruit {
        @Override
        public String toString() {
            return "Apple";
        }
    }

    static class Person {
        @Override
        public String toString() {
            return "person";
        }
    }

    static class ShowClass<T> {
        public void show1(T t) {

            System.out.println(t.toString());
        }

        public <E> void show2(E e) {
            System.out.println(e.toString());
        }

        public <T> void show3(T t) {
            System.out.println(t.toString());
        }
    }


    public static void main(String[] args) {
        Apple apple = new Apple();
        Person person = new Person();

        ShowClass<Fruit> showClass = new ShowClass<Fruit>();

        showClass.show1(apple); //可以放入 apple，因为 apple 是 fruit 的子类
//        showClass.show1(person);//此时，编译器会报错，因为 ShowClass<Fruit> 已经限定类型

        showClass.show2(apple);//可以放入，泛型方法 <E> 可以是任何非基本类型
        showClass.show2(person);//可以放入，泛型方法 <E> 可以是任何非基本类型

        showClass.show3(apple); //可以放入，泛型方法 <T> 和泛型类中的 <T> 不是同一条 T，可以是任何非基本类型
        showClass.show3(person);//可以放入，泛型方法 <T> 和泛型类中的 <T> 不是同一条 T，可以是任何非基本类型

    }
}

/**
 * 总结：
 *
 * 范型类里边编写的方法分为普通方法/范型方法
 *
 * 普通方法：参数入参、或者方法中使用的范型的数据类型都与范型类声明是的数据类型一致
 * 范型方法：参数入参、或者是方法中使用的范型数据类型与范型方法的范型数据类型一致
 *
 */
