package s106_Generics.S106_N1exercise2;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Mar", "Baez", 40);
        String bedtime = "Sweet dreams!";
        int number = 23;

        GenericMethods method = new GenericMethods();
        method.printArguments(person, bedtime, number);
    }
}
