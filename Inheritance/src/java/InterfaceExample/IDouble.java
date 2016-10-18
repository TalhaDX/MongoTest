package InterfaceExample;

/**
 * Created by Talha on 10/10/2016.
 */

// Implements both IFly and IKillers, so that if we want a class to implement both
    // iFly and iKiller. We use this interface.
public interface IDouble extends IFly, IKillers {

    String DoubleReturn();

}
