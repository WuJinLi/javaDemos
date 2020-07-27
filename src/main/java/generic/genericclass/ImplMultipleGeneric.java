package generic.genericclass;

public class ImplMultipleGeneric<K,V> implements MultipleGeneric<K,V> {

    private K key;
    private V value;


    public ImplMultipleGeneric(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
