package bai4;

import java.util.ArrayList;
import java.util.List;
public class Bai4 {


        public static void main(String[] args) {


            String inputString="Rekkei    Academy   để   nông   dân biết code";
            List<String>stringList=new ArrayList<>();
            String[]word=inputString.split(" ");
            for (String words: word) {
                stringList.add(words);
            }
            System.out.println(stringList);

            for (String words:stringList) {
                if (words.length()>3){
                    System.out.println(words);
                }
            }
        }
}
