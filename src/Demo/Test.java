package Demo;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<Integer>integers=new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);


        Comparator<Integer>comparator=new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return  o2-o1;
            }
        };

        Collections.sort(integers,comparator);

        Collections.reverse(integers);
//        Collections.sort(integers, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1-o2;
//            }
//        });



        System.out.println("duyet bang for-each");

        for (Integer e: integers) {
            System.out.println(e);
        }

        Iterator<Integer>interator=integers.iterator();
        System.out.println("duyet bang interator");
        while (interator.hasNext()) {
            System.out.println(interator.next());
        }


    }
}
