package s106_Generics.S106_N1exercise2;

public class GenericMethods {
    public <T, U, V> void printArguments(T arg1, U arg2, V arg3) {
        System.out.println("Argument 1: " + arg1);
        System.out.println("Argument 2: " + arg2);
        System.out.println("Argument 3: " + arg3);
    }
}
