package com;

import MembersTest.PublicClassHuman;

/**
 * Created by Talha on 4/14/2016.
 */
public class FeesCalculator {

    int NoModifiervalue = 1;
    private int Privatevalue = 2;
    public int Publicvalue = 3;
    protected int Protectedvalue= 4;

    public PublicClassHuman pch = new PublicClassHuman();

    public void meth(){
        // only Public member of variable pch are accessible.
    }
}
