package iegcode.lambda.app;

import java.util.function.Supplier;

public class SupplierApp {
    public static void main(String[] args) {

        Supplier<String> supplier = () -> "Ibrahim El Gibran";
        System.out.println(supplier.get());
    }
}
