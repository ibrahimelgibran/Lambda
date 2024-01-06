package iegcode.lambda.app;

import iegcode.lambda.util.StringUtil;

import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceApp {
    public static void main(String[] args) {
// static
      //  Predicate<String> predicateIsLowerCase = value -> StringUtil.isLowerCase(value);
        Predicate<String> predicateIsLowerCase = StringUtil::isLowerCase;

        System.out.println(predicateIsLowerCase.test(("")));
        System.out.println(predicateIsLowerCase.test(("Gibran")));


//        method reference di parameter

//        Function<String, String> functionUpper = new Function<String, String>() {
//            @Override
//            public String apply(String value) {
//                return value.toUpperCase();
//            }
//        };

//        Function<String, String> functionUpper = value -> value.toUpperCase();
        Function<String, String> functionUpper = String::toUpperCase;
        System.out.println(functionUpper.apply("Gibran"));
    }

    // bukan static

    public void run (){
//        Predicate<String> predicate = new Predicate<String>() {
//            @Override
//            public boolean test(String value) {
//                return MethodReferenceApp.this.isLowerCase(value);
//            }
//        };
//        menggunakan lamba
        Predicate<String> predicateIsLowerCase = this::isLowerCase;

        System.out.println(predicateIsLowerCase.test("gibran"));
        System.out.println(predicateIsLowerCase.test("Gibran"));

    }

    // menggunakan object
    public void run2(){
        MethodReferenceApp app = new MethodReferenceApp();

        Predicate<String> predicateIsLowerCase = app::isLowerCase;

        System.out.println(predicateIsLowerCase.test("gibran"));
        System.out.println(predicateIsLowerCase.test("Gibran"));
    }

    public boolean isLowerCase(String value){
        for (var c : value.toCharArray()){
            if (!Character.isLowerCase(c)){
                return false;
            }
        }
        return true;
    }
}
