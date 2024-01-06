package iegcode.lambda.app;

import iegcode.lambda.SimpleAction;

public class SimpleActionApp {
    public static void main(String[] args) {

//        // menggunakan anonymous class
//        SimpleAction simpleAction1 = new SimpleAction() {
//            @Override
//            public String action() {
//                return "Gibran";
//            }
//        };
//        System.out.println(simpleAction1.action());
//
//        // menggnakkan lambda lebih simple
//        SimpleAction simpleAction2 = () -> {
//            return "Gibran";
//        };
//        System.out.println(simpleAction2.action());


        SimpleAction simpleAction1 = (String value) -> {
          return "Gibran" + value;
        };

        SimpleAction simpleAction2 = (name) ->{
            return "Gibran" + name;
        };

        SimpleAction simpleAction3 = (String value) -> "Gibran" + value;

        SimpleAction simpleAction4 = (value) -> "Gibran" + value;

        SimpleAction simpleAction5 = value -> "Gibran" + value;
    }
}
