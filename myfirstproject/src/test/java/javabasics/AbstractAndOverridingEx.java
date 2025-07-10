package javabasics;

public class AbstractAndOverridingEx extends PolymorphismEx //called overriding
{
    public void Login(){
        System.out.println("child class code");
    }
    public static void main(String[] args) {
        AbstractAndOverridingEx abstractAndOverridingEx=new AbstractAndOverridingEx();
        abstractAndOverridingEx.Login();
        abstractAndOverridingEx.Login("aaa");
    }

}
