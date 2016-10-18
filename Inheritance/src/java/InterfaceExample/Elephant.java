package InterfaceExample;

/**
 * Created by Talha on 4/25/2016.
 */
public class Elephant implements IKillers {

    int maxAge;

    public Elephant(int value){
        maxAge = value;
    }

    @Override
    public void Eat() {
        System.out.println("Start eating bambo's");
    }

    @Override
    public void ageStates() {

        System.out.println("Bachpan: 10");
        System.out.println("Jawani : 30");
        System.out.println("Burhapa: 30");
    }

    @Override
    public String countriesWherePresent() {
        return "India, Africa, Mali, Sri Lanka, Maldives";
    }
}
