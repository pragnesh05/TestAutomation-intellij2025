package javabasics;

public class ConstructorExample {

    static int a=3;
    static int b;


    public ConstructorExample() {
        a = 1;
        b=2;

    }
    public  ConstructorExample(int b){

      this.b=b;
    }
    public static void main(String[] args) {
        ConstructorExample c = new ConstructorExample(56);
        System.out.println(b);
        System.out.println(a);

    }
}

