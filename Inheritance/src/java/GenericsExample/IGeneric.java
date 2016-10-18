package GenericsExample;

/**
 * Created by Talha on 4/29/2016.
 */
public interface IGeneric<K, V> {

    public K GetKey();
    public V GetValue();
}
