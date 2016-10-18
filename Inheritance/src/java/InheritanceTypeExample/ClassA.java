package InheritanceTypeExample;

/**
 * Created by Talha on 4/18/2016.
 */
public class ClassA {

    protected String name = "ClassA";
    int age = 2;

    public ClassA() {

    }

    public void display() {

        System.out.println(name);
    }

    public int getAge(){
        return age;
    }

    // you can override the members & methods in children
    // but you

    public void chew(){
        System.out.println("Chew");
    }

    public void GrandParent() {
        System.out.println("GrandParentA");
    }
}
