package InterfaceExample;

/**
 * Created by Talha on 4/25/2016.
 */
public class Lion implements IKillers {

    int maxAge;

    public Lion(int value){
        maxAge = value;
    }

    @Override
    public void Eat() {
        System.out.println("Start eating Dears");
    }

    @Override
    public void ageStates() {

        System.out.println("Bachpan: 6");
        System.out.println("Jawani : 20");
        System.out.println("Burhapa: 14");
    }

    @Override
    public String countriesWherePresent() {
        return "India, Africa, Australia, New Zealand";
    }
}
