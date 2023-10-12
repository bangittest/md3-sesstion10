package bai1;

import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Bai1 {
    public static void main(String[] args) {
        List<Integer>newlist=new ArrayList<>();
        newlist.add(100);
        newlist.add(200);
        newlist.add(300);
        newlist.add(399);
        newlist.add(500);
        newlist.add(288);
        System.out.println(newlist);
        newlist.add(1,88);
        System.out.println(newlist);

        //dao nguoc
        Collections.sort(newlist);
        System.out.println(newlist);

        int max=newlist.get(0);
//        for (Integer in:newlist) {
//            if (max<in){
//                max=in;
//            }
//        }
//        System.out.println("max=" +max );

        for (int i = 0; i < newlist.size(); i++) {
            if (max<newlist.get(i)){
                max=newlist.get(i);
            }
        }
        System.out.println("so lon nhat max= " +max);


        //tim nho nhat
        int min=newlist.get(0);
        for (int i = 0; i < newlist.size(); i++) {
            if (min>newlist.get(i)){
                min=newlist.get(i);
            }
        }
        System.out.println("so nho nhat min = " +min);
    }


  Collection<String>animals= Arrays.asList("dog","cat","Cow","Brid","Moose","Pid");
    Collection<String>result1= new ArrayList<String>();
    Collection<String>result2= new ArrayList<String>();

    AtomicInteger count=new AtomicInteger();

    int midpoint=Math.round(animals.size()/2);
}
