package InheritanceTypeExample;

/**
 * Created by Talha on 4/18/2016.
 */
public class ClassB extends ClassA {

    public ClassB() {
        this.name = "ClassB";
        
    }

    public void display() {
        System.out.println(name);
    }

    public void GrandParent() {
        System.out.println("GrandParentB");
    }
}
