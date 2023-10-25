package s106_Generics.S106_N2exercise1;

public class Generic_AgsList {
    public <T, V> void printArguments(T arg1, String arg2, V arg3) {
        System.out.println("Argument 1: " + arg1);
        System.out.println("Argument 2: " + arg2);
        System.out.println("Argument 3: " + arg3);
    }
}
