package javabasics;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<Integer>();
        s.add(11);
        s.add(12);
        s.add(11);
        System.out.println(s);
        for (int u : s) {
            System.out.println(u);

        }

    }
}