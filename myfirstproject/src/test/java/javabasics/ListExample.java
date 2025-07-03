package javabasics;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<Integer> l=new ArrayList<Integer>();
        l.add(21);
        l.add(22);
        l.add(23);
        System.out.println(l);
        l.add(24);
        l.add(25);
        l.add(25);
        System.out.println(l);
        for(int j:l){
            System.out.println(j);
        }
        List<String> l1=new ArrayList<String>();
        l1.add("hi");
        l1.add("hello");
        l1.add("hello");
        System.out.println(l1);

    }


}
