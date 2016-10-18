package AnnotationExample;

/**
 * Created by Talha on 5/14/2016.
 */

public class Lion extends Animal {

    public Lion (){
        name = "Lion";
        numOfLegs = 4;
    }

    @Override
    public void GetName(){

        System.out.println("name: "+ name);
    }

    @Override
    public void GetNumOfLegs(){
        System.out.println("numOfLegs: "+ numOfLegs);
    }


}
