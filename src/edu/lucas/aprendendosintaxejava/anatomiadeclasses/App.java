package edu.lucas.aprendendosintaxejava.anatomiadeclasses;
import edu.lucas.aprendendosintaxejava.calculate.Calculate;

public class App {
    public static void main(String[] args) throws Exception {
        final String BR = "Brasil";
        long salary = 1000000L;
        float salary1 = 2400.55F;


        int result = Calculate.sum(2, 2);
        System.out.println("Hello World! ".concat(BR));
        System.err.println(result);
    }

}
