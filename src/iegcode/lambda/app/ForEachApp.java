package iegcode.lambda.app;

import java.util.List;

public class ForEachApp {
    public static void main(String[] args) {

        List<String> list = List.of("Ibrahim", "El", "Gibran");

        // lamba
        list.forEach(value -> System.out.println(value));

        // lamba meethod reference
        list.forEach(System.out::println);
    }
}
