import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyClass {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Ja" + "va";
        System.out.println(s1 == s2);
        System.out.println("Hello" == new String("Hello"));
    }
}