package com;

import MembersTest.PublicClassHuman;

/**
 * Created by Talha on 4/16/2016.
 */
public class PublicClassHumanChildOtherPackage extends PublicClassHuman {

    int NoModifierVariable = 1;
    public int PublicVariable = 2;
    private int PrivateVariable = 3;
    protected int ProtectedVariable = 4;

    public void CallMembers(){
        System.out.println("super.ProtectedVariable : " + super.ProtectedVariable );
        System.out.println("super.PublicVariable : " + super.PublicVariable );

        // if other package, it can not inherit package-private member as well
       //System.out.println("super.NoModifierVariable : " + super.NoModifierVariable );

    }

    public void PublicClassHumanMethod(){
        System.out.println("PublicClassHumanMethod");
    }

    protected void ProtectedClassHumanMethod(){
        System.out.println("ProtectedClassHumanMethod");
    }
}
