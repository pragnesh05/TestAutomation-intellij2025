package javabasics;

public class ReturnStatements {
    int i=1;
    String name="hello";

     public static void main(String[] args) {

        ReturnStatements r=new ReturnStatements();
        System.out.println(r.m1());


    }

    public int m1(){

        int a=10;
        int b=20;
        System.out.println(a);
       // System.out.println(m2());
      return this.i;


    }
    public String m2(){
        String name="hi";
        // System.out.println(m3());
        System.out.println(name);
       return this.name;

    }
    public String m3() {

        String s="hey";
        return this.name;

    }


}

