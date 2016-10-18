package AbstractClassesExample;

/**
 * Created by Talha on 4/24/2016.
 */
public abstract class Fruit {

    public int price;
    public String name;
    public String season;
    public Double averageWeight;

    public abstract String GetName();
    public abstract void SetName(String value);

    public abstract String GetSeason();
    public abstract void SetSeason(String value);

    public abstract void CalculatePrice();

    public void GetCompanyName(){
        System.out.println("DX Fruit Dealers");
    }

    public void NonAbstractMethod(){
        System.out.println("To test that we can make object of this class and use its method");
    }

}
