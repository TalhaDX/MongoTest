package GenericsExample;

// T can be any type that we want to use...
public class GenericClass<T> {

    private T t;

    public  void Set(T t){
        this.t = t;
    }

    public T Get(){
        return t;
    }
}
