package CollectionExample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Talha on 4/28/2016.
 */
public class ListExample {

    List<Integer> list = new ArrayList<Integer>();

    public void AddObject(int value){
        list.add(value);
    }

    public  void PrintList(){
        for(Object obj : list) {
            System.out.print((Integer) obj);
        }
        System.out.println("");
    }

    public void PrintViaIterator(){
        //access via Iterator
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            Integer element = (Integer) iterator.next();
            System.out.print(" s: " + element);
        }
        System.out.println("");
    }

    public void SetObject(int index, int value){
        list.set(index, value);
    }

}
