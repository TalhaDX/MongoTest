
package MembersTest;

/**
 * Created by Talha on 4/15/2016.
 */

public class PublicClassHumanChild extends PublicClassHuman {

    public PublicClassHumanChild(){

    }

    public void CallMembers(){
        System.out.println("super.ProtectedVariable : " + super.ProtectedVariable );
        System.out.println("super.PublicVariable : " + super.PublicVariable );
        System.out.println("super.NoModifierVariable : " + super.NoModifierVariable );
    }

}
