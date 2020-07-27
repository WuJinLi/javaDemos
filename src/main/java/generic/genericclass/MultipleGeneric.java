package generic.genericclass;

/**
 * 多参数类型范型
 * @param <K>
 * @param <V>
 */

public interface MultipleGeneric<K, V> {

    public K getKey();
    public V getValue();
}
