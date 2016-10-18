package StudentPackage;

/**
 * Created by Talha on 4/15/2016.
 */
public class PublicClass {

    public int PubliClassAge = 0;
    PackagePrivateClass ppc = new PackagePrivateClass();

    public PublicClass(){
        System.out.println("No return Constructor");
        PubliClassAge = ppc.age;
    }

    public PublicClass(int age){
        System.out.println("No return Constructor + argumented");
        PubliClassAge = ppc.age;
    }

    public int PublicClass(){
        System.out.println("Return Constructor");
        PubliClassAge = ppc.age;
        return PubliClassAge + 20;
    }

    public void PublicMethod(){
        System.out.println("Public Method");
    }
}
