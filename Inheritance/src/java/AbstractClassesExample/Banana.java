package AbstractClassesExample;

/**
 * Created by Talha on 4/24/2016.
 */
public class Banana extends Fruit {

    public int angle = 70;

    public Banana(){
        price = 50;
    }

    @Override
    public String GetName() {
        return name;
    }

    @Override
    public void SetName(String value) {
        name = value;
    }

    @Override
    public String GetSeason() {
        return season;
    }

    @Override
    public void SetSeason(String value) {
        season = value;
    }

    public void CalculatePrice(){

        System.out.println("1 Dozen Banana = " + price);
    }

}
