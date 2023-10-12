package bai2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Bai2 {
    public static void main(String[] args) {
        List<String> array = new ArrayList<>();
        array.add("hello");
        array.add("world");
        array.add("java");
        array.add("php");
        System.out.println(array);


        Collections.reverse(array);
        System.out.println(array);
    }
}
