package AdvanceFeaturesAndNewJava;

/**
 * Created by Talha on 5/1/2016.
 */
public class MyAnonymousClass {

    interface ICountrySpecs{

        public void CountryName();

        public void CountryReligion(String value);
    }

    public void CountryDetails(){

        // local class example
        class Pakistan implements ICountrySpecs{
            String religion;

            @Override
            public void CountryName() {
                System.out.println("Islamic Republic of Pakistan");
            }

            @Override
            public void CountryReligion(String value) {
                religion = value;
                System.out.println("Religion " + religion);
            }
        }

        ICountrySpecs paki = new Pakistan();

        // Anonymous class example
        ICountrySpecs ind = new ICountrySpecs() {
            String religion;

            @Override
            public void CountryName() {
                System.out.println("India");
            }

            @Override
            public void CountryReligion(String value) {
                religion = value;
                System.out.println("Religion " + religion);
            }
        };

        paki.CountryName();
        ind.CountryReligion("Secholar");
        paki.CountryReligion("Islam");
        ind.CountryName();

    }

}
