package CollectionExample;

import java.util.HashMap;

/**
 * Created by Talha on 4/28/2016.
 */
public class HashmapExample {

    // Create a hash map
    HashMap<String, String> hm = new HashMap<String, String>();

    public HashmapExample() {
        hm.put("Ali","Tahir Shah");
    }

    public void get(){
        System.out.println(hm.get("Ali"));

    }

    public void change(String value){
        hm.replace("Ali", value);
    }

    public void other(String value){

    }
}
