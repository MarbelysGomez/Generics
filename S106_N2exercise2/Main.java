package s106_Generics.S106_N2exercise2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person_UnderfinedVar person = new Person_UnderfinedVar("Mar", "Baez", 40);
        String bedtime = "Sweet dreams!";
        int number = 23;

        List<Object> arguments = Arrays.asList(person, bedtime, number);

        Generic_UndefinedVar method = new Generic_UndefinedVar();
        method.printArguments(arguments);
    }
}
