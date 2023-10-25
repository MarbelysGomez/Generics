package s106_Generics.S106_N2exercise1;

public class Main {
    public static void main(String[] args) {
        Person_ArgsList person = new Person_ArgsList("Mar", "Baez", 40);
        String bedtime = "Sweet dreams!";
        int number = 23;

        Generic_AgsList method = new Generic_AgsList();
        method.printArguments(person, bedtime, number);
    }
}
