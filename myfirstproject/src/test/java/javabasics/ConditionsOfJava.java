package javabasics;

public class ConditionsOfJava {
    public static void main(String[] args) {
        int a=10;
        //less than 8 *2
        //greater than 8 *3 but less than 30
        //greater than 30 *4
        if( a<8){
            System.out.println(a*2);
        }
        else if(a>8 && a<30){
            System.out.println(a*3);
        }
        else{
            System.out.println(a*4);

        }

    }
}
