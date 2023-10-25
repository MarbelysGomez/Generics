package s106_Generics.S106_N1exercise1;

public class Main {
    public static void main(String[] args) {
        NonGenericMethods<String> instance = new NonGenericMethods<>("House", "Building", "Cottage");

        System.out.println("Object 1: " + instance.getObj1());
        System.out.println("Object 2: " + instance.getObj2());
        System.out.println("Object 3: " + instance.getObj3());
    }
}
