package generic.genericclass;

/**
 * 范型类：
 * @param <T>
 *  E->Element
 *  K->Key
 *  V-<Value
 *  N->Number
 */

//单个参数类型
public class GenericClass<T> {

    private T t;


    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
