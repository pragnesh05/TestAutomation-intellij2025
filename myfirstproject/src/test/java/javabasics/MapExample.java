package javabasics;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {
        Map<Integer,String>m=new HashMap<Integer,String>();
        m.put(25,"apple");
        m.put(26,"grape");
        m.put(27,"orange");
        m.put(27,"peach");
        //System.out.println(m);
        System.out.println(m.get(25));


    }
}
