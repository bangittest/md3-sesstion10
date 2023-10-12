import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Collection<Integer>arrayList=new ArrayList<>();

        arrayList.add(5);
        arrayList.add(6);
        arrayList.addAll(new ArrayList<>());

        System.out.println(arrayList.size());
        System.out.println(arrayList.isEmpty()?"collection dang rong":"collection dang k rong");

        System.out.println(arrayList.contains(1)?"collection dang chua phan tu 1":"collection dang k chua phan 1");
        List<Integer> seachCollection=new ArrayList<>();
        seachCollection.add(5);
        seachCollection.add(6);





//        seachCollection.add(7);
//        List<Integer>retainerList=new ArrayList<>();
//        retainerList.add(5);
//        retainerList.add(6);
//        seachCollection.retainAll(retainerList);


        if (arrayList.containsAll(seachCollection)){
            System.out.println("trong collection co chua cac phan tu sau : ");
//            for (Integer e:seachCollection) {
//                System.out.println("+ " +e);
//            }
            for (int i = 0; i < seachCollection.size(); i++) {
                System.out.println("+ " + seachCollection.get(i));
            }
        }
        arrayList.clear();
        System.out.println(arrayList.size()==0 ? "da giai phong du lieu":"chua thanh cong");
    }
}
