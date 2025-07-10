package javabasics;

public class PolymorphismEx {
    public void Login(){
        System.out.println("Login done  ");
    }
    public void Login(String Unm)   //overloading
    {
        System.out.println("Login done"+" " +Unm);

    }
    public void Login(String Unm,String Pwd)   //overloading
    {
        System.out.println("Login done" +Unm+" "+Pwd);

    }

    public static void main(String[] args) {
      PolymorphismEx polyex=new PolymorphismEx();// overloading
      polyex.Login();
      polyex.Login("abc");
      polyex.Login("abc","123");
    }
}
