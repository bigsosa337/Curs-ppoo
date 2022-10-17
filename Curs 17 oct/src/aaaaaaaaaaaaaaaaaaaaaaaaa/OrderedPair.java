package aaaaaaaaaaaaaaaaaaaaaaaaa;

public class OrderedPair <K, V> implements Pair<K, V>{
    private K key;
    private V value;


    @Override
    public K getkey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public OrderedPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void show()
    {
        System.out.println("key: " +key);
        System.out.println("value: " +value);
    }
}
