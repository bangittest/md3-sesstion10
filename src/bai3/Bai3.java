package bai3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Bai3 {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        list.add(20);
        list.add(11);
        list.add(22);
        list.add(14);
        list.add(9);
//        System.out.println(list);
//        Collections.sort(list);
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        System.out.println("thứ tự giảm dần la : " +list);

    }
}
