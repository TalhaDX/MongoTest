package InterfaceExample;

/**
 * Created by Talha on 4/25/2016.
 */
public class Fish implements IDouble {

    int maxAge;
    int swimSpeed;

    public Fish(int value){
        maxAge = value;
    }

    @Override
    public void Eat() {
        System.out.println("Start eating fishes");
    }

    @Override
    public void ageStates() {
        System.out.println("Bachpan: 1");
        System.out.println("Jawani : 2");
        System.out.println("Burhapa: 1");
    }

    @Override
    public String countriesWherePresent() {
        return "India, Pakistan, Saudia, Canada, USA";
    }

    @Override
    public boolean isSwimming() {
        return true;
    }

    @Override
    public void SetSwimSpeed(int speed) {
        swimSpeed = speed;
    }

    @Override
    public String GetSwimSpeed() {
        return "Speed: " + swimSpeed + "KM/H";
    }

    @Override
    public String DoubleReturn(){
        return "DoubleReturn";
    }
}
