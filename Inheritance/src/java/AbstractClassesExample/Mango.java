package AbstractClassesExample;

/**
 * Created by Talha on 4/24/2016.
 */
 public class Mango extends Fruit {

    public Mango(){
        price = 100;
    }

    public void Hello(){
        System.out.println("Hello");
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
        System.out.println("1 kg Mangoes = " + price);
    }

    @Override
    public void GetCompanyName(){
        System.out.println("DX Fruit Dealers: Mango Only");
    }

}
