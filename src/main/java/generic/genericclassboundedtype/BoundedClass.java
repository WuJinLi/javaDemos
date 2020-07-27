package generic.genericclassboundedtype;

/**
 * 限定类型参数的泛型类
 * 需要在参数类型后加上 extends 关键字，然后是其上限类型(类或接口)。
 * @param <T>
 */
public class BoundedClass<T extends Comparable> {

    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }


    public T min(T outter) {
        if (this.t.compareTo(outter) > 0) {
            return outter;
        } else
            return this.t;
    }


    public static void main(String[] args){
        BoundedClass<String> boundedClass=new BoundedClass<String>();
        boundedClass.setT("a");
        System.out.println(boundedClass.min("b"));
    }
}
