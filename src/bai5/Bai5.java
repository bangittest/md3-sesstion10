package bai5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Bai5 {
    public static void main(String[] args) {
//        String inputString = "Rekkei Academy để nông dân biết code";
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap chuoi so");
        String inputString = scanner.nextLine();

        List<String>words=new ArrayList<>(Arrays.asList(inputString.split(" ")));

        String min=words.get(0);
        for (String word:words) {
            if (word.length()<min.length()){
                min=word;
            }
        }

        System.out.println("tu nhat nhat trong cau la : " +min);
    }
}
