package javabasics;

public class LoopsExample {
    public static void main(String[] args) {
        int[] a= {10,20,30,40};
        for(int h=0; h < a.length; h++)//traditional loop
        {
            System.out.println(a[h]);
        }
        for(int i:a) {
            System.out.println(i);//advance loop

        }
    }
}
