package AdvanceFeaturesAndNewJava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



public class StreamClass {

    List<String> list = Arrays.asList("abc", "mango", "", "stupid", "fice","");

    List<Integer> listNumbers = Arrays.asList(10,2,77,22,32,14);

    public void PrintEmpty(){
        List<String> filtered = list.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        filtered.stream().forEach(System.out::println);
    }

    public long CountEmpty(){
        return list.stream().filter(string -> string.isEmpty()).count();
    }

    public void SortList(){
        listNumbers.stream().sorted().forEach(System.out::println);
    }

    public void SortSave(){
        listNumbers.stream().sorted().forEachOrdered(System.out::println);
    }

}
