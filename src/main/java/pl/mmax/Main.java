package pl.mmax;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Kasia", "Max","Vlad","Natalia","Kuba");
        Greeter greeter = new Greeter();

        for(String name: names){
            if(name.endsWith("a") && name!="Kuba"){
                greeter.greet(name);
            }
        }

      names.stream().filter(name -> name.endsWith("a")).filter(name -> name!="Kuba").map(String::toUpperCase).forEach(greeter::greet);



    }

}
