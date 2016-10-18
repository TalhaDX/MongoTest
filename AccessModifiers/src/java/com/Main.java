package com;
import ExpenseManagement.ElectricityBillCalculator;
import MembersTest.PublicClassHuman;
import MembersTest.PublicClassHumanChild;


public class Main {

    public static void main(String[] args) {

    //  ----------- To show members modifiers access features of extended classes ------------- //
    // import MembersTest.PublicClassHuman;
    // You can call different constructors of a class according to need
    // ------------------------------------------------------------------------------------------------------
        PublicClassHuman pch = new PublicClassHuman();
        PublicClassHumanChild pchC = new PublicClassHumanChild();
        System.out.println("pch.PublicVariable : " + pch.PublicVariable ); // on this public is accessible here, others are not

       // pchC.CallMembers(); // Only Public member accessible. You can not even access its
                             // Protected and NoModifier member here, because it is other package.

        // From other module
        FeesCalculator fc = new FeesCalculator();
        ElectricityBillCalculator ebc = new ElectricityBillCalculator();

        System.out.println("pch.PublicVariable : " + fc.Protectedvalue ); // on this public is accessible here, others are not

    // ------------------------------------------------------------------------------------------------------

    //  ----------- To show Constructor access features ------------- //
    // import StudentPackage.PublicClass;
    // You can call different constructors of a class according to need
    // ------------------------------------------------------------------------------------------------------
       /* PublicClass pc = new PublicClass(15); // argumented constructor is called
        int num;
        num = pc.PublicClass(); // return type constructor is called

      System.out.println("pc age: " + pc.PubliClassAge);
      System.out.println("num: " + num);*/
    // ------------------------------------------------------------------------------------------------------



    }
}
