package javabasics;

public class ArrayExample {
    public static void main(String[] args) {
int[] i={1,2,3,4,5};
        System.out.println(i[0]);
        System.out.println(i[4]);
        System.out.println(i.length);

        String[] name={"rachna","reema","rinku"};
        System.out.println(name[1]);
        for(int a:i) {
           System.out.println(a);//Example of advanced for loop
        }
            for(String s:name){
                System.out.println(s);
            }



    }

}

