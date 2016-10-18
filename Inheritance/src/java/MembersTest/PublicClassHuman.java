package MembersTest;

/**
 * Created by Talha on 4/15/2016.
 */
public class PublicClassHuman {

    int NoModifierVariable = 1;
    public int PublicVariable = 2;
    private int PrivateVariable = 3;
    protected int ProtectedVariable = 4;

    public PublicClassHuman(){
        PublicVariable = 2;
        ProtectedVariable = 4;
    }

    public int getPublicVariable(){
        return PublicVariable;
    }

    public int getProtectedValriable(){
        return ProtectedVariable;
    }

    public void PublicClassHumanMethod(){
     System.out.println("PublicClassHumanMethod");
    }

    protected void ProtectedClassHumanMethod(){
        System.out.println("ProtectedClassHumanMethod");
    }

}
