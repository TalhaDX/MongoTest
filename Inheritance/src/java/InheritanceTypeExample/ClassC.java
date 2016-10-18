package InheritanceTypeExample;

/**
 * Created by Talha on 4/18/2016.
 */
public class ClassC extends ClassB {

    public ClassC() {
        name = "ClassC";
    }

    public void display() {
        System.out.println(name);
        age = 10;
        System.out.println(age);
    }

    public void NewMethod(){
        System.out.println("New");
    }
    public void GrandParent() {
        System.out.println("GrandParent of: " + name);
    }
}
