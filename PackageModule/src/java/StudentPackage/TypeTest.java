package StudentPackage;

/**
 * Created by Talha on 10/10/2016.
 */

// Primitive vs Reference type test
public class TypeTest {

    public void StringImmutableTest(){

        String myString = new String( "old String" );
        System.out.println( myString );
        myString.replaceAll( "old", "new" );
        System.out.println( myString );

        System.out.println( myString );
    }

    public void PrimitiveExample(){

        // Primitive type
        int a = 3; int b = a;
        System.out.println("Old a = " + a + " ---- Old b = " + b );

        a = 4;
        System.out.println("New a = " + a + " ---- New b = " + b );

        // Primitive type
        String ObjA = new String("Talha");
        String ObjB = ObjA;
        System.out.println("=========================================");
        System.out.println("Old a = " + ObjA + " ---- Old b = " + ObjB );

        ObjA = "Ali";
        System.out.println("New a = " + ObjA + " ---- New b = " + ObjB );

        System.out.println("=========================================");

    }

    public void ReferenceExample() {

        // Reference type
        Student StuA = new Student();
        StuA.setAge(3);
        Student StuB = StuA;
        System.out.println("Old StuA = " + StuA.getAge() + " ---- Old StuB = " + StuB.getAge());

        StuA.setAge(4);
        System.out.println("New StuA = " + StuA.getAge() + " ---- New StuB = " + StuB.getAge());

    }

}
