package AnnotationExample;


@ClassInfo(
        author = "M. Talha",
        date = "14/5/2016",
        currentVersion = 1,
        lastModifiedBy = "M. Talha",
        contributors = {"Asad", "Ali", "Saqib"}
        )
public class Animal {

    String name = "Animal";
    int numOfLegs = 2;
    String gender = "Male";

    public void GetName(){
        System.out.println("name: "+ name);
    }

    public void GetNumOfLegs(){
        System.out.println("numOfLegs: "+ numOfLegs);
    }

    /**
     * @deprecated
     * This does not matter in free world :-)
     */
    @Deprecated
    public void Gender(){
        System.out.println("gender: " + gender);
    }

}
