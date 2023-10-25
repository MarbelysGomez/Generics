package s106_Generics.S106_N2exercise2;

import java.util.List;
public class Generic_UndefinedVar {
    public <T> void printArguments(List<T> args) {
        for (int i= 0; i < args.size(); i++) {
            System.out.println("Argument " + (i + 1) + ": " + args.get(i));
        }
    }
}
