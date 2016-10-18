package GenericsExample;

/**
 * Created by Talha on 4/29/2016.
 */
public class ImplementationIGeneric<K, V> implements IGeneric<K, V> {

    private K key;
    private V value;

    public ImplementationIGeneric(K key, V value){
        this.key = key;
        this.value = value;

    }

    @Override
    public K GetKey() {
        return this.key;
    }

    @Override
    public V GetValue() {
        return this.value;
    }
}
