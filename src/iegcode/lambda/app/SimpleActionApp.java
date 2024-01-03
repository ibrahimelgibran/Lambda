package iegcode.lambda.app;

import iegcode.lambda.SimpleAction;

public class SimpleActionApp {
    public static void main(String[] args) {

        // menggunakan anonymous class
        SimpleAction simpleAction1 = new SimpleAction() {
            @Override
            public String action() {
                return "Gibran";
            }
        };
        System.out.println(simpleAction1.action());

        // menggnakkan lambda lebih simple
        SimpleAction simpleAction2 = () -> {
            return "Gibran";
        };
        System.out.println(simpleAction2.action());
    }
}
