package InterfaceExample;

/**
 * Created by Talha on 4/25/2016.
 */
public class Crow implements IKillers {

    int maxAge;

    public Crow(int value){
        maxAge = value;
    }

    @Override
    public void Eat() {
        System.out.println("Start eating snails");
    }

    @Override
    public void ageStates() {
        System.out.println("Bachpan: 1");
        System.out.println("Jawani : 1");
        System.out.println("Burhapa: 1");
    }

    @Override
    public String countriesWherePresent() {
        return "India, Pakistan, Bangladesh, USA";
    }

}
