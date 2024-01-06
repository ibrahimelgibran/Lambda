package iegcode.lambda.app;

import java.util.function.Supplier;

public class LazyApp {
    public static void main(String[] args) {
        testScore(90, () -> getName());
    }

    public static void testScore(int score, Supplier<String> name){
        if (score > 80){
            System.out.println("Selamat " + name.get() + ", Anda Lulus");
        } else {
            System.out.println("Coba lagi tahun depat");
        }
    }

    public static String getName(){
        System.out.println("Method getName() dipanggil");
        return "Gibran";
    }
}
