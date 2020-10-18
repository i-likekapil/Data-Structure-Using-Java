package Map;

public interface MapADT<K,V> {
    int size();

    boolean isEmpty();


    V get(K key);

    V put(K key, V value);

    V remove(K key);

    Iterable<K> keySet();

    Iterable<V> values();

    Iterable<Entry<K, V>> entrySet();

    interface Entry<K, V> {

        K getKey();

        V getValue();


        public String toString();

        public boolean equals(Object obj);



        @Override
        public int hashCode();


    }
}
